package WIproDay22;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("nav-link-accountList")).click();
		Thread.sleep(3000);
		
		try {
			driver.findElement(By.linkText("Use password Instead")).click();
		}catch(Exception e) {
		}
		Thread.sleep(3000);
		
		driver.findElement(By.id("parasparmar7373@gmail.com")).sendKeys("7876643412");
		
		
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("ap_password")).sendKeys("Paras@2004");
		
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
	}

}
