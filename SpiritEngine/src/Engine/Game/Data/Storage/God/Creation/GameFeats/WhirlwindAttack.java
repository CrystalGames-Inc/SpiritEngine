package Engine.Game.Data.Storage.God.Creation.GameFeats;

import Engine.Game.Data.Models.God.Creation.Feat.DepAbility;
import Engine.Game.Data.Models.God.Creation.Feat.Feat;
import Engine.God.Creation.Importance.Constants.Attribute;

public class WhirlwindAttack extends Feat {
    public WhirlwindAttack(){
        setName("Whirlwind Attack");
        setCombatFeat(true);
        setDepAbility(new DepAbility(Attribute.DEXTERITY, 13));
        setDepFeats(new Feat[]{
                new CombatExpertise()
                //TODO add Spring Attack
        });
        //TODO add base attack bonus
    }
}