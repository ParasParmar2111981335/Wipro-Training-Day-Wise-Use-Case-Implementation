package Rest;
import org.testng.annotations.*;
import com.aventstack.extentreports.*;
public class BaseTest {
	public static ExtentReports extent;
    public static ExtentTest test;

    @BeforeTest
    public void setup() {

        extent = ExtentManager.getReport();
    }

    @AfterTest
    public void closeReport() {

        extent.flush();
}
}