package com.demo.sdet.api.tests;

import com.demo.sdet.api.endpoints.UserEndPoints;
import com.demo.sdet.api.payloads.UserPayload;

import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.testng.annotations.Listeners;

import com.demo.sdet.reports.TestListener;

import com.demo.sdet.api.utils.ResponseValidator;

@Listeners(TestListener.class)

public class UserTests {

    UserPayload userPayload;


    @BeforeClass
    public void setupData() {

        userPayload = new UserPayload();

        userPayload.setId(101);
        userPayload.setUsername("Venkat123");
        userPayload.setFirstName("Venkat");
        userPayload.setLastName("Ram");
        userPayload.setEmail("venkat@test.com");
        userPayload.setPassword("welcome");
        userPayload.setPhone("9999999999");
        userPayload.setUserStatus(1);

    }


    @Test(priority = 1)
    public void createUserTest() {

        Response response =
                UserEndPoints.createUser(userPayload);

        response.then().log().all();

        ResponseValidator.validateStatusCode(
                response,
                200
        );
        

    }


    @Test(priority = 2)
    public void getUserTest() {

        Response response =
                UserEndPoints.getUser(
                        userPayload.getUsername()
                );

        response.then().log().all();

        ResponseValidator.validateStatusCode(
                response,
                200
        );

    }


    @Test(priority = 3)
    public void updateUserTest() {

        userPayload.setFirstName("UpdatedName");

        Response response =
                UserEndPoints.updateUser(
                        userPayload.getUsername(),
                        userPayload
                );
        response.then().log().all();

        ResponseValidator.validateStatusCode(
                response,
                200
        );

    }


    @Test(priority = 4)
    public void deleteUserTest() {

        Response response =
                UserEndPoints.deleteUser(
                        userPayload.getUsername()
                );

        response.then().log().all();

        ResponseValidator.validateStatusCode(
                response,
                200
        );
    }

}