import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestClass {

    public void test1() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("hey there")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("hey there"))
        ;
    }
}
