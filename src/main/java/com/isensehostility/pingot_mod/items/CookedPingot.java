package com.isensehostility.pingot_mod.items;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class CookedPingot extends Item {
    public CookedPingot() {
        super(new Item.Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(9)
                        .meat()
                        .saturation(1.6F)
                        .build())

        );
    }

    @Override
    public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
        super.addInformation(itemstack, world, list, flag);
        list.add(new TranslationTextComponent(TextFormatting.GRAY + I18n.format("item.pingot_mod.cooked_pingot.tooltip")));
    }
}