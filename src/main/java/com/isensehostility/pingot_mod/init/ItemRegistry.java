package com.isensehostility.pingot_mod.init;

import com.isensehostility.pingot_mod.Pingot;
import com.isensehostility.pingot_mod.items.CookedPingot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Pingot.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    public static final RegistryObject<com.isensehostility.pingot_mod.items.Pingot> PINGOT = ITEMS.register("pingot", com.isensehostility.pingot_mod.items.Pingot::new);
    public static final RegistryObject<CookedPingot> COOKED_PINGOT = ITEMS.register("cooked_pingot", CookedPingot::new);

}
