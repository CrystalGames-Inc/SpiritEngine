package SpiritEngine.God.Creation.Importance.Skill;

public class SkillBonus {

    public int size;

    public int abilityMod;
    public int ranks;
    public int miscMod;

    public SkillBonus(){

    }

    public SkillBonus(int abilityMod, int ranks, int miscMod) {
        this.abilityMod = abilityMod;
        this.ranks = ranks;
        this.miscMod = miscMod;
        this.size =  abilityMod + ranks + miscMod;
    }
}
