package SpiritEngine.God.Creation.Feats.S;

import SpiritEngine.God.Creation.Feats.C.CombatReflexes;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class StandStill extends Feat {
    public StandStill() {
        super("Stand Still", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new CombatReflexes()));
    }
}
