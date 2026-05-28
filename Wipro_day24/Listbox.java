package Wipro_day24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Listbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/selectable");

        Thread.sleep(2000);

        
        WebElement item1 = driver.findElement(By.xpath("//li[text()='Cras justo odio']"));

        item1.click();

        Thread.sleep(2000);

        
        WebElement item2 = driver.findElement(By.xpath("//li[text()='Dapibus ac facilisis in']"));

        item2.click();

        Thread.sleep(2000);

        driver.quit();

	}

}
