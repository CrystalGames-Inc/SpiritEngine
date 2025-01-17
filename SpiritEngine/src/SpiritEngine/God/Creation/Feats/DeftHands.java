package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.SkillCheckModifier;
import SpiritEngine.God.Creation.Skills.DisableDevice;
import SpiritEngine.God.Creation.Skills.SleightOfHand;

public class DeftHands extends Feat {
    public DeftHands() {
        super("Deft Hands");
        setSkillModifiers(new SkillCheckModifier[]{
                new SkillCheckModifier(new DisableDevice(), 2),
                new SkillCheckModifier(new SleightOfHand(), 2)
        });
    }
}
