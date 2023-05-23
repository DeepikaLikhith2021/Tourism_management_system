package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Non_select_statement {
	 
	public static void main(String[] args) throws Throwable {
		 int res=0;
		  Connection con=null;
		try {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver); 
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/deepika","root","root");
		Statement state = con.createStatement();
		String query="insert into book values('eternal',100),('time',20);";
		 res = state.executeUpdate(query);
		
	}

	catch(Exception e) {
		
	}
	finally {
		//System.out.println("data updated");
	
		
		if(res==2) {
			System.out.println("data updation");
		}
		else {
			System.out.println("datab updation unsuccsessfik");
		}
		           
	  }
	}
 }
	

	