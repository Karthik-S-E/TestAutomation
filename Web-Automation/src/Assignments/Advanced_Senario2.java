package Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Advanced_Senario2 {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launch();
		login();
		minimizepopup();
		createthreeusers();
		logout();
		loginuser1();
		logout();
		loginuser2();
		logout();
		loginuser3();
		logout();
		login();
		modifyuserpass();
		logout();
		loginuser1modify(); 
		logout();
		loginuser2modify();
		logout();
		loginuser3modify();
		logout();
		login();
		delete();
		logout();
		closeapp();
		

	}
	static void launch()
	{
		try
		{ 
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		oBrowser.manage().window().maximize();
		oBrowser.get("http://localhost/login.do");
	}
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	static void minimizepopup()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	static void createthreeusers()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user1");
			oBrowser.findElement(By.name("lastName")).sendKeys("first");
			oBrowser.findElement(By.name("email")).sendKeys("u1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("firstuser");
			oBrowser.findElement(By.name("password")).sendKeys("1234");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1234");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(4000);
			
			//Creating 2nd 
			
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user2");
			oBrowser.findElement(By.name("lastName")).sendKeys("second");
			oBrowser.findElement(By.name("email")).sendKeys("u2@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("seconduser");
			oBrowser.findElement(By.name("password")).sendKeys("1234");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1234");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(4000);
			
			// creati ng 3rd
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user3");
			oBrowser.findElement(By.name("lastName")).sendKeys("thirs");
			oBrowser.findElement(By.name("email")).sendKeys("u3@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("thirduser");
			oBrowser.findElement(By.name("password")).sendKeys("1234");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1234");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(4000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginuser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("firstuser");
			oBrowser.findElement(By.name("pwd")).sendKeys("1234");
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginuser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("seconduser");
			oBrowser.findElement(By.name("pwd")).sendKeys("1234");
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginuser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("thirduser");
			oBrowser.findElement(By.name("pwd")).sendKeys("1234");
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyuserpass()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("1111");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1111");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("2222");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("2222");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
			
			
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("3333");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("3333");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginuser1modify()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("firstuser");
			oBrowser.findElement(By.name("pwd")).sendKeys("1111");
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
		
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginuser2modify()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("seconduser");
			oBrowser.findElement(By.name("pwd")).sendKeys("2222");
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginuser3modify()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("thirduser");
			oBrowser.findElement(By.name("pwd")).sendKeys("3333");
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void delete()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(500);
			Alert al=oBrowser.switchTo().alert();
			al.accept();
			
			
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);            
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(500);
			Alert al2=oBrowser.switchTo().alert();
			al2.accept();
			
			
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(500);
			Alert al3=oBrowser.switchTo().alert();
			al3.accept();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeapp()
	{
		try
		{
			oBrowser.close();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
}
