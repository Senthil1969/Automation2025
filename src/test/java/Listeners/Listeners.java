package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
        System.out.println("On finish the message " + context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
        System.out.println("On test Start the message " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        System.out.println("On the test Success the message " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        System.out.println("On the test Failure " + result.getName());
        System.out.println("On the test Failure the message " + result.getClass().getName());
        System.out.println("On the test Failure the message " + result.getMethod().getMethodName());
        System.out.println("On the test Failure the message " + result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
        System.out.println("On the test skipped " + result.getName());
    }
}
