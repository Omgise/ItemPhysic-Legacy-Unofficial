package com.creativemd.itemphysic;

import com.creativemd.itemphysic.physics.ServerPhysic;
import net.minecraft.client.resources.I18n;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;

public class ItemPhysicHandler {
    @SubscribeEvent
    public void drawTooltip(ItemTooltipEvent event) {
        if (event.itemStack != null) {
            if(ServerPhysic.canItemIgnite(event.itemStack)){
                event.toolTip.add(EnumChatFormatting.GOLD + "[" + I18n.format("itemphysic.igniting") + "]");
            }
        }
    }
}
