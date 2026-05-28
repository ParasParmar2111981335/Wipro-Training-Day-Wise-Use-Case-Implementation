package Rest;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
public class PostUserTest extends BaseTest{
	@Test
	public void addUser() {
		test=extent.createTest("Post User Test");
		String Body="{\"firstName\":\"Paras\"}";
		given()
		.header("Content-Type","application/json")
		.body(Body)
		.when()
		.post("https://dummyjson.com/users/add")
		.then()
		.log().all()
		.statusCode(201);
		test.pass("POST API executed successfully");
	}
}
