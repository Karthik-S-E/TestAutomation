package Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static WebDriver driver=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizepopup();
		createUser();
		deleteUser();
		logout();
		closebrowser();
		
	}
	public static void launchbrowser()
	{
		try {
		
		String p=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", p+"\\Library\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void navigate()
	{
		try {
		driver.get("http://localhost/login.do");
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void login()
	{
		try {
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void minimizepopup()
	{
		try {
			driver.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("firstName")).sendKeys("demo");
			driver.findElement(By.name("lastName")).sendKeys("User1");
			driver.findElement(By.name("email")).sendKeys("demo@gmail.com");
			driver.findElement(By.name("username")).sendKeys("demoUser1");
			driver.findElement(By.name("password")).sendKeys("Welcome123");
			driver.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
		
			Alert oAlert=driver.switchTo().alert();
			String textcontent=oAlert.getText();
			System.out.println(textcontent);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logout()
	{
		try
		{
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closebrowser()
	{
		try
		{
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

	//*[@id="userListTableContainer"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]
	
////*[@id="userListTableContainer"]/table/tbody/tr[2]/td[1]
