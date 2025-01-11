package Game.Data.Storage.God.Creation.GameSkills;

import Game.Data.Models.God.Creation.Skill.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Constants.Attribute;

public final class SenseMotive extends Skill {
    public SenseMotive(){
        setName("Sense Motive");
        setClasses(new Class[]{
                Class.BARD,
                Class.CLERIC,
                Class.MONK,
                Class.PALADIN,
                Class.ROGUE
        });
        setUntrained(true);
        setAbility(Attribute.WISDOM);
    }
}
