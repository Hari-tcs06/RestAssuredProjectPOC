import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class Test01_GET {
	
	@Test
	
	void test_01 () 
	{
		
		Response response = get("https://reqres.in/api/users?page=2");
			
		System.out.println (response.asString());
		System.out.println (response.getBody().asString());
		System.out.println (response.getStatusCode());
		System.out.println (response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode, 201);
	}
	
@Test
	
<<<<<<< HEAD






	void test_15 () 

=======
	void test_09 () 
>>>>>>> refs/remotes/origin/master
	{
	
	given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
	

	}

}
