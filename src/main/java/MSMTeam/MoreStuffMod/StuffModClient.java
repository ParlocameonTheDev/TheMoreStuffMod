package msmteam.morestuffmod;

import msmteam.morestuffmod.client.gui.controller.TeleporterController;
import msmteam.morestuffmod.client.gui.screen.TeleporterScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.client.screen.ScreenProviderRegistry;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class StuffModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenProviderRegistry.INSTANCE.registerFactory(new Identifier(StuffMod.MODID, "teleporter"), (syncId, identifier, player, buf) -> new TeleporterScreen(new TeleporterController(syncId, player.inventory, ScreenHandlerContext.create(player.world, buf.readBlockPos())), player));
    }
}
