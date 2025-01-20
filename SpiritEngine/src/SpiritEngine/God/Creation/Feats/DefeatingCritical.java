package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class DefeatingCritical extends Feat {
    public DefeatingCritical() {
        super("Defeating Critical", new Type[]{Type.COMBAT, Type.CRITICAL});
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new CriticalFocus())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 13));
    }
}