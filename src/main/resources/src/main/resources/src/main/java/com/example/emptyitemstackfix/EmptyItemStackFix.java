package com.example.emptyitemstackfix;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmptyItemStackFix implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("EmptyItemStackFix");

    @Override
    public void onInitialize() {
        LOGGER.info("EmptyItemStackFix initialized - will return empty NBT for empty ItemStacks to avoid save crashes.");
    }
}
