package Framework;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class LoginTest {
    WebDriver driver;
    @BeforeTest
    public void setup() throws Exception {
        ChromeOptions options = new ChromeOptions(); 
        driver = new RemoteWebDriver(
                new URL("http://localhost:4444"),
                options);
    }
    @Test
    public void loginTest() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains("OrangeHRM"));
        System.out.println("Login Successful");
    }
    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
