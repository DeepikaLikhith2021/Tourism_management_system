package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class select {
	public static void main(String[] args) throws Throwable {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		Connection con=DriverManager.getConnection("");
		Statement state = con.createStatement();
		//String query="insert into car values('benz',"0"),("adf","bb");";
		// ResultSet result = state.executeQuery(query);
//		 while(result.next()) {
//			 String data=result.getString(0);
//			 if(data.equalsIgnoreCase(data)) {
//				 System.out.println("validate data");
//			 }
//			 else {
//				 System.out.println("not validate");
//			 }
//		 }
		
			
		}
	}


