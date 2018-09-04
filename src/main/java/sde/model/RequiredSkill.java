package sde.model;

public class RequiredSkill {
	private final int skillID;
	private final int level;

	public RequiredSkill(int skillID, int level) {
		this.skillID = skillID;
		this.level = level;
	}

	public int getSkillID() {
		return skillID;
	}

	public int getLevel() {
		return level;
	}
}
