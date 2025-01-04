package gg.rsmod.plugins.content.skills

import gg.rsmod.game.model.attr.LEVEL_UP_INCREMENT
import gg.rsmod.game.model.attr.LEVEL_UP_SKILL_ID

set_level_up_logic {
    val skill = player.attr[LEVEL_UP_SKILL_ID]!!
    val increment = player.attr[LEVEL_UP_INCREMENT]!!

    if (Skills.isCombat(skill)) {
        player.calculateAndSetCombatLevel()
    }

    player.queue {
        levelUpMessageBox(skill, increment)
    }
}