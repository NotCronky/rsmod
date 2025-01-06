package gg.rsmod.plugins.content.areas.misthalin.barbarianvillage.objs

on_obj_option(obj = 20790, option = "climb-down") {
    player.queue {
        //Player climb down anim
        wait(2)
        player.moveTo(x = 1860, z = 5244)
    }
}