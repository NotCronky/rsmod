package gg.rsmod.plugins.content.skills.prayer.burying

import net.runelite.http.api.hiscore.Skill
import java.util.concurrent.locks.Lock

val boneData = BoneData.values
val definitions = BoneData.boneDefinitions
val bones = boneData.map { it.bone }.toTypedArray()

bones.forEach { bone ->
    on_item_option(bone, option = "bury") {
            player.lock = LockState.DELAY_ACTIONS
            player.queue(TaskPriority.STRONG) {
                player.filterableMessage("You dig a hole in the ground...")
                player.animate(827)
                player.playSound(2738)

                wait(2)

                if (player.inventory.remove(item = bone, beginSlot = player.getInteractingSlot()).hasSucceeded()) {
                    player.filterableMessage("You bury the bones.")
                    player.addXp(Skills.PRAYER, definitions[bone]!!.exp)
                }
            }
            player.lock = LockState.NONE
        }
    }