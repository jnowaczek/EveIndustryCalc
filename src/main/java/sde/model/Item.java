package sde.model;

import java.util.List;

public class Item {
	private List<IndustryActivity> activities;
	private int groupID;
	private String typeName;
	private String description;
	private double mass;
	private double volume;
	private int iconID;

	public List<IndustryActivity> getActivities() {
		return activities;
	}

	public void setActivities(List<IndustryActivity> activities) {
		this.activities = activities;
	}

	public int getGroupID() {
		return groupID;
	}

	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public int getIconID() {
		return iconID;
	}

	public void setIconID(int iconID) {
		this.iconID = iconID;
	}
}
