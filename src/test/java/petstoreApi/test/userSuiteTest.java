package petstoreApi.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import petstoreApi.config.baseUrl;

import io.restassured.RestAssured;
import org.json.simple.JSONObject;

import java.io.File;

import static io.restassured.RestAssured.given;

public class userSuiteTest {

    private final String req_body_path = "src/test/resources/dataRequestBody/";
    private final String username = "testuser100";
    private final String password = "password123";

    @BeforeClass
    public void setup(){
        RestAssured.baseURI = baseUrl.baseUrl;
    }

    // 1. Registration
    @Test(priority = 1)
    public void registration(){
        File req_body_file = new File(req_body_path + "createUser.json");

        given()
                .header("Content-Type", "application/json")
                .body(req_body_file)
                .when()
                .post("/user")
                .then()
                .statusCode(200)
                .log().all();
    }

    // 2. Login (GET /user/login?username=xxx&password=xxx)
    @Test(priority = 2)
    public void login(){
        given()
                .header("Content-Type", "application/json")
                .queryParam("username", username)
                .queryParam("password", password)
                .when()
                .get("/user/login")
                .then()
                .statusCode(200)
                .log().all();
    }

    // 3. Search user (GET /user/{username})
    @Test(priority = 3)
    public void search(){
        given()
                .header("Content-Type", "application/json")
                .when()
                .get("/user/" + username)
                .then()
                .statusCode(200)
                .log().all();
    }

    // 4. Update user (PUT /user/{username}) - tanpa JSON file, langsung bikin JSON di Java
    @Test(priority = 4)
    public void updateUser(){
        JSONObject reqBody = new JSONObject();

        reqBody.put("id", 100);
        reqBody.put("username", username);
        reqBody.put("firstName", "Test");
        reqBody.put("lastName", "User Updated");
        reqBody.put("email", "test@example.com");
        reqBody.put("password", "newPassword999");  // password diubah
        reqBody.put("phone", "1234567890");
        reqBody.put("userStatus", 1);

        given()
                .header("Content-Type", "application/json")
                .body(reqBody.toJSONString())
                .when()
                .put("/user/" + username)
                .then()
                .statusCode(200)
                .log().all();
    }
}
