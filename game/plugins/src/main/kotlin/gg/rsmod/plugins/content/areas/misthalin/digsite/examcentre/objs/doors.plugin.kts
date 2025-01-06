package gg.rsmod.plugins.content.areas.misthalin.digsite.examcentre.objs

on_obj_option(obj = 17316, option = "open") {
    if (player.faceDirection == Direction.NORTH) {
        player.moveTo(x = player.tile.x, z = player.tile.z + 1)
    }
    else if (player.faceDirection == Direction.SOUTH) {
        player.moveTo(x = player.tile.x, z = player.tile.z - 1)
    }
    else if (player.faceDirection == Direction.EAST) {
        player.moveTo(x = player.tile.x + 1, z = player.tile.z)
    }
    else if (player.faceDirection == Direction.WEST) {
        player.moveTo(x = player.tile.x - 1, z = player.tile.z)
    }
}