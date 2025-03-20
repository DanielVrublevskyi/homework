import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Lection31Tests {
    @BeforeMethod
    public void setup() {
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .build();
    }

    @Test
    public void brandsApiTest() {
        Response response = RestAssured
                .given()
                .when().get("https://qauto.forstudy.space/api/cars/brands");
        response.then().statusCode(200);
        Assert.assertTrue(ApiHelper.isAudiObjectPresent(response));
    }
}
