package Rest;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
public class GetUserTest extends BaseTest{
	
		@Test
		public void getUsers()
		{
			test=extent.createTest("Get User Test");
			given()
			
			.when().get("https://dummyjson.com/users")
			.then()
			.log().all()
			.statusCode(200);
			test.pass("GET API executed successfully");
		}
}
