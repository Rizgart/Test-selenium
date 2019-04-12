import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nozad\\Downloads\\Ny mapp\\Ny mapp\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/wordpress/");
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("menu-item-3381")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("menu-item-3387")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("menu-item-3382")).click();
			Thread.sleep(3000);
			//driver.findElement(By.id("ui builder_button")).click();
			//Thread.sleep(1000);
			//driver.findElement(By.className("emodal-close")).click();
			//Thread.sleep(4000);
			
			driver.findElement(By.id("menu-item-3384")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("menu-item-3398")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("menu-item-3383")).click();
			Thread.sleep(3000);
			/*driver.findElement(By.className
			("wpcf7-form-control wpcf7-text wpcf7-email wpcf7-validates-as-required wpcf7-validates-as-email"))
			.sendKeys("nozadt15@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.className("wpcf7-form-control-wrap your-message"))
			.sendKeys("Hej conil webbsida");
			Thread.sleep(3000);
			driver.findElement(By.className("wpcf7-form-control wpcf7-submit")).
			click();*/
			
			
			driver.findElement(By.id("menu-item-3422")).click();
			
			driver.findElement(By.id("menu-item-3516")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("menu-item-3517")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("menu-item-3518")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("menu-item-3519")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("menu-item-3520")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("menu-item-3521")).click();
			driver.findElement(By.id("menu-item-3522")).click();
			Thread.sleep(3000);
			driver.close();
			System.out.println("Test successful");
			
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
		
		
	}
}
