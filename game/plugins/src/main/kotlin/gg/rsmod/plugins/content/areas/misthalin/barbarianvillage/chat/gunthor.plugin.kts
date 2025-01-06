package gg.rsmod.plugins.content.areas.misthalin.barbarianvillage.chat

import kotlin.random.Random

var dialogOption = 0

on_npc_option(npc = Npcs.GUNTHOR_THE_BRAVE, option = "talk-to") {
    player.queue { dialogs() }
}

suspend fun QueueTask.dialogs() {
    dialogOption = Random.nextInt(1, 6)
    if (dialogOption == 1) {
        chatNpc("Ah, you've come for fight!")
        player.getInteractingNpc().attack(player)
    }
    else if (dialogOption == 2) {
        chatNpc("What do you want?")
        chatPlayer("What are you offering?")
        chatNpc("A fight!")
        player.getInteractingNpc().attack(player)
    }
    else if (dialogOption == 3) {
        chatNpc("You look funny!")
        player.getInteractingNpc().attack(player)
    }
    else if (dialogOption == 4) {
        chatNpc("Wanna fight?")
        player.getInteractingNpc().attack(player)
    }
    else if (dialogOption == 5) {
        chatNpc("Grrr!")
        player.getInteractingNpc().attack(player)
    }
    else if (dialogOption == 6) {
        chatNpc("Go away!")
        player.getInteractingNpc().attack(player)
    }
}