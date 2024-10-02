package com.creativemd.itemphysic.list;

import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemsWithMetaRegistryExplosion {
    public static List<ItemsWithMetaExplosion> ExplosionItems = new ArrayList<>();
    public static class ItemsWithMetaExplosion {
        public final Item item;
        public final int metadata;
        public final boolean ignoremeta;

        public ItemsWithMetaExplosion(Item item, int metadata, boolean ignoremeta) {
            this.item = item;
            this.metadata = metadata;
            this.ignoremeta = ignoremeta;
        }
    }
}
