package JDBC;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Yantra_rmg_tool {

	public static void main(String[] args) throws InterruptedException, Throwable {
		// TODO Auto-generated method stub
		Connection con=null;
		String expProj="TMS__001";
		try {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("http://rmgtestingserver:8084/");
		//driver.get("http://rmgtestingserver:8084/");
		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Projects")).click();
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys("TMS__001");
		driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("deepika");
		WebElement element=driver.findElement(By.xpath("//select[@name='status']"));
		Select select=new Select(element);
		select.selectByVisibleText("Created");
		driver.findElement(By.xpath("//input[@value='Add Project']")).click();
		Thread.sleep(2000);
		
		
		Driver driver1=new Driver();
		DriverManager.registerDriver(driver1);
		 con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("select * from project;");
		boolean flag=false;
		while(res.next()) {
			String actProj=res.getString(4);
			System.out.println(actProj);
			if(actProj.equals(expProj)) {
				flag=true;
				break;
			}
			
		}
		if(flag) {
			System.out.println("project created");
		}
		else {
			System.out.println("project not created");
		}
		}
		catch(Exception e) {
			
		}
		finally {
		con.close();
		
		}
	}
}
	


