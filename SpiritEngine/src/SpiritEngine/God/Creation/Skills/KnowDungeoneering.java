package SpiritEngine.God.Creation.Skills;

import SpiritEngine.God.Creation.Importance.Skill.Skill;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Attribute;

public final class KnowDungeoneering extends Skill {
    public KnowDungeoneering(){
        super(
                "Knowledge (Dungeoneering)",
                new Class[]{
                        Class.BARD,
                        Class.FIGHTER,
                        Class.RANGER,
                        Class.ROGUE,
                        Class.WIZARD
                },
                false,
                Attribute.INTELLIGENCE
        );
    }
}
