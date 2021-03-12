package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment3 {
public static WebDriver driver=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizepopup();
		createcustomer();
		DeleteCust();
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
	public static void createcustomer()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[1]")).click();
			
			driver.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
			
			driver.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("customerLightBox_nameField")).sendKeys("Customer1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div[1]/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void DeleteCust()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
			
		}catch (Exception e)
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
