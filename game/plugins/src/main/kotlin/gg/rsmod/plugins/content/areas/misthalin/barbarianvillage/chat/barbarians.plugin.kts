package gg.rsmod.plugins.content.areas.misthalin.barbarianvillage.chat

import kotlin.random.Random

private val BARBARIANS =
    setOf(3055, 3056, 3057, 3078, 3060, 3061, 3062, 3064, 3065, 3066, 3067, 3068, 3069, 3071, 3071, 3072)

var dialogOption = 0

BARBARIANS.forEach {chat ->
    on_npc_option(npc = chat, option = "talk-to") {
        player.queue { dialogs() }
    }
}

suspend fun QueueTask.dialogs() {
    dialogOption = Random.nextInt(1, 6)
    if (dialogOption == 1) {
        chatNpc("Wanna fight?")
        player.getInteractingNpc().attack(player)
    }
    else if (dialogOption == 2) {
        chatNpc("Ah, you come for a fight, ja?")
        player.getInteractingNpc().attack(player)
    }
    else if (dialogOption == 3) {
        chatNpc("You look funny.")
        player.getInteractingNpc().attack(player)
    }
    else if (dialogOption == 4) {
        chatNpc("Grrr!")
        player.getInteractingNpc().attack(player)
    }
    else if (dialogOption == 5) {
        chatNpc("What you want?")
        player.getInteractingNpc().attack(player)
    }
    else if (dialogOption == 6) {
        chatNpc("Go Away!")
        player.getInteractingNpc().attack(player)
    }
}