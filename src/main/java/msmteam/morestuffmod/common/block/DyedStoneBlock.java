package msmteam.morestuffmod.common.block;

import msmteam.morestuffmod.util.DyedStoneColor;
import net.minecraft.block.Block;

public class DyedStoneBlock extends Block {
    public String name;

    public DyedStoneBlock(Settings settings, DyedStoneColor color) {
        super(settings);
        String prefix = color.prefix;
        name = prefix + "dyed_stone";
    }
}

