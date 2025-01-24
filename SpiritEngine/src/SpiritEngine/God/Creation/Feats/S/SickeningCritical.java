package SpiritEngine.God.Creation.Feats.S;

import SpiritEngine.God.Creation.Feats.C.CriticalFocus;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class SickeningCritical extends Feat {
    public SickeningCritical() {
        super("Sickening Critical", Type.COMBAT, Type.CRITICAL);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new CriticalFocus())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 11));
    }
}
