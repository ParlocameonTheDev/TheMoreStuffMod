package msmteam.morestuffmod.common.block.entity;

import msmteam.morestuffmod.common.StuffModContent;
import msmteam.morestuffmod.util.CoordEntry;
import net.fabricmc.fabric.api.block.entity.BlockEntityClientSerializable;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.CompoundTag;

import java.util.ArrayList;

public class TeleporterBlockEntity extends BlockEntity implements BlockEntityClientSerializable {
    public TeleporterBlockEntity() {
        super(StuffModContent.TELEPORTER_BLOCK_ENTITY_TYPE);
    }

    private double x;
    private double y;
    private double z;

    public ArrayList<CoordEntry> coordData = new ArrayList<>();

    @Override
    public CompoundTag toTag(CompoundTag tag) {
        super.toTag(tag);
        tag.putDouble("CoordEntryX", x);
        tag.putDouble("CoordEntryY", y);
        tag.putDouble("CoordEntryZ", z);
        return tag;
    }

    @Override
    public void fromTag(BlockState state, CompoundTag tag) {
        super.fromTag(state, tag);
        x = tag.getDouble("CoordEntryX");
        y = tag.getDouble("CoordEntryY");
        z = tag.getDouble("CoordEntryZ");
    }

    @Override
    public void fromClientTag(CompoundTag tag) {
        fromTag(getCachedState(), tag);
    }

    @Override
    public CompoundTag toClientTag(CompoundTag tag) {
        toTag(tag);
        return tag;
    }
}
