package cam72cam.immersiverailroading.thirdparty;

import blusunrize.immersiveengineering.common.IEContent;
import blusunrize.immersiveengineering.common.blocks.metal.BlockMetalDecoration;
import cam72cam.immersiverailroading.util.IRFuzzy;
import cam72cam.mod.item.ItemStack;

public class ImmersiveEngineering {

	public static void init() {
		ItemStack casing = new ItemStack(IEContent.blockStoneDecoration,1, 2);
		ItemStack light_eng = new ItemStack(IEContent.blockMetalDecoration,1, BlockMetalDecoration.META_lightEngineering);
		ItemStack heavy_eng = new ItemStack(IEContent.blockMetalDecoration,1, BlockMetalDecoration.META_heavyEngineering);
		ItemStack scaffold = new ItemStack(IEContent.blockMetalDecoration,1, BlockMetalDecoration.META_scaffolding);
		IRFuzzy.IR_CASTING_CASING.add(casing);
		IRFuzzy.IR_LIGHT_ENG.add(light_eng);
		IRFuzzy.IR_HEAVY_ENG.add(heavy_eng);
        IRFuzzy.IR_SCAFFOLDING.add(scaffold);
        IRFuzzy.IR_TIE.addAll("plankTreatedWood");
	}
}