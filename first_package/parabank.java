package first_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class parabank {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.manage().window().maximize();
		driver.findElement(By.id("customer.firstName")).sendKeys("Paras");
		Thread.sleep(3000);
		driver.findElement(By.id("customer.lastName")).sendKeys("Parmar");
		Thread.sleep(3000);
		driver.findElement(By.id("customer.address.street")).sendKeys("V.P.O Babehar Himachal Pradesh");
		Thread.sleep(3000);
		driver.findElement(By.id("customer.address.city")).sendKeys("Daulatpur");
		Thread.sleep(3000);
		driver.findElement(By.id("customer.address.state")).sendKeys("Himachal Pradesh");
		Thread.sleep(3000);
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("177204");
		Thread.sleep(3000);
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("7876643412");
		Thread.sleep(3000);
		driver.findElement(By.id("customer.ssn")).sendKeys("123456789");
		Thread.sleep(3000);
		driver.findElement(By.id("customer.username")).sendKeys("rock@07");
		Thread.sleep(3000);
		driver.findElement(By.id("customer.password")).sendKeys("CSK");
		Thread.sleep(3000);
		driver.findElement(By.id("repeatedPassword")).sendKeys("CSK");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		Thread.sleep(3000);
		System.out.println("Account registered Successfully.");
		
		
		//driver.quit();
	}

}
