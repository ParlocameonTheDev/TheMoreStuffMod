package msmteam.morestuffmod;

import msmteam.morestuffmod.common.StuffModContent;
import msmteam.morestuffmod.client.gui.controller.TeleporterController;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.container.ContainerProviderRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StuffMod implements ModInitializer {
    public static final String MODID = "stuffmodport";

    public static final ItemGroup TAB = FabricItemGroupBuilder.build(new Identifier(MODID, "tab"), () -> new ItemStack(Items.STONE));

    private static final Logger LOGGER = LogManager.getLogger(MODID);

    @Override
    public void onInitialize() {
        LOGGER.info("TheStuffMod-Fabric has initialized.");
        StuffModContent.registerAll();

        ContainerProviderRegistry.INSTANCE.registerFactory(new Identifier(MODID, "teleporter"), (syncId, id, player, buf) -> new TeleporterController(syncId, player.inventory, ScreenHandlerContext.create(player.world, buf.readBlockPos())));
    }
}
