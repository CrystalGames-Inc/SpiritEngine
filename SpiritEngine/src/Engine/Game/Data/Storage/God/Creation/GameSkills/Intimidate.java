package Engine.Game.Data.Storage.God.Creation.GameSkills;

import Engine.Game.Data.Models.God.Creation.Skill.Skill;
import Engine.God.Creation.Importance.Constants.Class;
import Engine.God.Creation.Importance.Constants.Attribute;

public final class Intimidate extends Skill {
    public Intimidate(){
        setName("Intimidate");
        setClasses(new Class[]{
                Class.BARBARIAN,
                Class.BARD,
                Class.FIGHTER,
                Class.MONK,
                Class.RANGER,
                Class.ROGUE,
                Class.SORCERER
        });
        setUntrained(true);
        setAbility(Attribute.CHARISMA);
    }
}