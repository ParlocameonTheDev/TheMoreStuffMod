package msmteam.morestuffmod.common;

import msmteam.morestuffmod.StuffMod;
import msmteam.morestuffmod.common.block.DyedStoneBlock;
import msmteam.morestuffmod.common.block.TeleporterBlock;
import msmteam.morestuffmod.common.block.entity.TeleporterBlockEntity;
import msmteam.morestuffmod.util.DyedStoneColor;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class StuffModContent {
    // Dyed Stone
    public static final DyedStoneBlock WHITE_DYED_STONE;
    public static final DyedStoneBlock LIGHT_GRAY_DYED_STONE;
    public static final DyedStoneBlock GRAY_DYED_STONE;
    public static final DyedStoneBlock BLACK_DYED_STONE;
    public static final DyedStoneBlock BROWN_DYED_STONE;
    public static final DyedStoneBlock RED_DYED_STONE;
    public static final DyedStoneBlock ORANGE_DYED_STONE;
    public static final DyedStoneBlock YELLOW_DYED_STONE;
    public static final DyedStoneBlock LIME_DYED_STONE;
    public static final DyedStoneBlock GREEN_DYED_STONE;
    public static final DyedStoneBlock CYAN_DYED_STONE;
    public static final DyedStoneBlock LIGHT_BLUE_DYED_STONE;
    public static final DyedStoneBlock BLUE_DYED_STONE;
    public static final DyedStoneBlock PURPLE_DYED_STONE;
    public static final DyedStoneBlock MAGENTA_DYED_STONE;
    public static final DyedStoneBlock PINK_DYED_STONE;

    // Other Blocks
    public static final TeleporterBlock TELEPORTER;

    // Block Entities
    public static BlockEntityType<TeleporterBlockEntity> TELEPORTER_BLOCK_ENTITY_TYPE;

    // Other Items
    public static final Item TELEPORTER_EYE;

    static {
        // Dyed Stone
        WHITE_DYED_STONE = new DyedStoneBlock(FabricBlockSettings.of(Material.STONE), DyedStoneColor.WHITE);
        LIGHT_GRAY_DYED_STONE = new DyedStoneBlock(FabricBlockSettings.of(Material.STONE), DyedStoneColor.BLACK);
        GRAY_DYED_STONE = new DyedStoneBlock(FabricBlockSettings.of(Material.STONE), DyedStoneColor.GRAY);
        BLACK_DYED_STONE = new DyedStoneBlock(FabricBlockSettings.of(Material.STONE), DyedStoneColor.LIGHT_GRAY);
        BROWN_DYED_STONE = new DyedStoneBlock(FabricBlockSettings.of(Material.STONE), DyedStoneColor.BROWN);
        RED_DYED_STONE = new DyedStoneBlock(FabricBlockSettings.of(Material.STONE), DyedStoneColor.RED);
        ORANGE_DYED_STONE = new DyedStoneBlock(FabricBlockSettings.of(Material.STONE), DyedStoneColor.ORANGE);
        YELLOW_DYED_STONE = new DyedStoneBlock(FabricBlockSettings.of(Material.STONE), DyedStoneColor.YELLOW);
        LIME_DYED_STONE = new DyedStoneBlock(FabricBlockSettings.of(Material.STONE), DyedStoneColor.LIME);
        GREEN_DYED_STONE = new DyedStoneBlock(FabricBlockSettings.of(Material.STONE), DyedStoneColor.GREEN);
        CYAN_DYED_STONE = new DyedStoneBlock(FabricBlockSettings.of(Material.STONE), DyedStoneColor.CYAN);
        LIGHT_BLUE_DYED_STONE = new DyedStoneBlock(FabricBlockSettings.of(Material.STONE), DyedStoneColor.LIGHT_BLUE);
        BLUE_DYED_STONE = new DyedStoneBlock(FabricBlockSettings.of(Material.STONE), DyedStoneColor.BLUE);
        PURPLE_DYED_STONE = new DyedStoneBlock(FabricBlockSettings.of(Material.STONE), DyedStoneColor.PURPLE);
        MAGENTA_DYED_STONE = new DyedStoneBlock(FabricBlockSettings.of(Material.STONE), DyedStoneColor.MAGENTA);
        PINK_DYED_STONE = new DyedStoneBlock(FabricBlockSettings.of(Material.STONE), DyedStoneColor.PINK);

        // Other Blocks
        TELEPORTER = new TeleporterBlock(FabricBlockSettings.of(Material.METAL));

        // Other Items
        TELEPORTER_EYE = new Item(new Item.Settings().group(StuffMod.TAB));
    }

    public static void registerAll() {
        registerBlocks();
        registerBlockEntities();
        registerItemBlocks();
        registerItems();
    }

    private static void registerBlocks() {
        // Dyed Stone
        Registry.register(Registry.BLOCK, new Identifier(StuffMod.MODID, DyedStoneColor.WHITE.name), WHITE_DYED_STONE);
        Registry.register(Registry.BLOCK, new Identifier(StuffMod.MODID, DyedStoneColor.LIGHT_GRAY.name), LIGHT_GRAY_DYED_STONE);
        Registry.register(Registry.BLOCK, new Identifier(StuffMod.MODID, DyedStoneColor.GRAY.name), GRAY_DYED_STONE);
        Registry.register(Registry.BLOCK, new Identifier(StuffMod.MODID, DyedStoneColor.BLACK.name), BLACK_DYED_STONE);
        Registry.register(Registry.BLOCK, new Identifier(StuffMod.MODID, DyedStoneColor.BROWN.name), BROWN_DYED_STONE);
        Registry.register(Registry.BLOCK, new Identifier(StuffMod.MODID, DyedStoneColor.RED.name), RED_DYED_STONE);
        Registry.register(Registry.BLOCK, new Identifier(StuffMod.MODID, DyedStoneColor.ORANGE.name), ORANGE_DYED_STONE);
        Registry.register(Registry.BLOCK, new Identifier(StuffMod.MODID, DyedStoneColor.YELLOW.name), YELLOW_DYED_STONE);
        Registry.register(Registry.BLOCK, new Identifier(StuffMod.MODID, DyedStoneColor.LIME.name), LIME_DYED_STONE);
        Registry.register(Registry.BLOCK, new Identifier(StuffMod.MODID, DyedStoneColor.GREEN.name), GREEN_DYED_STONE);
        Registry.register(Registry.BLOCK, new Identifier(StuffMod.MODID, DyedStoneColor.CYAN.name), CYAN_DYED_STONE);
        Registry.register(Registry.BLOCK, new Identifier(StuffMod.MODID, DyedStoneColor.LIGHT_BLUE.name), LIGHT_BLUE_DYED_STONE);
        Registry.register(Registry.BLOCK, new Identifier(StuffMod.MODID, DyedStoneColor.BLUE.name), BLUE_DYED_STONE);
        Registry.register(Registry.BLOCK, new Identifier(StuffMod.MODID, DyedStoneColor.PURPLE.name), PURPLE_DYED_STONE);
        Registry.register(Registry.BLOCK, new Identifier(StuffMod.MODID, DyedStoneColor.MAGENTA.name), MAGENTA_DYED_STONE);
        Registry.register(Registry.BLOCK, new Identifier(StuffMod.MODID, DyedStoneColor.PINK.name), PINK_DYED_STONE);

        // Other Blocks
        Registry.register(Registry.BLOCK, new Identifier(StuffMod.MODID, "teleporter"), TELEPORTER);
    }

    private static void registerBlockEntities() {
        TELEPORTER_BLOCK_ENTITY_TYPE = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(StuffMod.MODID, "teleporter"), BlockEntityType.Builder.create(TeleporterBlockEntity::new, TELEPORTER).build(null));
    }

    private static void registerItemBlocks() {
        // Dyed Stone
        Registry.register(Registry.ITEM, new Identifier(StuffMod.MODID, DyedStoneColor.WHITE.name), new BlockItem(WHITE_DYED_STONE, new Item.Settings().group(StuffMod.TAB)));
        Registry.register(Registry.ITEM, new Identifier(StuffMod.MODID, DyedStoneColor.LIGHT_GRAY.name), new BlockItem(LIGHT_GRAY_DYED_STONE, new Item.Settings().group(StuffMod.TAB)));
        Registry.register(Registry.ITEM, new Identifier(StuffMod.MODID, DyedStoneColor.GRAY.name), new BlockItem(GRAY_DYED_STONE, new Item.Settings().group(StuffMod.TAB)));
        Registry.register(Registry.ITEM, new Identifier(StuffMod.MODID, DyedStoneColor.BLACK.name), new BlockItem(BLACK_DYED_STONE, new Item.Settings().group(StuffMod.TAB)));
        Registry.register(Registry.ITEM, new Identifier(StuffMod.MODID, DyedStoneColor.BROWN.name), new BlockItem(BROWN_DYED_STONE, new Item.Settings().group(StuffMod.TAB)));
        Registry.register(Registry.ITEM, new Identifier(StuffMod.MODID, DyedStoneColor.RED.name), new BlockItem(RED_DYED_STONE, new Item.Settings().group(StuffMod.TAB)));
        Registry.register(Registry.ITEM, new Identifier(StuffMod.MODID, DyedStoneColor.ORANGE.name), new BlockItem(ORANGE_DYED_STONE, new Item.Settings().group(StuffMod.TAB)));
        Registry.register(Registry.ITEM, new Identifier(StuffMod.MODID, DyedStoneColor.YELLOW.name), new BlockItem(YELLOW_DYED_STONE, new Item.Settings().group(StuffMod.TAB)));
        Registry.register(Registry.ITEM, new Identifier(StuffMod.MODID, DyedStoneColor.LIME.name), new BlockItem(LIME_DYED_STONE, new Item.Settings().group(StuffMod.TAB)));
        Registry.register(Registry.ITEM, new Identifier(StuffMod.MODID, DyedStoneColor.GREEN.name), new BlockItem(GREEN_DYED_STONE, new Item.Settings().group(StuffMod.TAB)));
        Registry.register(Registry.ITEM, new Identifier(StuffMod.MODID, DyedStoneColor.CYAN.name), new BlockItem(CYAN_DYED_STONE, new Item.Settings().group(StuffMod.TAB)));
        Registry.register(Registry.ITEM, new Identifier(StuffMod.MODID, DyedStoneColor.LIGHT_BLUE.name), new BlockItem(LIGHT_BLUE_DYED_STONE, new Item.Settings().group(StuffMod.TAB)));
        Registry.register(Registry.ITEM, new Identifier(StuffMod.MODID, DyedStoneColor.BLUE.name), new BlockItem(BLUE_DYED_STONE, new Item.Settings().group(StuffMod.TAB)));
        Registry.register(Registry.ITEM, new Identifier(StuffMod.MODID, DyedStoneColor.PURPLE.name), new BlockItem(PURPLE_DYED_STONE, new Item.Settings().group(StuffMod.TAB)));
        Registry.register(Registry.ITEM, new Identifier(StuffMod.MODID, DyedStoneColor.MAGENTA.name), new BlockItem(MAGENTA_DYED_STONE, new Item.Settings().group(StuffMod.TAB)));
        Registry.register(Registry.ITEM, new Identifier(StuffMod.MODID, DyedStoneColor.PINK.name), new BlockItem(PINK_DYED_STONE, new Item.Settings().group(StuffMod.TAB)));

        // Other Block Items
        Registry.register(Registry.ITEM, new Identifier(StuffMod.MODID, "teleporter"), new BlockItem(TELEPORTER, new Item.Settings().group(StuffMod.TAB)));
    }

    private static void registerItems() {
        // Other Items
        Registry.register(Registry.ITEM, new Identifier(StuffMod.MODID, "teleporter_eye"), TELEPORTER_EYE);
    }
}
