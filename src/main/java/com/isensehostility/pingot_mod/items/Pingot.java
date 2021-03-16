package com.isensehostility.pingot_mod.items;

import net.minecraft.client.gui.screen.Screen;
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

public class Pingot extends Item {
    public Pingot() {
        super(new Item.Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(5)
                        .meat()
                        .saturation(0.6F)
                        .build())

        );
    }

    @Override
    public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
        super.addInformation(itemstack, world, list, flag);
        list.add(new TranslationTextComponent(TextFormatting.GRAY + I18n.format("item.pingot_mod.pingot.tooltip")));
    }
}
