package Wipro_day24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class normal_buttons {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/buttons");

        Thread.sleep(2000);

        Actions a = new Actions(driver);

        WebElement doubleBtn = driver.findElement(By.id("doubleClickBtn"));

        a.doubleClick(doubleBtn).perform();

        Thread.sleep(2000);

        
        WebElement rightBtn = driver.findElement(By.id("rightClickBtn"));

        a.contextClick(rightBtn).perform();

        Thread.sleep(2000);

        
        WebElement clickBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));

        clickBtn.click();

        Thread.sleep(2000);

        driver.quit();

	}

}
