package first_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class flightdemo {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://blazedemo.com/");

        Thread.sleep(2000);

       
        driver.findElement(By.name("fromPort")).sendKeys("Paris");
        Thread.sleep(1000);

        driver.findElement(By.name("toPort")).sendKeys("London");
        Thread.sleep(1000);

        
        driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
        Thread.sleep(3000);

        
        driver.findElement(By.xpath("(//input[@value='Choose This Flight'])[1]")).click();
        Thread.sleep(3000);

        
        driver.findElement(By.id("inputName")).sendKeys("Paras Parmar");
        Thread.sleep(1000);

        driver.findElement(By.id("address")).sendKeys("Himachal Pradesh, India");
        Thread.sleep(1000);

        driver.findElement(By.id("city")).sendKeys("Una");
        Thread.sleep(1000);

        driver.findElement(By.id("state")).sendKeys("Himachal Pradesh");
        Thread.sleep(1000);

        driver.findElement(By.id("zipCode")).sendKeys("110001");
        Thread.sleep(1000);

        driver.findElement(By.id("creditCardNumber")).sendKeys("4111111111111111");
        Thread.sleep(1000);

        driver.findElement(By.id("creditCardMonth")).clear();
        driver.findElement(By.id("creditCardMonth")).sendKeys("12");

        driver.findElement(By.id("creditCardYear")).clear();
        driver.findElement(By.id("creditCardYear")).sendKeys("2028");

        driver.findElement(By.id("nameOnCard")).sendKeys("Paras Parmar");
        Thread.sleep(1000);

        
        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
        Thread.sleep(3000);

        
        System.out.println("Flight booked successfully!");

        
        //driver.quit();
	}
}
