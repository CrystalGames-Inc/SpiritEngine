package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class ExhaustingCritical extends Feat {
    public ExhaustingCritical() {
        super("Exhausting Critical", new Type[]{Type.COMBAT, Type.CRITICAL});
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new CriticalFocus())) && (PlayerDataMgr.getInstance().hasFeat(new TiringCritical())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 15));
    }
}
