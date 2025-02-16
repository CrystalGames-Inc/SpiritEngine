package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.Management.PlayerDataMgr;

public class IronWill extends Feat {
    public IronWill() {
        super("Iron Will");
        setCanAcquire(true);
        setCheckModifiers(PlayerDataMgr.getInstance().player.combatInfo.will, 2);
    }
}
