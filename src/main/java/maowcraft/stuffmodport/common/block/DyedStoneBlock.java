package maowcraft.stuffmodport.common.block;

import maowcraft.stuffmodport.util.DyedStoneColor;
import net.minecraft.block.Block;

public class DyedStoneBlock extends Block {
    public String name;

    public DyedStoneBlock(Settings settings, DyedStoneColor color) {
        super(settings);
        String prefix = color.prefix;
        name = prefix + "dyed_stone";
    }
}

