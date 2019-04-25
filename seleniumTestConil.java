package seleniumTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTestConil {
static String[] id_list = {"menu-item-3381","menu-item-3387", "menu-item-3382", "menu-item-3384", "menu-item-3398", 
		"menu-item-3383", "menu-item-3422", "menu-item-3516", "menu-item-3517", "menu-item-3518", "menu-item-3519",
		"menu-item-3520", "menu-item-3521"};

public static void main(String []args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nozad\\Downloads\\Ny mapp\\Ny mapp\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost/wordpress/");
	Thread.sleep(1000);
	
	for (int i = 0; i < id_list.length; i++) {
		driver.findElement(By.id(id_list[i])).click();
		Thread.sleep(1000);
	}
}	
}
