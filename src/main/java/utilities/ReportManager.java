package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportManager {

    private static ExtentReports extent;

    public static ExtentReports getReport() {

        if(extent == null){
            ExtentSparkReporter spark =
                    new ExtentSparkReporter("reports/ExtentReport.html");

            extent = new ExtentReports();

            extent.attachReporter(spark);

            spark.config().setDocumentTitle("Automation Report");
            spark.config().setReportName("Selenium TestNG Framework");

        }

        return extent;


    }
}
