package gg.rsmod.plugins.content.objs.prayerAltar

import gg.rsmod.plugins.content.mechanics.prayer.Prayers

private val ALTARS_PRAY_AT =
    setOf(Objs.ALTAR_409)

ALTARS_PRAY_AT.forEach { altar ->
    on_obj_option(obj = altar, option = "pray-at") {
        player.queue {
            player.animate(645)
            player.filterableMessage("You recharge your Prayer points.")
            Prayers.rechargePrayerPoints(player)
        }
    }
}