package com.creativemd.itemphysic.list;

import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemsWithMetaRegistryUndestroyable {
    public static List<ItemWithMetaUndestroyable> UndestroyableItems = new ArrayList<>();
    public static class ItemWithMetaUndestroyable {
        public final Item item;
        public final int metadata;
        public final boolean ignoremeta;

        public ItemWithMetaUndestroyable(Item item, int metadata, boolean ignoremeta) {
            this.item = item;
            this.metadata = metadata;
            this.ignoremeta = ignoremeta;
        }
    }
}
