package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testare {
	
	public static WebDriver driver;
	
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nozad\\Downloads\\Ny mapp\\Ny mapp\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void navigate() throws Exception {
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	}
	//Use a real email and password for this to work
	public static void click_MyAccount() {
		driver.findElement(By.id("email")).sendKeys("#########");
	}
	public static void input_Password() {
		driver.findElement(By.id("pass")).sendKeys("#########");
	}
	public static void click_Login() {
		driver.findElement(By.id("loginbutton")).click();
	}
	public static void waitfor() throws Exception {
		Thread.sleep(2000);
	}
	public static void click_UserNav() {
		driver.findElement(By.id("userNavigationLabel")).click();
	}
	public static void click_LogOut() {
		driver.findElement(By.partialLinkText("Logga ut")).click();
	}
	
	

}
