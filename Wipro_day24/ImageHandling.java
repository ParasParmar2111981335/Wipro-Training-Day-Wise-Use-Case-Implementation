package Wipro_day24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ImageHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/broken");

        Thread.sleep(2000);

        
        WebElement image = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));

        
        if(image.isDisplayed())
        {
            System.out.println("Image is displayed");
        }
        else
        {
            System.out.println("Image is not displayed");
        }

        driver.quit();

	}

}
