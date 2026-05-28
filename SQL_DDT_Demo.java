package Wipro_day25;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SQL_DDT_Demo {

	public static void main(String[] args) {
		
		try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/saucedemo_db",
                    "root",
                    "Paras@2004");

            Statement st = con.createStatement();

            ResultSet rs =
                    st.executeQuery("SELECT * FROM logindata");

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            while(rs.next()) {

                String username = rs.getString("Username");

                String password =rs.getString("Password");

                driver.get("https://www.saucedemo.com/");

                Thread.sleep(2000);

                driver.findElement(By.id("user-name")).sendKeys(username);

                Thread.sleep(2000);

                driver.findElement(By.id("password")).sendKeys(password);

                Thread.sleep(2000);

                driver.findElement(By.id("login-button")).click();

                Thread.sleep(3000);

                driver.navigate().back();

            }

            driver.quit();

            rs.close();
            st.close();
            con.close();

        }

        catch(Exception e) {

            System.out.println(e);

		}
	}

}
