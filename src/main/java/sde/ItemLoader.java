package sde;

import industryCalc.SdeConnection;
import sde.model.Item;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class ItemLoader {

	public HashMap<Integer, Item> load() {
		HashMap<Integer, Item> items = new HashMap();

		try (Connection c = SdeConnection.getDatabaseConnection(); Statement stmt = c.createStatement()) {
			String sql = "SELECT invTypes.typeID, invTypes.typeName, invGroups.categoryID, invGroups.groupID, " +
					"invGroups.groupName, invTypeMaterials.materialTypeID, invTypeMaterials.quantity FROM invGroups " +
					"INNER JOIN invTypes on invTypes.groupID = invGroups.groupID LEFT OUTER JOIN invTypeMaterials on " +
					"invTypeMaterials.typeID = invTypes.typeID WHERE invGroups.categoryID = 25 AND " +
					"invTypes.published = 1 and invTypeMaterials.materialTypeID NOT NULL";

			try (ResultSet ore = stmt.executeQuery(sql)) {
				do {
					int typeID = ore.getInt("typeID");
					String typeName = ore.getString("typeName");
					int categoryID = ore.getInt("categoryID");
					int groupID = ore.getInt("groupID");
					String groupName = ore.getString("groupName");
					int materialTypeId = ore.getInt("materialTypeID");
					int quantity = ore.getInt("quantity");
					items.put(typeID, new Item());
				} while (ore.next());

			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return items;
	}
}
