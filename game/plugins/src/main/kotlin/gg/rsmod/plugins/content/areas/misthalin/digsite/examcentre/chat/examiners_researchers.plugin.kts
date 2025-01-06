package gg.rsmod.plugins.content.areas.misthalin.digsite.examcentre.chat

private val CHATTERS =
    setOf(3636, 3635, 3637, 3638)

CHATTERS.forEach {chat ->
    on_npc_option(npc = chat, option = "talk-to") {
        player.queue { completedDigSite() }
    }
}

suspend fun QueueTask.completedDigSite() {
    chatNpc(message = "Hello there! My colleague tells me you helped to uncover a hidden altar to the god Zaros.")
    chatNpc(message = "A great scholar and archaeologist indeed! Good health and prosperity to you.")
    when (options("Thanks.", "I have lost my trowel.")) {
        1 -> {
            chatPlayer("Thanks.")
        }
        2 -> {
            chatPlayer("I have lost my trowel.")
            if (!player.inventory.contains(Items.TROWEL)) {
                chatNpc("Deary me... That was a good one as well. It's a good job I have another. Here you go...")
                itemMessageBox(message = player.getInteractingNpc().name + " give you a twowel.", item = Items.TROWEL)
                player.inventory.add(Items.TROWEL, 1)
            }
            else {
                chatNpc("Really? Look in your backpack and make sure first.")
            }
        }
    }
}