package gg.rsmod.plugins.content.areas.lumbridge.chat

spawn_npc(Npcs.HANS, 3219,3223,0, 0, Direction.EAST)

on_npc_option(npc = Npcs.HANS, option = "talk-to") {
    player.queue { menu() }
}

on_npc_option(npc = Npcs.HANS, option = "age") {
    player.queue { age() }
}

suspend fun QueueTask.menu() {
    chatNpc(message = "Hello. What are you doing here?")
    when (options("I'm looking for whoever is in charge of this place.", "I have come to kill everyone in this castle!", "I don't know. I'm lost. Where am I?", "Can you tell me how long I've been here?", "Nothing.")) {
        1 -> {
            chatPlayer(message = "I'm looking for whoever is in charge of this place.")
            chatNpc("Who, the Duke? He's in his study, on the first floor.")
        }
        2 -> {
            chatPlayer(message = "I have come to kill everyone in this castle!")
            //player.getInteractingNpc().walkTo(x = 3222, z = 3219, stepType = MovementQueue.StepType.FORCED_RUN)
            player.getInteractingNpc().forceChat("Help! Help!")
        }
        3 -> {
            chatPlayer(message = "I don't know. I'm lost. Where am I?")
            chatNpc(message = "You are in Lumbridge Castle.")
        }
        4 -> {
            chatPlayer(message = "Can you tell me how long I've been here?")
            chatNpc(message = "Ahh, I see all the newcomers arriving in Lumbridge, fresh-faced and eager for adventure. I remember you...")
            chatNpc(message = "You've spent [amount] days, [amount] hours, [amount] minutes in the world since you arrived [amount] days ago.")
        }
        5 -> {
            chatPlayer(message = "Nothing.")
        }
    }
}

suspend fun QueueTask.age() {
    chatNpc(message = "You've spent [amount] days, [amount] hours, [amount] minutes in the world since you arrived [amount] days ago.")
}