package sde;


import sde.model.Item;

import java.util.HashMap;
import java.util.Map;

public class StaticData {
	private final Map<Integer, Item> items;

	public StaticData() {
		items = new HashMap<>();
	}

	public Map<Integer, Item> getItems() {
		return items;
	}
}
