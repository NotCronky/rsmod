package gg.rsmod.plugins.content.areas.misthalin.digsite.examcentre.chat

on_npc_option(npc = Npcs.ARCHAEOLOGICAL_EXPERT, option = "talk-to") {
    player.queue { dialogs() }
}

suspend fun QueueTask.dialogs() {
    when(options("Ask about the Desert Treasure I quest.", "Ask about the Digsite quest.")) {
        1 -> {
            chatNpc("Hello again.<br>Was that translation any use to Asgarnia?")
            chatPlayer("I think it was, thanks!")
        }
        2 -> {
            chatNpc("Hello again. I am now studying this mysterious altar and its inhabitants. The markings are strange...")
            chatNpc("It refers to a god I have never heard of before, named Zaros. It must be some pagan superstition.")
            chatNpc("That was a great find; who knows what other secrets lie buried beneath the surface of our land...")
        }
    }
}