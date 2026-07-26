package com.demo.sdet.serenity.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import net.serenitybdd.cucumber.CucumberWithSerenity;


@SuppressWarnings("deprecation")
@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/com/demo/sdet/features",
        		glue = {
        		        "com.demo.sdet.serenity.steps",
        		        "com.demo.sdet.serenity.hooks"
        		    },        plugin = {
                "pretty"
        },
        monochrome = true
)

public class LoginRunner {

}