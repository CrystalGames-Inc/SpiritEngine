package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Constants.CMBCalcBonus;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class AgileManeuvers extends Feat {
    public AgileManeuvers() {
        super("Agile Maneuvers", Type.COMBAT);
        if(PlayerDataMgr.getInstance().hasFeat(this)){
            PlayerDataMgr.getInstance().player.combatInfo.cmbCalcBonus = CMBCalcBonus.DEXTERITY;
        }
    }
}