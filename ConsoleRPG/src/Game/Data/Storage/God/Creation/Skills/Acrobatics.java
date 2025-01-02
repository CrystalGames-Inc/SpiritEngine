package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Skills.Attribute;

public final class Acrobatics extends Skill {

    public Acrobatics(){
        setName("Acrobatics");
        setBarbarian(true);
        setBard(true);
        setCleric(false);
        setDruid(false);
        setFighter(false);
        setMonk(true);
        setPaladin(false);
        setRanger(false);
        setRogue(true);
        setSorcerer(false);
        setWizard(false);
        setUntrained(true);
        setAbility(Attribute.DEXTERITY);
    }
}
