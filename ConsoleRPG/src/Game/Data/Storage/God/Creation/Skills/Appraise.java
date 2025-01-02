package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Skills.Attribute;

public final class Appraise extends Skill {
    public Appraise(){
        setName("Appraise");
        setBarbarian(false);
        setBard(true);
        setCleric(true);
        setDruid(false);
        setFighter(false);
        setMonk(true);
        setPaladin(false);
        setRanger(false);
        setRogue(true);
        setSorcerer(true);
        setWizard(true);
        setUntrained(true);
        setAbility(Attribute.INTELLIGENCE);
    }
}
