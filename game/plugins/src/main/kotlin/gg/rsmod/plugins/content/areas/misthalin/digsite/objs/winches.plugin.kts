package gg.rsmod.plugins.content.areas.misthalin.digsite.objs

on_obj_option(obj = 2350, option = "operate") {
    player.queue { wait(2) }
    player.moveTo(x = 3352, z = 9753)
}

on_obj_option(obj = 2351, option = "operate") {
    player.queue { wait(2) }
    player.moveTo(x = 3369, z = 9763)
}

on_obj_option(obj = 2352, option = "climb-up") {
    player.queue { wait(2) }
    player.moveTo(x = 3354, z = 3417)
}

on_obj_option(obj = 2353, option = "climb-up") {
    player.queue { wait(2) }
    player.moveTo(x = 3370, z = 3427)
}