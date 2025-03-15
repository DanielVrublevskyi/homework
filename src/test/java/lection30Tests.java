import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;

public class lection30Tests {
    @BeforeMethod
    public void setup() {
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .build();
    }

    @Test
    public void logoutApiTest() {
        Response response = RestAssured
                .given()
                .when().get("https://qauto.forstudy.space/api/auth/logout");
        response.then().statusCode(200)
                .body("status", notNullValue())
                .body("status", Matchers.is("ok"))
                .body("status", equalTo("ok"));

        Assert.assertEquals(response.body().jsonPath().get("status").toString(), "ok");
    }
}
