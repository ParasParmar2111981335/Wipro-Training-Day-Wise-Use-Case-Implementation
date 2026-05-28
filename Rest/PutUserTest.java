package Rest;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
public class PutUserTest extends BaseTest{
	@Test
	public void updateUser() {
		test=extent.createTest("Put User Test");
		String Body="{\"firstName\":\"UpdatedName\"}";
		given()
		.header("Content-Type","application/json")
		.body(Body)
		.when()
		.put("https://dummyjson.com/users/1")
		.then()
		.log().all()
		.statusCode(200);
		test.pass("PUT API executed successfully");
	}
}
