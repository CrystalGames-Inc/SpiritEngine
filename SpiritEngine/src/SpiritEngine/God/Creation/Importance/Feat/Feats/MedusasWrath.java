package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class MedusasWrath extends Feat {
    public MedusasWrath() {
        super("Medusa's Wrath", Type.COMBAT);
        setCanAcquire(
                (PlayerDataMgr.getInstance().hasFeat(new ImprovedUnarmedStrike())) &&
                (PlayerDataMgr.getInstance().hasFeat(new GorgonsFist())) &&
                (PlayerDataMgr.getInstance().hasFeat(new ScorpionStyle())) &&
                (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 11)
        );
    }
}
