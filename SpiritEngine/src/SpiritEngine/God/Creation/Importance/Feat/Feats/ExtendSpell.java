package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;

public class ExtendSpell extends Feat {
    public ExtendSpell() {
        super("Extend Spell", Type.METAMAGIC);
        setCanAcquire(true);
    }
}
