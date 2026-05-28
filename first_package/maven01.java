package first_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class maven01 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("first-name")).sendKeys("Paras");
		driver.findElement(By.id("last-name")).sendKeys("Parmar");
		driver.findElement(By.id("postal-code")).sendKeys("144444");
		Thread.sleep(3000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(3000);
		
		System.out.println("Order placed successfully");
	}

}
