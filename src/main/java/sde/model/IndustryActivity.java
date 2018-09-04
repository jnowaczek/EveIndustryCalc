package sde.model;

public enum IndustryActivity {
	ACTIVITY_NONE(0),
	ACTIVITY_MANUFACTURING(1),
	ACTIVITY_TECH_RESEARCH(2),
	ACTIVITY_TIME_RESEARCH(3),
	ACTIVITY_MATERIAL_RESEARCH(4),
	ACTIVITY_COPYING(5),
	ACTIVITY_DUPLICATING(6),
	ACTIVITY_REVERSE_ENGINEERING(7),
	ACTIVITY_INVENTION(8),
	ACTIVITY_REACTIONS(11);


	private int activityID;

	IndustryActivity(int activityID) {
		this.activityID = activityID;
	}

	public int getActivityID() {
		return activityID;
	}
}
