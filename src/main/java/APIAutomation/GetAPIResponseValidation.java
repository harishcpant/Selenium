package APIAutomation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.given;

import org.testng.Assert;

public class GetAPIResponseValidation {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		Response response = given()
                .contentType(ContentType.JSON)
                .param("key", "qaclick123")
                .param("place_id", "d7558fc6b405ba1ca8bd048d296aaf7e")
                .when()
                .get("/maps/api/place/get/json")
                .then()
                .extract().response();
				System.out.println(response.statusCode());
		Assert.assertEquals(response.statusCode(),200);
		
		System.out.println(response.getBody().asString());
		JsonPath jsnpath1=response.jsonPath();		
		System.out.println("Location : "+ jsnpath1.get("location"));
		
		//JsonPath jsnpath2=jsnpath1.get("location");
		System.out.println("latitude : "+ jsnpath1.get("location.latitude"));		
	}
}
