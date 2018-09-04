package eveAPI;

import eveAPI.activity.Activity;

import java.util.List;

public class Blueprint {
	public final List<Activity> activities;
	public final int blueprintTypeID;
	public final int maxProductionLimit;

	public Blueprint(List<Activity> activities, int blueprintTypeID, int maxProductionLimit) {
		this.activities = activities;
		this.blueprintTypeID = blueprintTypeID;
		this.maxProductionLimit = maxProductionLimit;
	}
}
