package cam72cam.immersiverailroading.thirdparty;

import cam72cam.immersiverailroading.IRBlocks;
import cam72cam.immersiverailroading.ImmersiveRailroading;
import cam72cam.immersiverailroading.thirdparty.trackapi.TileEntityTickableTrack;
import cam72cam.mod.block.tile.TileEntityTickable;
import cam72cam.mod.resource.Identifier;
import cam72cam.mod.util.TagCompound;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=ImmersiveRailroading.MODID)
public class Legacy {
    public static class LegacyRailGagTile extends TileEntityTickableTrack {
        @Override
        public Identifier getName() {
            return new Identifier("minecraft", IRBlocks.BLOCK_RAIL_GAG.getName());
        }

        @Override
        public void load(TagCompound data) {
            //System.out.println("MAGIC " + getClass());
            data.setString("instanceId", new Identifier(ImmersiveRailroading.MODID, IRBlocks.BLOCK_RAIL_GAG.getName()).toString());
            super.load(data);
        }
    }

    public static class LegacyRailTile extends TileEntityTickableTrack {
        @Override
        public Identifier getName() {
            return new Identifier("minecraft", IRBlocks.BLOCK_RAIL.getName());
        }

        @Override
        public void load(TagCompound data) {
            //System.out.println("MAGIC " + getClass());
            data.setString("instanceId", new Identifier(ImmersiveRailroading.MODID, IRBlocks.BLOCK_RAIL.getName()).toString());
            super.load(data);
        }
    }

    public static class LegacyRailPreview extends TileEntityTickable {
        @Override
        public Identifier getName() {
            return new Identifier("minecraft", IRBlocks.BLOCK_RAIL_PREVIEW.getName());
        }
        @Override
        public void load(TagCompound data) {
            //System.out.println("MAGIC " + getClass());
            data.setString("instanceId", new Identifier(ImmersiveRailroading.MODID, IRBlocks.BLOCK_RAIL_PREVIEW.getName()).toString());
            super.load(data);
        }
    }

    public static class LegacyMultiblockTile extends TileEntityTickable {
        @Override
        public Identifier getName() {
            return new Identifier("minecraft", IRBlocks.BLOCK_MULTIBLOCK.getName());
        }
        @Override
        public void load(TagCompound data) {
            //System.out.println("MAGIC " + getClass());
            data.setString("instanceId", new Identifier(ImmersiveRailroading.MODID, IRBlocks.BLOCK_MULTIBLOCK.getName()).toString());
            super.load(data);
        }
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        // register legacy TE's
        // Forge can go suck a NPE

        new LegacyRailGagTile().register();
        new LegacyRailTile().register();
        new LegacyRailPreview().register();
        new LegacyMultiblockTile().register();
    }

}
