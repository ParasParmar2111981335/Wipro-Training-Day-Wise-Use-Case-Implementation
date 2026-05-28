package Wipro_day24;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Scroll_demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com");

        Thread.sleep(2000);

        
        JavascriptExecutor js = (JavascriptExecutor) driver;

      
        js.executeScript("window.scrollBy(0,500)");

        Thread.sleep(2000);

       
        js.executeScript("window.scrollBy(0,-500)");

        Thread.sleep(2000);

        driver.quit();

	}

}
