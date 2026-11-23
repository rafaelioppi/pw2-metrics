package dev.pw2;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class ItemResourceTest {
    @Test
    void testRootEndpoint() {
        given()
          .when().get("/")
          .then()
             .statusCode(200)
             .body(is("Hello from Quarkus REST"));
    }

    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/itens")
          .then()
             .statusCode(200)
             .body(is("Hello from Quarkus REST"));
    }

}