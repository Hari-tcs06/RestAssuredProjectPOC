

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
//import static utils.extentreports.ExtentTestManager.startTest;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import java.lang.reflect.Method;
import org.testng.annotations.Listeners;

@Epic("Regression Tests")
@Feature("Test scenarios 1 and 2")

//import utils.listeners.TestListener;

public class Test01_GET {
	

	
	@Test(priority = 0, description = "Test case 1 - Check status code")
	
	@Severity(SeverityLevel.NORMAL)
    @Description("Test Description: Checking status code 1")
    @Story("Story 1")
	
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
		AssertJUnit.assertEquals(statuscode, 200);
	}
	
@Test (priority = 1, description = "Test case 2 - Check status code")
@Severity(SeverityLevel.NORMAL)
@Description("Test Description: Checking status code 2")
@Story("Story 2")
	
	void test_02 () 

	{
	
	given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
	

	}

}
