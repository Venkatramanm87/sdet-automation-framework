package com.demo.sdet.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.demo.sdet.driver.DriverFactory;

public class ScreenshotUtils {

    public static String captureScreenshot(String testName) {

        File source =
                ((TakesScreenshot) DriverFactory.getDriver())
                        .getScreenshotAs(OutputType.FILE);

        String timestamp =
                LocalDateTime.now()
                        .format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));

        String destination =
                "test-output/screenshots/"
                        + testName + "_"
                        + timestamp + ".png";

        try {

            Files.createDirectories(
                    new File("test-output/screenshots").toPath());

            Files.copy(source.toPath(),
                    new File(destination).toPath(),
                    StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {

            e.printStackTrace();

        }

        return new File(destination).getAbsolutePath();
    }

}