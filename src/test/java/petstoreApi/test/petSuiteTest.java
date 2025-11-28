package petstoreApi.test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import petstoreApi.config.baseUrl;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.File;

import static io.restassured.RestAssured.given;





public class petSuiteTest {

    File req_body = new File("src/test/resources/dataRequestBody/createPet.json");
    @Test(priority = 1)
    public void masukinPiaraan(){
        RestAssured.baseURI = baseUrl.baseUrl;

        given()
                .header("Content-Type", "application/json")
                .body(req_body)
                .when()
                .post("/pet")
        .then()
                .log().all()
                .statusCode(200);

    }

    @Test(priority = 2)
    public void caliakPiaraan(){
        RestAssured.baseURI = baseUrl.baseUrl;
        int petId = 200;

        given()
                .headers("Content-Type", "application/json")
                .body(req_body).when()
                .get("/pet/" + petId)
        .then()
                .log().all()
                .statusCode(200);
    }
}
