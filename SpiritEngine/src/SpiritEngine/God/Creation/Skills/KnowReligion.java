package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class KnowReligion extends Skill {
    public KnowReligion(){
        super(
                "Knowledge (Religion)",
                new Class[]{
                        Class.BARD,
                        Class.CLERIC,
                        Class.MONK,
                        Class.PALADIN,
                        Class.WIZARD
                },
                false,
                Attribute.INTELLIGENCE
        );
    }
}
