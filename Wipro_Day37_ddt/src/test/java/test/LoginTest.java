package test;

import org.testng.annotations.Test;
import utility.CSVDataProvider;

public class LoginTest {

    @Test(dataProvider = "loginData",
          dataProviderClass = CSVDataProvider.class)
    public void loginTest(String username, String password) {

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}