package net.cosmicparticl.tidesofthedream;

import net.cosmicparticl.tidesofthedream.block.etherdust;
import net.cosmicparticl.tidesofthedream.block.etherlily;
import net.cosmicparticl.tidesofthedream.item.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class tidesofthedream implements ModInitializer {

	public static final Block etherlily = new etherlily(FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY).lightLevel((state) -> 15));
	public static final Block uncannytile = new Block(FabricBlockSettings.copy(Blocks.RED_CONCRETE));
	public static final Block acridslurry  = new Block(FabricBlockSettings.copy(Blocks.DIRT).sounds(BlockSoundGroup.NYLIUM));
	public static final Block etherdust = new etherdust(FabricBlockSettings.of(Material.WOOL).lightLevel((state) -> 15).hardness(0.1f).nonOpaque().noCollision().sounds(BlockSoundGroup.WOOL));
	public static final Item mundaneflute = new flute(new Item.Settings().maxCount(1).group(ItemGroup.MISC));
	public static final Item endflute = new endflute(new Item.Settings().maxCount(1).group(ItemGroup.MISC));
	public static final Item dreamflute = new dreamflute(new Item.Settings().maxCount(1).group(ItemGroup.MISC));
	public static final Item hellflute = new hellflute(new Item.Settings().maxCount(1).group(ItemGroup.MISC));
	public static final Item earthflute = new earthflute(new Item.Settings().maxCount(1).group(ItemGroup.MISC));
	public static final Item dreamslime = new Item(new Item.Settings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {


		Registry.register(Registry.BLOCK, new Identifier("tidesofthedream", "uncannytile"), uncannytile);
		Registry.register(Registry.ITEM, new Identifier("tidesofthedream", "uncannytile"), new BlockItem(uncannytile, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier("tidesofthedream", "etherdust"), etherdust);
		Registry.register(Registry.ITEM, new Identifier("tidesofthedream", "etherdust"), new BlockItem(etherdust, new Item.Settings().group(ItemGroup.DECORATIONS)));


		Registry.register(Registry.BLOCK, new Identifier("tidesofthedream", "etherlily"), etherlily);
		Registry.register(Registry.ITEM, new Identifier("tidesofthedream", "etherlily"), new BlockItem(etherlily, new Item.Settings().group(ItemGroup.DECORATIONS)));

		Registry.register(Registry.BLOCK, new Identifier("tidesofthedream", "acridslurry"), acridslurry);
		Registry.register(Registry.ITEM, new Identifier("tidesofthedream", "acridslurry"), new BlockItem(acridslurry, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.ITEM, new Identifier("tidesofthedream", "mundaneflute"), mundaneflute);
		Registry.register(Registry.ITEM, new Identifier("tidesofthedream", "endflute"), endflute);
		Registry.register(Registry.ITEM, new Identifier("tidesofthedream", "dreamflute"), dreamflute);
		Registry.register(Registry.ITEM, new Identifier("tidesofthedream", "hellflute"), hellflute);
		Registry.register(Registry.ITEM, new Identifier("tidesofthedream", "earthflute"), earthflute);
		Registry.register(Registry.ITEM, new Identifier("tidesofthedream", "dreamslime"), dreamslime);
	}

}
