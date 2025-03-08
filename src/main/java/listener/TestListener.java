package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    public static final String SEPARATOR = "==============================================================================";

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println(SEPARATOR);
        System.out.println("Executing test: '" + iTestResult.getName() + "'");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("-== SUCCESS '" + iTestResult.getName() + "' TEST PASSED! ==-");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("-== FAILURE! '" + iTestResult.getName() + "' TEST FAILED! ==-");
    }
}
