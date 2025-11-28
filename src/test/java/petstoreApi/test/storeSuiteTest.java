package petstoreApi.test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import petstoreApi.config.baseUrl;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.File;
import java.security.DrbgParameters;

import static io.restassured.RestAssured.given;


public class storeSuiteTest {

    File body_req = new File("src/test/resources/dataRequestBody/createOrder.json");
    File schema_file = new File("src/test/java/petstoreApi/schema/orderSchema.json");

    @Test(priority = 1)
    public void ordering(){
        RestAssured.baseURI = baseUrl.baseUrl;


        given()
                .headers("Content-Type", "application/json")
                .body(body_req)
                .when()
                .post("/store/order")
        .then()
                .log().all()
                .statusCode(200);
    }

    @Test(priority = 2)
    public void getOrder(){
        RestAssured.baseURI = baseUrl.baseUrl;
        given()
        .headers("Content-Type", "application/json")
                .when()
                .get("/store/order/1")
                .then()
                .log().all()
                .statusCode(200);
        
    }


    @Test(priority = 3)
    public void gettingOrder(){
        RestAssured.baseURI = baseUrl.baseUrl;


        given()
                .headers("Content-Type", "application/json")
                .body(body_req)
                .when()
                .get("/store/inventory")

        .then()
                .log().all()
                .statusCode(200);
    }
}
