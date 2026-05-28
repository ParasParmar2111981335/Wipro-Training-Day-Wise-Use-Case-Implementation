package Rest;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
public class DeleteUserTest extends BaseTest{ 
	@Test
	public void deleteUser(){ 
		test=extent.createTest("Delete User Test");
		given()
		.when()
		.delete("https://dummyjson.com/users/1")
		.then()
		.log().all()
		.statusCode(200);
		test.pass("DELETE API executed successfully");
	}
}
