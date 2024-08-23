package selenium_day8;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTest implements ITestListener{
	
	 public void onTestStart(ITestResult result) 
	 {
		 System.out.println("OnTestStart");
	  }

		  public void onTestSuccess(ITestResult result) {
		   System.out.println("onTestSuccess");
		  }

		 
		  public void onTestFailure(ITestResult result) {
		   System.out.println("onTestFailure: "+result.getName());
		  }

		  
		  public void onTestSkipped(ITestResult result) {
		    System.out.println("onTestSkipped: "+result.getName());
		  }

		  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		    System.out.println("onTestFailedButWithinSuccessPercentage");
		  }
		  public void onTestFailedWithTimeout(ITestResult result) {
		    onTestFailure(result);
		  }

		  public void onStart(ITestContext context) {
		    System.out.println("onStart");
		  }

			  public void onFinish(ITestContext context) {
		    System.out.println("onFinish");
		  }


}
