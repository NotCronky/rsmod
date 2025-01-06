package gg.rsmod.plugins.content.areas.misthalin.barbarianvillage.objs

on_obj_option(obj = 17026, option = "climb-up") {
    player.queue {
        wait(2)
        player.moveTo(x = player.tile.x, z = player.tile.z, height = player.tile.height + 1)
    }
}

on_obj_option(obj = 16685, option = "climb-down") {
    player.queue {
        wait(2)
        player.moveTo(x = player.tile.x, z = player.tile.z, height = player.tile.height - 1)
    }
}

//DOOR - OOPS
on_obj_option(obj = 11616, option = "open") {
    player.queue {
        if (player.faceDirection == Direction.NORTH) {
            wait(2)
            player.moveTo(x = player.tile.x, z = player.tile.z + 1)
        }
        else {
            wait(2)
            player.moveTo(x = player.tile.x, z = player.tile.z - 1)
        }
    }
}