package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;

public class MaximizeSpell extends Feat {
    public MaximizeSpell() {
        super("Maximize Spell", Type.METAMAGIC);
        setCanAcquire(true);
    }
}
