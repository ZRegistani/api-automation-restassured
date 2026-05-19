package tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class GetUsersTest {

    @Test
    public void validateUsersAPI() {

        given()

        .when()
            .get("https://reqres.in/api/users?page=2")

        .then()
            .statusCode(200)
            .body("data[0].first_name", notNullValue());

        System.out.println("API validation successful");
    }
}