package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentReportManager implements ITestListener {

    public ExtentSparkReporter extentsparkreporter;
    public ExtentReports extentreport;
    public ExtentTest extenttest;


    @Override
    public void onStart(ITestContext testContext) {
        String timeStamp = new SimpleDateFormat("yyyy.mm.dd.hh.ss").format(new Date());
        String repName = "Test-report-"+timeStamp+".html";

        //sparkReporter will set Look & Feel of report
        extentsparkreporter = new ExtentSparkReporter(".\\reports\\"+repName);
        extentsparkreporter.config().setDocumentTitle("Spicejet Automation Project");
        extentsparkreporter.config().setReportName("Spicejet Functional Testing");
        extentsparkreporter.config().setTheme(Theme.STANDARD);

        //ExtentReports create entries in report
        extentreport = new ExtentReports();
        extentreport.attachReporter(extentsparkreporter);
        extentreport.setSystemInfo("Application", "Spicejet");
        extentreport.setSystemInfo("Environmnet", "QA");
        extentreport.setSystemInfo("Operating System", System.getProperty("os.name"));
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        extenttest = extentreport.createTest(result.getName());
        extenttest.log(Status.PASS, "Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        extenttest = extentreport.createTest(result.getName());
        extenttest.log(Status.FAIL, "Test Failed");
        extenttest.log(Status.FAIL, result.getThrowable().getMessage());

        try {

            String imgpath = new Utility().captureScreenshot(result.getName());

            extenttest.addScreenCaptureFromPath(imgpath);

        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onFinish(ITestContext testContext) {
        extentreport.flush();
    }

}