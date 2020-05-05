package msmteam.morestuffmod.client.gui.screen;

import io.github.cottonmc.cotton.gui.client.CottonInventoryScreen;
import msmteam.morestuffmod.client.gui.controller.TeleporterController;
import net.minecraft.entity.player.PlayerEntity;

public class TeleporterScreen extends CottonInventoryScreen<TeleporterController> {
    public TeleporterScreen(TeleporterController container, PlayerEntity player) {
        super(container, player);
    }
}
