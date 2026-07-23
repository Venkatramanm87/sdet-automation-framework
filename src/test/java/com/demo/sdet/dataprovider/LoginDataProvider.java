package com.demo.sdet.dataprovider;

import org.testng.annotations.DataProvider;

//import com.demo.sdet.model.LoginData;
import com.demo.sdet.utils.JsonDataReader;

public class LoginDataProvider {


    @DataProvider(name = "loginData")
    public Object[] loginData() {

        return JsonDataReader.getLoginData()
                .toArray();

    }

}