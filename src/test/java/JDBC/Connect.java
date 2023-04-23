package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.util.SystemOutLogger;

import com.mysql.cj.jdbc.Driver;

public class Connect {
	
	public static void main(String[] args) throws SQLException {
		
		
			 
				Driver driver=new Driver();
				DriverManager.registerDriver(driver);
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/deepika","root","root");
				Statement state=(Statement) con.createStatement();
				ResultSet result = state.executeQuery("select * from book");
				while(result.next())
				{
					
					System.out.println(result.getString(1)+       "      "+result.getString(2));
				
				}
			
		

	}

}
