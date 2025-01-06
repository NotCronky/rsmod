package gg.rsmod.plugins.content.areas.misthalin.barbarianvillage.strongholdofsecurity.objs

on_obj_option(obj = 19207, option = "open") {
    player.queue {
        //play door open anim
        wait(2)
        if (player.faceDirection == Direction.SOUTH) {
            player.moveTo(x = player.tile.x, z = player.tile.z - 2)
        }
        else if (player.faceDirection == Direction.NORTH) {
            player.moveTo(x = player.tile.x, z = player.tile.z + 2)
        }
        else if (player.faceDirection == Direction.EAST) {
            player.moveTo(x = player.tile.x + 2, z = player.tile.z)
        }
        else if (player.faceDirection == Direction.WEST) {
            player.moveTo(x = player.tile.x - 2, z = player.tile.z)
        }
    }
}

on_obj_option(obj = 19206, option = "open") {
    player.queue {
        //play door open anim
        wait(2)
        if (player.faceDirection == Direction.SOUTH) {
            player.moveTo(x = player.tile.x, z = player.tile.z - 2)
        }
        else if (player.faceDirection == Direction.NORTH) {
            player.moveTo(x = player.tile.x, z = player.tile.z + 2)
        }
        else if (player.faceDirection == Direction.EAST) {
            player.moveTo(x = player.tile.x + 2, z = player.tile.z)
        }
        else if (player.faceDirection == Direction.WEST) {
            player.moveTo(x = player.tile.x - 2, z = player.tile.z)
        }
    }
}