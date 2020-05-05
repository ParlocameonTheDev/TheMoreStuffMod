package maowcraft.stuffmodport.util;

import net.minecraft.util.math.BlockPos;

public class CoordEntry {
    private double x;
    private double y;
    private double z;

    public CoordEntry(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public BlockPos getBlockPos() {
        return new BlockPos(x, y, z);
    }
}
