package gg.rsmod.plugins.content.areas.misthalin.digsite.chat

on_npc_option(npc = 3632, option = "talk-to") {
    player.queue { chatNpc("Oh, hi again. News of your find has spread fast; you are quite famous around here now.") }
}

on_npc_option(npc = 3633, option = "talk-to") {
    player.queue { chatNpc("Hey it's the great explorer! Thanks a lot for the help earlier!") }
}

on_npc_option(npc = 3634, option = "talk-to") {
    player.queue {
        chatPlayer("Hello there.")
        chatNpc("Hi there! Thanks again. Hey, maybe I'll be asking you for help next time. It seems you are something of an expert now!")
    }
}