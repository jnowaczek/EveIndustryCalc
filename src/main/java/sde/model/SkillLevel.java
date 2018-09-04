package sde.model;

public class SkillLevel {
	private final int skillID;
	private final int level;

	public SkillLevel(int skillID, int level) {
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
