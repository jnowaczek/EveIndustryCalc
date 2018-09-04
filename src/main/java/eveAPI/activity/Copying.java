package eveAPI.activity;

import eveAPI.Item;
import eveAPI.Skill;

import java.util.List;
import java.util.Map;

public class Copying extends Activity {
	public final List<Item> materials;
	public final Map<Skill, Integer> skills;

	public Copying(List<Item> materials, Map<Skill, Integer> skills, int time) {
		super(time);
		this.materials = materials;
		this.skills = skills;

	}
}
