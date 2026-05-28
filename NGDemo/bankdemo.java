package NGDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class bankdemo {
	
	WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/");
    }

    @Test
    public void transferFunds() throws Exception {

        

        driver.findElement(By.name("username")).sendKeys("rock@07");

        driver.findElement(By.name("password")).sendKeys("CSK");

        driver.findElement(By.xpath("//input[@value='Log In']")).click();

        Thread.sleep(3000);


        driver.findElement(By.linkText("Transfer Funds")).click();

        Thread.sleep(3000);

        driver.findElement(By.id("amount")).sendKeys("500");

        driver.findElement(By.xpath("//input[@value='Transfer']")).click();

        Thread.sleep(3000);

        

        driver.findElement(By.linkText("Log Out")).click();

    }

    @AfterMethod
    public void close() {

        driver.quit();
    }
}
