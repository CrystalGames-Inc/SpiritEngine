package SpiritEngine.God.Creation.Importance.Feat;

import SpiritEngine.Data.Models.Items.Equipment.Armor.Armor;

public class ArmorProficiency extends Feat{

    private Armor[] proficientArmors;

    public ArmorProficiency(String name, Armor[] proficientArmors) {
        super(name, Type.COMBAT);
        this.proficientArmors = proficientArmors;
    }

    public Armor[] getProficientArmors(){
        return proficientArmors;
    }
}
