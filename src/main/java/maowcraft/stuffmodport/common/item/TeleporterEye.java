package maowcraft.stuffmodport.common.item;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class TeleporterEye extends Item {
    private double x;
    private double y;
    private double z;

    public boolean teleportSet;

    public TeleporterEye(Settings settings) {
        super(settings);
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }

    public void fromTag(BlockState state, CompoundTag tag) {
        x = tag.getDouble("CoordEntryX");
        y = tag.getDouble("CoordEntryY");
        z = tag.getDouble("CoordEntryZ");
    }

    public CompoundTag toTag(CompoundTag tag) {
        tag.putDouble("CoordEntryX", x);
        tag.putDouble("CoordEntryY", y);
        tag.putDouble("CoordEntryZ", z);
        return tag;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!teleportSet) {
            x = user.getX();
            y = user.getY();
            z = user.getZ();
            teleportSet = true;
        }
        return TypedActionResult.pass(null);
    }
}
