package automation;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class NijatTestDetectionAndReporter implements ITestListener {

    @Override
    public void onTestStart(ITestResult tc) {
        String name = tc.getName();
        System.out.println(name + " test case is about to start");
    }

    @Override
    public void onTestSuccess(ITestResult tc) {
        System.out.println("Yay!");
    }

    @Override
    public void onTestFailure(ITestResult tc) {
        System.out.println("Taking a screenshot...");
    }

    @Override
    public void onTestSkipped(ITestResult tc) {
        System.out.println("Sending a notifications...");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test Context is about to start");
        System.out.println("Initiating video recording");
        System.out.println(".......");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test context is done..");
        System.out.println("Saving the video records");
        System.out.println("Generating PDF report ");
        System.out.println("E-mailing the reports...");
        System.out.println("0-----------------------------------");
    }
}
