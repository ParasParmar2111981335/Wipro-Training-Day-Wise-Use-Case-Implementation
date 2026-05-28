package Rest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentManager {
	static ExtentReports extent;

    public static ExtentReports getReport() {

        ExtentSparkReporter spark =
        new ExtentSparkReporter("test-output/ExtentReport.html");

        extent = new ExtentReports();

        extent.attachReporter(spark);

        return extent;
}
}
