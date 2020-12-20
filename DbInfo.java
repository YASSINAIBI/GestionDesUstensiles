package ustensiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbInfo {
	private static String username = "root";
	private static String password = "";
	private static String host = "jdbc:mysql://localhost/products";
	
	public static Connection connDB() throws SQLException {
		return DriverManager.getConnection(host, username, password);
	}
}
