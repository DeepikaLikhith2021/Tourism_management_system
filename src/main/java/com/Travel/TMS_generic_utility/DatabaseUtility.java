package com.Travel.TMS_generic_utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DatabaseUtility {
	Connection con=null;
	public void connectionDB() throws Throwable{
		
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
	con=DriverManager.getConnection(IPathConstant.DBURL,IPathConstant.DBUSERNAME, IPathConstant.DBPASSWORD);
	
	
	
	}
	
	public String executeQueryAndGetdatabase( String query, String columnIndex, String flag,  String expData) throws Throwable {
		ResultSet result = con.createStatement().executeQuery(query);
		boolean flag1=false;
		while(result.next()) {
			String data=result.getString(columnIndex);
			if(data.equalsIgnoreCase(expData))
			{
				flag1=true;
				break;
			}
			
		}
		if(flag1) {
			System.out.println("data is verified");
			return expData;
			
		}
		else {
			System.out.println("data is not updated");
			return "";
		}
		
	}
	public void closeDB() throws Throwable {
		con.close();
		System.out.println("database connection close");
		
	}

}
