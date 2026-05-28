package first_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class checkBox_demosite {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/checkbox");
		
		WebElement element=driver.findElement(By.className("rc-tree-checkbox"));
		element.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
