import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class VerifyTitle {
	
	@Test
	public void verifyFacebookTitle(){
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://localhost/wordpress/");
		System.out.println(driver.getTitle());
	}
	@Test
	public void verifyCasaHelena(){
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://localhost/wordpress/#thehouse");
		System.out.println(driver.getTitle());
	}
	@Test
	public void verifyGallery(){
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://localhost/wordpress/#gallery");
		System.out.println(driver.getTitle());
	}
	@Test
	public void verifyPrices(){
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://localhost/wordpress/#prices");
		System.out.println(driver.getTitle());
	}
	@Test
	public void verifyLocation(){
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://localhost/wordpress/#location");
		System.out.println(driver.getTitle());
	}
	@Test
	public void verifyAboutConil(){
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://localhost/wordpress/#aboutconil");
		System.out.println(driver.getTitle());
	}
	@Test
	public void verifyContact(){
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://localhost/wordpress/#contact");
		System.out.println(driver.getTitle());
	}
	@Test
	public void verifyClickCasaHelena(){
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://localhost/wordpress/");
		driver.findElement(By.id("menu-item-3381")).click();
		System.out.println(driver.getTitle());
	}
	@Test
	public void verifyClickGallery(){
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://localhost/wordpress/");
		driver.findElement(By.id("menu-item-3387")).click();
		System.out.println(driver.getTitle());
	}
	@Test
	public void verifyClickPrices(){
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://localhost/wordpress/");
		driver.findElement(By.id("menu-item-3382")).click();
		System.out.println(driver.getTitle());
	}
	@Test
	public void verifyClickLocation(){
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://localhost/wordpress/");
		driver.findElement(By.id("menu-item-3384")).click();
		System.out.println(driver.getTitle());
	}
	@Test
	public void verifyClickAboutConil(){
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://localhost/wordpress/");
		driver.findElement(By.id("menu-item-3398")).click();
		System.out.println(driver.getTitle());
	}
	@Test
	public void verifyClickContact(){
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://localhost/wordpress/");
		driver.findElement(By.id("menu-item-3383")).click();
		System.out.println(driver.getTitle());
	}
}
