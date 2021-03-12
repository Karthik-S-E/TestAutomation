package com.sgtesting.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
	public static WebDriver oBrowser = null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		logout();
		closeApplication();

	}

	public static void launchBrowser() {

		try {
			String path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path + "\\Library\\Driver\\chromedriver.exe");
			oBrowser = new ChromeDriver();
		} catch (Exception e) {

			e.printStackTrace();

		}
		// oBrowserDemo.get("http://localhost/login.do");

	}

	public static void navigate() {
		try {
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void login() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void logout() {
		try {
			
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void closeApplication() {
		try {
			oBrowser.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void minimizeFlyOutWindow() {
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
