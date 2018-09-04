package sde;


import sde.model.Item;

import java.util.HashMap;
import java.util.Map;

public class StaticData {
	private final Map<Integer, Item> items;

	public StaticData() {
		items = new HashMap<Integer, Item>();
		load();
	}

	public Map<Integer, Item> getItems() {
		return items;
	}

	private void load() {
		TypesLoader.load(items);
	}
}
