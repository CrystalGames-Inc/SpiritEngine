package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class GreatCleave extends Feat {
    public GreatCleave() {
        super("Great Cleave", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.strength >= 13) && (PlayerDataMgr.getInstance().hasFeat(new Cleave())) && (PlayerDataMgr.getInstance().hasFeat(new PowerAttack())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 4));
    }
}
