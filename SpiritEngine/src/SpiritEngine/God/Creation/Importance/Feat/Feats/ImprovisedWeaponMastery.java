package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class ImprovisedWeaponMastery extends Feat {
    public ImprovisedWeaponMastery() {
        super("Improvised Weapon Mastery", Type.COMBAT);
        setCanAcquire((
                PlayerDataMgr.getInstance().hasFeat(new CatchOffGuard()) || PlayerDataMgr.getInstance().hasFeat(new ThrowAnything()))
                && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 8)
        );
    }
}
