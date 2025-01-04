package gg.rsmod.plugins.content.skills.prayer.burying

import gg.rsmod.plugins.api.cfg.Items

enum class BoneData (
    val bone: Int,
    val exp: Double
) {
    BONES(bone = Items.BONES, exp = 4.5),
    BURNT_BONES(bone = Items.BURNT_BONES, exp = 4.5),
    MONKEY_BONES(bone = Items.MONKEY_BONES, exp = 5.0),
    MONKEY_BONES_2(bone = Items.MONKEY_BONES_3180, exp = 5.0),
    MONKEY_BONES_3(bone = Items.MONKEY_BONES_3181, exp = 5.0),
    MONKEY_BONES_4(bone = Items.MONKEY_BONES_3182, exp = 5.0),
    MONKEY_BONES_5(bone = Items.MONKEY_BONES_3183, exp = 5.0),
    MONKEY_BONES_6(bone = Items.MONKEY_BONES_3185, exp = 5.0),
    MONKEY_BONES_7(bone = Items.MONKEY_BONES_3186, exp = 5.0),
    BAT_BONES(bone = Items.BAT_BONES, exp = 5.3),
    BIG_BONES(bone = Items.BIG_BONES, exp = 15.0),
    JOGRE_BONES(bone = Items.JOGRE_BONES, exp = 15.0),
    BABY_DRAGON_BONES(bone = Items.BABYDRAGON_BONES, exp = 30.0),
    WYRM_BONES(bone = Items.WYRM_BONES, exp = 50.0),
    WYVERN_BONES(bone = Items.WYVERN_BONES, exp = 50.0),
    DRAGON_BONES(bone = Items.DRAGON_BONES, exp = 72.0),
    LAVA_DRAGON_BONES(bone = Items.LAVA_DRAGON_BONES, exp = 85.0),
    SUPERIOR_DRAGON_BONES(bone = Items.SUPERIOR_DRAGON_BONES, exp = 150.0)
    ;

    companion object {
        val values = enumValues<BoneData>()
        val boneDefinitions = values.associateBy { it.bone }
    }
}