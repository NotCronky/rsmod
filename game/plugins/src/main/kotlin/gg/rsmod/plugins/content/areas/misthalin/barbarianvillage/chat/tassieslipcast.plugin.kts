package gg.rsmod.plugins.content.areas.misthalin.barbarianvillage.chat

on_npc_option(npc = Npcs.TASSIE_SLIPCAST, option = "talk-to") {
    player.queue {
        chatNpc("Please feel free to use the pottery wheel, I won't be using it all the time. Put your pots in the kiln when you've made one.")
        chatNpc("And make sure you tidy up after yourself!")
    }
}