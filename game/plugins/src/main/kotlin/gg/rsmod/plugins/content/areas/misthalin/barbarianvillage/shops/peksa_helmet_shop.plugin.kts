package gg.rsmod.plugins.content.areas.misthalin.barbarianvillage.shops

import gg.rsmod.plugins.content.mechanics.shops.CoinCurrency

create_shop("Peksa's Helmet Shop.", CoinCurrency(), purchasePolicy = PurchasePolicy.BUY_STOCK) {
    items[0] = ShopItem(item = Items.BRONZE_MED_HELM, amount = 5, sellPrice = 24, buyPrice = 14, resupplyAmount = 1, resupplyCycles = 100)
    items[1] = ShopItem(item = Items.IRON_MED_HELM, amount = 3, sellPrice = 84, buyPrice = 50, resupplyAmount = 1, resupplyCycles = 200)
    items[2] = ShopItem(item = Items.STEEL_MED_HELM, amount = 3, sellPrice = 300, buyPrice = 180, resupplyAmount = 1, resupplyCycles = 400)
    items[3] = ShopItem(item = Items.MITHRIL_MED_HELM, amount = 1, sellPrice = 780, buyPrice = 468, resupplyAmount = 1, resupplyCycles = 3000)
    items[4] = ShopItem(item = Items.ADAMANT_MED_HELM, amount = 1, sellPrice = 1920, buyPrice = 1152, resupplyAmount = 1, resupplyCycles = 12000)
    items[5] = ShopItem(item = Items.BRONZE_FULL_HELM, amount = 4, sellPrice = 44, buyPrice = 26, resupplyAmount = 1, resupplyCycles = 100)
    items[6] = ShopItem(item = Items.IRON_FULL_HELM, amount = 3, sellPrice = 154, buyPrice = 92, resupplyAmount = 1, resupplyCycles = 200)
    items[7] = ShopItem(item = Items.STEEL_FULL_HELM, amount = 2, sellPrice = 550, buyPrice = 330, resupplyAmount = 1, resupplyCycles = 400)
    items[8] = ShopItem(item = Items.MITHRIL_FULL_HELM, amount = 1, sellPrice = 1430, buyPrice = 858, resupplyAmount = 1, resupplyCycles = 3000)
    items[9] = ShopItem(item = Items.ADAMANT_FULL_HELM, amount = 1, sellPrice = 3520, buyPrice = 2112, resupplyAmount = 1, resupplyCycles = 12000)
}