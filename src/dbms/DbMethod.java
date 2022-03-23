package dbms;

//import java.beans.Statement;
import java.sql.*;

public class DbMethod {
	private Connection con = null; //
	private Statement st = null;
	private PreparedStatement pStatement = null;

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// connect driver
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "12345");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

//create statement from section query	
	public Statement getStatement() throws SQLException {
		Connection newConnection = getConnection();
		st = newConnection.createStatement();
		return st;
	}

//create prepared statement 
	public PreparedStatement getpStatement(String str) throws SQLException {
		Connection newConnection = getConnection();
		pStatement = newConnection.prepareStatement(str);
		return pStatement;
	}

}
