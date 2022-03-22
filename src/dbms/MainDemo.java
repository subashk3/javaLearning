package dbms;

import java.sql.SQLException;

public class MainDemo {

	public static void main(String[] args) throws SQLException {
		/*
		 * DbConnection objectForom = new DbConnection(); objectForom.connectDb();
		 */
		RegisterationForom registerationForom = new RegisterationForom();
		registerationForom.run();
	}

}
