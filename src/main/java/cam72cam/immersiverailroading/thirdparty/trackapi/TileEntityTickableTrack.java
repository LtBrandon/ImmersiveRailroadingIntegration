package cam72cam.immersiverailroading.thirdparty.trackapi;

import cam72cam.mod.ModCore;
import cam72cam.mod.block.tile.TileEntityTickable;
import cam72cam.mod.resource.Identifier;

public class TileEntityTickableTrack extends TileEntityTickable implements trackapi.lib.ITrack {

    public TileEntityTickableTrack() {
        super();
    }

    public TileEntityTickableTrack(Identifier id) {
        super(id);
    }

    private trackapi.lib.ITrack track() {
        return instance() instanceof ITrack ? ((ITrack) instance()).to() : null;
    }

    @Override
    public double getTrackGauge() {
        return track() != null ? track().getTrackGauge() : 0;
    }

    @Override
    public net.minecraft.util.math.Vec3d getNextPosition(net.minecraft.util.math.Vec3d pos, net.minecraft.util.math.Vec3d mot) {
        return track() != null ? track().getNextPosition(pos, mot) : pos;
    }

    @Override
    public Identifier getName() {
        return new Identifier(ModCore.MODID, "tile_track");
    }
}
