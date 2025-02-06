package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class Perception extends Skill {
    public Perception(){
        super(
                "Perception",
                new Class[]{
                        Class.ALCHEMIST,
                        Class.BARBARIAN,
                        Class.BARD,
                        Class.DRUID,
                        Class.MONK,
                        Class.RANGER,
                        Class.ROGUE
                },
                true,
                Attribute.WISDOM
        );
    }
}
