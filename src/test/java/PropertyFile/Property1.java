package PropertyFile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Property1 {
	public static void main(String[] args) throws Throwable  {
		Connection con=null;
		int res=0;
		try {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/deepika","root","root");
		Statement state = con.createStatement();
		String query="insert into book values('book1',10),('book2',20);";
		 res = state.executeUpdate(query);
		 //"jdbc:mysql://localhost:3306/deepika","root","root"
		
		
	
	}
		catch(Exception e) {
			
		}
		finally {
			System.out.println("status update");
			
		
		if(res==2) {
			System.out.println("update");
			
		}
		else {
			System.out.println("not update");
		}
		}
		
		
	}
	

}
