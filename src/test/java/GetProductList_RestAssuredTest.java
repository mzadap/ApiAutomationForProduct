import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class GetProductList_RestAssuredTest {

    @Test
    public void shouldGetProduct() {
        RestAssured.baseURI = "https://api.escuelajs.co";
        RestAssured.given()
                .when()
                .get("/api/v1/products")
                .then()
                .statusCode(200);
    }

    @Test
    public void shouldNotGetProductListWithInvalidHTTPMethod() {
        RestAssured.baseURI = "https://api.escuelajs.co";
        RestAssured.given()
                .when()
                .put("/api/v1/products")
                .then()
                .statusCode(404);
    }

}
