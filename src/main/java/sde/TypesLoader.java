package sde;

import industryCalc.SdeConnection;
import sde.model.Item;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

public class TypesLoader {

	public static void load(Map<Integer, Item> items) {
		try (Connection c = SdeConnection.getDatabaseConnection(); Statement stmt = c.createStatement()) {
			String sql = "SELECT * FROM invTypes WHERE invTypes.published == 1";

			try (ResultSet res = stmt.executeQuery(sql)) {
				do {
					int typeID = res.getInt("typeID");
					int groupID = res.getInt("groupID");
					String typeName = res.getString("typeName");
					String description = res.getString("description");
					double mass = res.getDouble("mass");
					double volume = res.getDouble("volume");
					int iconID = res.getInt("iconID");

					if (!items.containsKey(typeID)) {
						items.put(typeID, new Item());
					}
					Item item = items.get(typeID);

					item.setTypeName(typeName);
					item.setGroupID(groupID);
					item.setDescription(description);
					item.setMass(mass);
					item.setVolume(volume);
					item.setIconID(iconID);
					item.setIconID(iconID);
				} while (res.next());
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
