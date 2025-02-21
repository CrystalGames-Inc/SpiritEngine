package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Skill.SkillBonus;
import SpiritEngine.Management.PlayerDataMgr;

public class Athletic extends Feat {
    public Athletic() {
        super("Athletic");
        setCanAcquire(true);
        setSkillModifiers(new SkillBonus[]{
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[4].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[4].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[4].bonus.miscMod + 2),
                new SkillBonus(
                        PlayerDataMgr.getInstance().player.info.playerSkills[32].bonus.abilityMod,
                        PlayerDataMgr.getInstance().player.info.playerSkills[32].bonus.ranks,
                        PlayerDataMgr.getInstance().player.info.playerSkills[32].bonus.miscMod + 2)
        });
    }
}
