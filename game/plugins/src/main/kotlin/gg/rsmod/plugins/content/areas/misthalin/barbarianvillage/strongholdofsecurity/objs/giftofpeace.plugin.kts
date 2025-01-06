package gg.rsmod.plugins.content.areas.misthalin.barbarianvillage.strongholdofsecurity.objs

import gg.rsmod.plugins.content.inter.emotes.Emote
import net.runelite.http.api.hiscore.Skill

on_obj_option(20656, "open") {
    if (player.getVarp(12) != 1) {
        player.inventory.add(995, 2000)
        player.getSkills().restore(Skills.PRAYER)
        player.getSkills().restore(Skills.HITPOINTS)
        player.setCurrentHp(player.getMaxHp())
        player.setVarp(12, 1)
    }
    else
    {
        player.filterableMessage("You have already received the Gift of Peace.")
    }
    //unlock flap emote
}