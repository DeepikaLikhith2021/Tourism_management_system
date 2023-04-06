package JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectionState {
	Connection connect=null;
	public static void main(String[] args) throws SQLException {
		Driver driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/deepika","root","root");
		Statement state = connect.createStatement();
		ResultSet res = state.executeQuery("select * from book;");
		
		while(res.next()) {
			System.out.println(res.getString(1)+" "+res.getString(2));
		}
		connect.close();
		
		
	}

}
