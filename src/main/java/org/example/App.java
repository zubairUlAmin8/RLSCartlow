package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("test-output/spark.html")
                .viewConfigurer()
                .viewOrder()
                .as(new ViewName[] { ViewName.DASHBOARD, ViewName.TEST })
                .apply();
        spark.config(
                ExtentSparkReporterConfig.builder()
                        .theme(Theme.DARK)
                        .documentTitle("MyReport")
                        .build()
        );
        extent.attachReporter(spark);
        extent.createTest("MyFirstTest").log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");


        ExtentTest test = extent.createTest("MyFirstTest");
        // reference image saved to disk
        test.fail(MediaEntityBuilder.createScreenCaptureFromPath("img.png").build());

// base64
        test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
        test.assignDevice("device-name");
        test.assignDevice("device-1", "device-2");

// usage
        extent.createTest("Test").assignDevice("device-name").pass("details");
        extent.setSystemInfo("os", "macos");
        extent.flush();
    }
}
