package Wipro_day24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_button {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/radio-button");
		Thread.sleep(2000);
		WebElement yes=driver.findElement(By.xpath("//label[@for='yesRadio']"));
		yes.click();
		System.out.println("Selected: " + driver.findElement(By.className("text-success")).getText());
		Thread.sleep(2000);
		
		WebElement impressive=driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
		impressive.click();
		System.out.println("Selected: " + driver.findElement(By.className("text-success")).getText());
		Thread.sleep(4000);
		driver.quit();
		
	}

}
