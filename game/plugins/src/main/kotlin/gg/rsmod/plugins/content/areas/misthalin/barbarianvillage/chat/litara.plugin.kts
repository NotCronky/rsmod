package gg.rsmod.plugins.content.areas.misthalin.barbarianvillage.chat

//NEED TO ADD THE SEARCH FOR HER BROTHER CHECK//

on_npc_option(npc = Npcs.LITARA, option = "talk-to") {
    player.queue { dialog() }
}

suspend fun QueueTask.dialog() {
    chatNpc("Hello there. You look lost, are you okay?")
    when (options("I'm looking for a stronghold or something...", "I'm fine, just passing through.")) {
        1 -> {
            chatPlayer("I'm looking for a stronghold or something...")
            chatNpc("Ahh... the Stronghold of Security. It's down there.")
            messageBox("Litara point's on the hole in the ground that looks like you could squeeze through.")
            chatPlayer("Looks kind of... deep and dark.")
            chatNpc("Yeah... tell that to my brother, he still hasn't come back.")
            chatPlayer("Your brother?")
            chatNpc("He's an explorer too. When the miner fell down that hole he'd made and came back babbling about doors, questions and treasure, my brother went to explore. No-one has seen him since.")
            chatPlayer("Oh... that's not good.")
            chatNpc("Lots of people have been down there, but none of them have seen him, Let me know if you do, will you?")
            chatPlayer("I'll certainly keep my eyes open.")
        }
        2 -> {
            chatPlayer("I'm fine, just passing through.")
        }
    }
}