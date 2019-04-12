import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nozad\\Downloads\\Ny mapp\\Ny mapp\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(2000);
			driver.findElement(By.id("email")).sendKeys("kvart55@hotmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("pass")).sendKeys("V12345678");
			Thread.sleep(2000);
			driver.findElement(By.id("loginbutton")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("userNavigationLabel")).click();
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Logga ut")).click();
			Thread.sleep(2000);
			driver.close();
			System.out.println("Test successful");
			
			
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
		
		

	}

}
