package maowcraft.stuffmodport.common.block;

import maowcraft.stuffmodport.StuffMod;
import maowcraft.stuffmodport.common.StuffModContent;
import maowcraft.stuffmodport.common.block.entity.TeleporterBlockEntity;
import maowcraft.stuffmodport.common.item.TeleporterEye;
import maowcraft.stuffmodport.util.CoordEntry;
import net.fabricmc.fabric.api.container.ContainerProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class TeleporterBlock extends Block implements BlockEntityProvider {
    public TeleporterBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockView world) {
        return new TeleporterBlockEntity();
    }

    @SuppressWarnings("deprecation")
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        BlockEntity entity = world.getBlockEntity(pos);
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack != null && itemStack.equals(new ItemStack(StuffModContent.TELEPORTER_EYE))) {
            if (entity instanceof TeleporterBlockEntity) {
                TeleporterEye eye = ((TeleporterEye) itemStack.getItem());
                ((TeleporterBlockEntity) entity).coordData.add(new CoordEntry(eye.getX(), eye.getY(), eye.getZ()));
                return ActionResult.SUCCESS;
            }
        } else {
            if (world.isClient()) return ActionResult.PASS;
            if (entity instanceof TeleporterBlockEntity) {
                ContainerProviderRegistry.INSTANCE.openContainer(new Identifier(StuffMod.MODID, "teleporter"), player, (packetByteBuf -> packetByteBuf.writeBlockPos(pos)));
            }
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }
}
