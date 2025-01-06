package gg.rsmod.plugins.content.areas.misthalin.barbarianvillage.chat

on_npc_option(npc = Npcs.SIGURD, option = "talk-to") {
    player.queue { dialog() }
}

suspend fun QueueTask.dialog() {
    chatPlayer("Hello there.")
    chatNpc("Ha Ha! Hello!")
    when (options("Who are you?", "Can you teach me about Canoeing?")) {
        1 -> {
            chatPlayer("Who are you?")
            chatNpc("I'm Sigurd the Great and Brainy.")
            chatPlayer("Why do they call you the Great and Brainy?")
            chatNpc("Because I invented the Log Canoe!")
            chatPlayer("Log Canoe?")
            chatNpc("Yeash! Me and my cousins were having a great party by the river when we decided to have a game of 'Smack The Tree'")
            chatPlayer("Smack the Tree?")
            chatNpc("It's a game were you take it in turnsh shmacking a tree. First one to uproot the tree winsh!")
            chatNpc("Anyway, I won the game with a flying tackle. The tree came loose and down the river bank I went, still holding the tree.")
            chatNpc("I woke up a few hours later and found myself several miles down river. And thatsh how I invented the log canoe!")
            chatPlayer("So you invented the 'Log Canoe' by falling into a river hugging a tree?")
            chatNpc("Well I refined the design from the original you know!")
            chatNpc("I cut all the branches off to make it more comfortable. I could tell you how to if you like?")
            when (options("Yes", "No")) {
                1 -> {
                    player.queue { aboutCanoeing() }
                }
                2 -> {
                    chatPlayer("No thanks, not right now.")
                }
            }
        }
        2 -> {
            player.queue { aboutCanoeing() }
        }
    }
}

suspend fun QueueTask.aboutCanoeing() {
    chatPlayer("Can you teach me about canoes?")
    val wcCurrentLvl = player.getSkills().get(Skills.WOODCUTTING).currentLevel
    if (wcCurrentLvl < 12) {
        chatNpc("Well, you don't look like you have the skill to make a canoe.")
        chatNpc("You need to have at least level 12 woodcutting.")
        chatNpc("Once you are able to make a canoe it makes travel along the river much quicker!")

    }
    else if (wcCurrentLvl >= 12) {
        chatNpc("It's really quite simple. Just walk down to that tree on the bank and chop it down.")
        chatNpc("Then take your axe to it and shape it how you like!")
        if (wcCurrentLvl in 12..26) {
            chatNpc("You can make a log canoe like mine! It'll get you 1 stop down the river.")
            chatNpc("There's some snooty fella down near the Champions Guild who reckons his canoes are better than mine. He's never said it to my face though.")
        }
        else if (wcCurrentLvl in 27..41) {
            chatNpc("You could make a Dugout canoe with your woodcutting skill, but I don't see why you would want to.")
        }
        else if (wcCurrentLvl in 42..56) {
            chatNpc("Well, you're pretty handy with an axe!")
            chatNpc("You could make Stable Dugout canoes, like that snooty fella Tarquin.")
            chatNpc("He reckons his canoes are better than mine. He's never said it to my face though.")
        }
        else {
            chatNpc("You look like you know your way around a tree, you can make a Waka canoe.")
            chatPlayer("What's a Waka?")
            chatNpc("I've only ever seen Hari using them. People say he's found a way to canoe the river underground and into the Wilderness")
            chatNpc("Hari hangs around up near Edgeville")
            chatNpc("He's a nice bloke")
        }
    }
}