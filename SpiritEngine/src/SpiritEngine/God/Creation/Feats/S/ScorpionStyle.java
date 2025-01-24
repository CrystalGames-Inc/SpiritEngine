package SpiritEngine.God.Creation.Feats.S;

import SpiritEngine.God.Creation.Feats.I.ImprovedUnarmedStrike;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class ScorpionStyle extends Feat {
    public ScorpionStyle() {
        super("Scorpion Style", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new ImprovedUnarmedStrike()));
    }
}
