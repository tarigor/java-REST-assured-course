package apitesting;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class SendGetRequestUsingRestAssured {
    public static void main(String[] args) {
        Response response = given().auth().basic("sk_test_51IGi1jCRBpvKDWVnxCWBFMVou8zFgTYEbaa7ZO3K3UbppWYOTepZsS5c4FQYEMfFumvMmKi9w0Ff6pSKr1yWaqmP00kDWuVT1n", "")
                .formParams("limit",1)
                .get("https://api.stripe.com/v1/customers");
        response.prettyPrint();
    }
}
