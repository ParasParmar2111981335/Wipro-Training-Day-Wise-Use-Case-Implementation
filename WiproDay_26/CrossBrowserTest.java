package WiproDay_26;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
public class CrossBrowserTest {
	

		 WebDriver driver;

		    @Parameters("browser")
		    @BeforeMethod
		    public void setup(String browser) {

		        if(browser.equalsIgnoreCase("chrome")) {
		            driver = new ChromeDriver();
		        }

		        else if(browser.equalsIgnoreCase("firefox")) {
		            driver = new FirefoxDriver();
		        }

		        else if(browser.equalsIgnoreCase("edge")) {
		            driver = new EdgeDriver();
		        }

		        driver.manage().window().maximize();
		    }

		    @Test
		    public void openSite() {

		        driver.get("https://www.saucedemo.com");
		        System.out.println("Title: " + driver.getTitle());

		    }

		    @AfterMethod
		    public void closeBrowser() {
		        driver.quit();
		    }

	}

