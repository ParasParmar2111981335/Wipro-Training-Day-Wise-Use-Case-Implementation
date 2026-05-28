package first_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

           
class usecase_bank {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://parabank.parasoft.com/parabank/");

        Thread.sleep(3000);

        
        driver.findElement(By.name("username")).sendKeys("rock@07");

        driver.findElement(By.name("password")).sendKeys("CSK");

        driver.findElement(By.xpath("//input[@value='Log In']")) .click();

        Thread.sleep(5000);

        
        driver.findElement(By.linkText("Transfer Funds")).click();

        Thread.sleep(3000);

        
        driver.findElement(By.id("amount")).sendKeys("500");

        Thread.sleep(2000);

    
        driver.findElement(By.xpath("//input[@value='Transfer']")).click();

        Thread.sleep(3000);

        
        String message = driver.findElement(By.xpath("//h1")).getText();

        System.out.println(message);

        Thread.sleep(2000);

     
        driver.findElement(By.linkText("Log Out")).click();

        Thread.sleep(2000);

        
    }
	
}
