package com.demo.sdet.api.endpoints;


import com.demo.sdet.api.payloads.UserPayload;
import com.demo.sdet.api.utils.RequestSpec;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class UserEndPoints {


    public static Response createUser(UserPayload payload) {


        return given()

                .spec(RequestSpec.getRequestSpec())

                .body(payload)

        .when()

                .post(Routes.USER);

    }


    public static Response getUser(String username) {


        return given()

                .spec(RequestSpec.getRequestSpec())

                .pathParam("username", username)

        .when()

                .get(Routes.USER_BY_NAME);

    }


    public static Response updateUser(
            String username,
            UserPayload payload) {


        return given()

                .spec(RequestSpec.getRequestSpec())

                .pathParam("username", username)

                .body(payload)

        .when()

                .put(Routes.USER_BY_NAME);

    }


    public static Response deleteUser(String username) {


        return given()

                .spec(RequestSpec.getRequestSpec())

                .pathParam("username", username)

        .when()

                .delete(Routes.USER_BY_NAME);

    }

}