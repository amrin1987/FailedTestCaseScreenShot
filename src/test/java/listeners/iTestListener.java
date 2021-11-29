package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class iTestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        String methodName=result.getMethod().getMethodName();
        System.out.println("Method started "+methodName);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        String methodName=result.getMethod().getMethodName();
        System.out.println("Method Success "+methodName);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String methodName=result.getMethod().getMethodName();
        System.out.println("Method Failed "+methodName);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        String methodName=result.getMethod().getMethodName();
        System.out.println("Method Skipped "+methodName);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }
}
