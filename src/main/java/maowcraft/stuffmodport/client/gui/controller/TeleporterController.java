package maowcraft.stuffmodport.client.gui.controller;

import io.github.cottonmc.cotton.gui.CottonCraftingController;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.WPlainPanel;
import maowcraft.stuffmodport.common.block.entity.TeleporterBlockEntity;
import maowcraft.stuffmodport.util.CoordEntry;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.world.World;

import java.util.ArrayList;


public class TeleporterController extends CottonCraftingController {
    public static BlockEntity blockEntity;

    public TeleporterController(int syncId, PlayerInventory playerInventory, ScreenHandlerContext context) {
        super(RecipeType.SMELTING, syncId, playerInventory, getBlockInventory(context), getBlockPropertyDelegate(context));
        blockEntity = context.run(World::getBlockEntity).get();

        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(100, 150);

        root.validate(this);
    }

    public static class CoordList extends WPlainPanel {
        WLabel label;
        WButton button;

        BlockEntity blockEntity = TeleporterController.blockEntity;

        public CoordList() {
            if (blockEntity instanceof TeleporterBlockEntity) {
                for (CoordEntry entry : ((TeleporterBlockEntity) blockEntity).coordData) {
                    label = new WLabel("");
                    this.add(label, 18 + 4, 4 * ((TeleporterBlockEntity) blockEntity).coordData.size(), 1, 1);
                }
            }
        }
    }
}
