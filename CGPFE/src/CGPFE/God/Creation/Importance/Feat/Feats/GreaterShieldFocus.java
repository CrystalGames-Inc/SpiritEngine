package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Constants.Class;
import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class GreaterShieldFocus extends Feat {
    public GreaterShieldFocus() {
        super("Greater Shield Focus", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new ShieldFocus())) && (PlayerDataMgr.getInstance().hasFeat(new ShieldProficiency())) && (PlayerDataMgr.getInstance().player.info.pClass == Class.FIGHTER) && (PlayerDataMgr.getInstance().player.info.level >= 8));
    }
}
