package gg.rsmod.plugins.content.areas.misthalin.barbarianvillage.chat

on_npc_option(npc = Npcs.PEKSA, option = "trade") {
    player.openShop("Peksa's Helmet Shop.")
}

on_npc_option(npc = Npcs.PEKSA, option = "talk-to") {
    player.queue {
        chatNpc(message = "Are you interested in buying or selling a helmet?")
        when(this.options("I could be, yes.", "No, I'll pass on that.")) {
            1 -> {
                chatPlayer(message = "I could be, yes.")
                player.openShop("Peksa's Helmet Shop.")
            }
            2 -> {
                chatPlayer(message = "No, I'll pass on that.")
                chatNpc(message = "Well, come back if you change your mind.")
            }
        }
    }
}

