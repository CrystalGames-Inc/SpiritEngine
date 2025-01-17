package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class DeflectArrows extends Feat {
    public DeflectArrows() {
        super("Deflect Arrows", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.Dexterity >= 13) && (PlayerDataMgr.getInstance().hasFeat(new ImprovedUnarmedStrike())));
    }
}
