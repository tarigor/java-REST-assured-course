package apitesting;

import com.fasterxml.jackson.core.JsonParser;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import pojo.User;

import java.io.File;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

import static io.restassured.RestAssured.*;

public class SendPOSTRequestUsingRestAssured {

    private static final String USER = "sk_test_51IGi1jCRBpvKDWVnxCWBFMVou8zFgTYEbaa7ZO3K3UbppWYOTepZsS5c4FQYEMfFumvMmKi9w0Ff6pSKr1yWaqmP00kDWuVT1n";

    static String bodyString = "{\n" +
            "  \"description\": \"test user\",\n" +
            "  \"email\": \"testUser@mail.com\",\n" +
            "  \"name\": \"User User\"" +
            "}";

    public static void main(String[] args) throws ParseException {
        HashMap<String, String> map = new HashMap<>();
        map.put("email", "user@mail.com");
        map.put("firstName", "Ivan");
        map.put("lastName", "Ivanov");

        String param1 = "accept: */*";
        String param2 = "Content-Type: application/json";
        Response response = given().auth().basic(USER, "")
                .formParam("name", "Petr Ivanov")
                .formParam("email", "piotr_ivanov@mail.com")
                .formParam("description", "POST request from REST Assured")
                .log().all()
                .post("https://api.stripe.com/v1/customers");

//        Response response = given()
////                .auth()
////                .basic(USER,"")
//                .contentType(ContentType.JSON)
//                .body(new File("./src/main/resources/post.json"))
//                .post("http://localhost:8080/api/users");

//        User user = new User("Ivan", "Ivanov", "ivanov@tutu.by", "Grodno", "Otechestvennaya str", 11, 20);
//
//        user.addPhones(1111, 22, 3333);
//
//        Response response = given()
////                .auth()
////                .basic(USER,"")
//                .contentType(ContentType.JSON)
//                .body(user)
//                .log().all()
//                .post("http://localhost:8080/api/users");


//        HashMap<String,String> map = new HashMap<>();
//        map.put("name", "Petr Ivanov");
//        map.put("email", "piotr_ivanov@mail.com");
//        map.put("description", "POST request from REST Assured");
//
//        Response response1 = given().auth().basic(USER,"").formParams(map).post("https://api.stripe.com/v1/customers");
//
//        Response response = given()
//                .params("limit",1)
//                .auth()
//                .basic(USER,"")
//                .get("https://api.stripe.com/v1/customers");
//
//        Response response = given()
//                .headers("Authorization","Bearer "+USER)
//                .get("https://api.stripe.com/v1/customers");

        System.out.println(response.jsonPath().get("name").toString());
        System.out.println(response.statusCode());



    }
}
