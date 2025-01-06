package gg.rsmod.plugins.content.areas.misthalin.barbarianvillage.chat

on_npc_option(npc = Npcs.HUNDING, option = "talk-to") {
    player.queue { dialog() }
}

suspend fun QueueTask.dialog() {
    chatPlayer("Hello.")
    chatNpc("What are you doing in our village, outlander?")
    when (options("Nothing much.", "I'm exploring.", "I came to kill you all!")) {
        1 -> {
            chatPlayer("Nothing much.")
            chatNpc("Bah! Go down to the longhall, and there you will find excitement aplenty! Our finest warrior, Gunthor the Brave, will give you a rousing welcome!")
            chatPlayer("I'll bear it in mind.")
        }
        2 -> {
            chatPlayer("I'm exploring.")
            chatNpc("Bah! You cannot hope to learn anything of us just by strolling through our village! We are an ancient tribe, our ways date back to the time before Avarrocka was founded!")
            when (options("Tell me about your tribe.", "You look like a load of primitive savages.", "I'm bored.", "I came to kill you all!")) {
                1 -> {
                    chatPlayer("Would you care to tell me more?")
                    chatNpc("Oh? You are not so ignorant as I thought. Very well, I shall speak of our tribe...")
                    chatNpc("Our elders remember that about a century ago we were living in the lands far to the west. We were a large nomadic mountain tribe, settling wherever there was food, moving on when it had run out. As the tribe")
                    chatNpc("grew larger, it was hard to find enough food for everyone, and we were forced to shift our camp more and more often. In time, a warrior called Gunnar took his friends and their families and left the larger tribe,")
                    chatNpc("moving south in search of new places. They eventually settled here and built this village, finding that the old nomadic traditions were no longer needed.")
                    chatNpc("Our current chieftain, Gunthor the Brave, is a direct- line descendent of Gunnar.")
                    chatNpc("However, our ways have changed little in the last century. Although more and more people use magical powers, we do not believe it is wise to take upon oneself the power of the gods in this way. To this day, we fight")
                    chatNpc("with the mighty sword, the vicious axe and the swift arrow on the wind. Some of our young, wishing to try so-called 'civilisation' and the softness of city life, abandon the tribe and move to the cities. It is sad to")
                    chatNpc("see them go, but we do not prevent them; we live here in our village because we love this life - we do not force it on those whom it does not suit.")
                    chatNpc("There, I have said enough.")
                    chatPlayer("Thank you.")
                }
                2 -> {
                    chatPlayer("You look like a load of primitive savages.")
                    chatNpc("And you look like an arrogant fool. And you smell like a raccoon's bottom.")
                }
                3 -> {
                    chatPlayer("I'm bored.")
                    chatNpc("Bah! Go down to the longhall, and there you will find excitement aplenty! Our finest warrior, Gunthor the Brave, will give you a rousing welcome!")
                    chatPlayer("I'll bear it in mind.")
                }
                4 -> {
                    chatPlayer("I came to kill you all!")
                    chatNpc("Ho ho! Brave words indeed from an outerlander! Go down to the longhall and try it!")
                }
            }
        }
        3 -> {

        }
    }
}