package Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advanced_senario1 {
	public static WebDriver driver = null;

	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizepopup();
		createUser1();
		logout();
		loginUseer1();
		createUser2();
		modifyusertoPassword();
		logout();
		loginUseer2();
		createUser3();
		logout();
		login();
		changeUser1password();
		logout();
		loginUser1updated();
		logout();
		loginasuser2();
		deleteuser3();
		logout();
		loginUser1updated();
		deleteuser2();
		logout();
		login();
		deleteuser1();
		logout();
		closebrowser();
		

	}

	public static void launchbrowser() {
		try {

			String p = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", p + "\\Library\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void navigate() {
		try {
			driver.get("http://localhost/login.do");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void login() {
		try {
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void minimizepopup() {
		try {
			driver.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void createUser1() {
		try {
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("firstName")).sendKeys("User1");
			driver.findElement(By.name("lastName")).sendKeys("User1");
			driver.findElement(By.name("email")).sendKeys("u1@gmail.com");
			driver.findElement(By.name("username")).sendKeys("demoUser1");
			driver.findElement(By.name("password")).sendKeys("user1234");
			driver.findElement(By.name("passwordCopy")).sendKeys("user1234");
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void logout() {
		try {
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void loginUseer1() {
		try {
			driver.findElement(By.id("username")).sendKeys("demoUser1");
			driver.findElement(By.name("pwd")).sendKeys("user1234");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void createUser2() {
		try {
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("firstName")).sendKeys("User2");
			driver.findElement(By.name("lastName")).sendKeys("User2");
			driver.findElement(By.name("email")).sendKeys("u1@gmail.com");
			driver.findElement(By.name("username")).sendKeys("demoUser2");
			driver.findElement(By.name("password")).sendKeys("user1234");
			driver.findElement(By.name("passwordCopy")).sendKeys("user1234");
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void modifyusertoPassword() {
		try {
			driver.findElement(By.xpath(
					"//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.name("password")).sendKeys("testuser2");
			driver.findElement(By.name("passwordCopy")).sendKeys("testuser2");
			Thread.sleep(2000);
			driver.findElement(By.className("buttonTitle")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void loginUseer2() {
		try {
			driver.findElement(By.id("username")).sendKeys("demoUser2");
			driver.findElement(By.name("pwd")).sendKeys("testuser2");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void createUser3() {
		try {
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("firstName")).sendKeys("User3");
			driver.findElement(By.name("lastName")).sendKeys("User3");
			driver.findElement(By.name("email")).sendKeys("u3@gmail.com");
			driver.findElement(By.name("username")).sendKeys("demoUser3");
			driver.findElement(By.name("password")).sendKeys("user1234");
			driver.findElement(By.name("passwordCopy")).sendKeys("user1234");
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void changeUser1password() {// *[@id="userListTableContainer"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]
		try {
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath(
					"//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.name("password")).sendKeys("updateuser1");
			driver.findElement(By.name("passwordCopy")).sendKeys("updateuser1");
			Thread.sleep(2000);
			driver.findElement(By.className("buttonTitle")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void loginUser1updated() {
		try {
			driver.findElement(By.id("username")).sendKeys("demoUser1");
			driver.findElement(By.name("pwd")).sendKeys("updateuser1");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void loginasuser2() {
		try {
			driver.findElement(By.id("username")).sendKeys("demoUser2");
			driver.findElement(By.name("pwd")).sendKeys("testuser2");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void deleteuser3() {

		try {
			driver.findElement(By.xpath("//a[@class='content users']")).click();
			driver.findElement(By.xpath(
					"//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert = driver.switchTo().alert();
			oAlert.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void deleteuser2() {
		
		try {
			driver.findElement(By.xpath("//a[@class='content users']")).click();
			driver.findElement(By.xpath(
					"//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert = driver.switchTo().alert();
			oAlert.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
public static void deleteuser1() {
		
		try {//*[@id="userListTableContainer"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]
			driver.findElement(By.xpath("//a[@class='content users']")).click();
			driver.findElement(By.xpath(
					"//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert = driver.switchTo().alert();
			oAlert.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
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
