package com.yigitguven.leathercraft;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(LeatherCraft.MODID)
public class LeatherCraft {
    public static final String MODID = "leather_craft";

    public LeatherCraft(IEventBus modEventBus) {
        // No registration needed for vanilla recipes as they are data-driven
    }
}
