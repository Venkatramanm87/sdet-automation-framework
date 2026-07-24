package com.demo.sdet.api.utils;


import io.restassured.response.Response;

import org.testng.Assert;


public class ResponseValidator {


    public static void validateStatusCode(
            Response response,
            int expectedStatus) {


        Assert.assertEquals(
                response.getStatusCode(),
                expectedStatus
        );

    }


}