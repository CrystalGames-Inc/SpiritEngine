package Game.Data.Storage.God.Creation.GameFeats;

import Game.Data.Models.God.Creation.Feat.Feat;

public class ArcaneArmorTraining extends Feat {
    public ArcaneArmorTraining(){
        setName("Arcane Armor Training");
        setCombatFeat(true);
        setDepFeat(new ArmorProficiencyL());
    }
}