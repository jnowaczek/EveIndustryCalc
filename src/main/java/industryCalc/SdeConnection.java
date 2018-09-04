package industryCalc;

import java.sql.*;

public class SdeConnection {

	public static Connection getDatabaseConnection() {
		Connection c = null;
		try {
			String url = "jdbc:sqlite:c:/Users/Julian Nowaczek/Desktop/sqlite-latest.sqlite";
			c = DriverManager.getConnection(url);
			System.out.println("Established connection to SQLite database.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return c;
	}
}
