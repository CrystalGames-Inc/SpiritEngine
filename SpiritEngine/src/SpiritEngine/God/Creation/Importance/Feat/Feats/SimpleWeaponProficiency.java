package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.Data.Models.Items.Equipment.Weapon.Weapon;
import SpiritEngine.Data.Storage.Equipment.Weapons.Weapons;
import SpiritEngine.God.Creation.Importance.Feat.WeaponProficiency;

public class SimpleWeaponProficiency extends WeaponProficiency {
    public SimpleWeaponProficiency() {
        super("Simple Weapon Proficiency", Weapons.getInstance().simpleWeapons);
        setCanAcquire(true);
    }

    public SimpleWeaponProficiency(Weapon proficientWeapon) {
        super("Simple Weapon Proficiency", Weapons.getInstance().simpleWeapons);
        setCanAcquire(true);
        setProficientWeapon(proficientWeapon);
    }

    public SimpleWeaponProficiency(Weapon[] proficientWeapons) {
        super("Simple Weapon Proficiency", Weapons.getInstance().simpleWeapons);
        setCanAcquire(true);
        setProficientWeapons(proficientWeapons);
    }
}
