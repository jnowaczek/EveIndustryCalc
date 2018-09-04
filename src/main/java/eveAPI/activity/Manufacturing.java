package eveAPI.activity;

import eveAPI.Item;
import eveAPI.Skill;

import java.util.List;
import java.util.Map;

public class Manufacturing extends Activity {
	public final List<Item> materials;
	public final List<Item> products;
	public final Map<Skill, Integer> skills;

	public Manufacturing(List<Item> materials, List<Item> products, Map<Skill, Integer> skills, int time) {
		super(time);
		this.materials = materials;
		this.products = products;
		this.skills = skills;
	}
}
