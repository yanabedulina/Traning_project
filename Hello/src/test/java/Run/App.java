package Run;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Common.Browsers;

public class App extends Browsers implements ITestListener {


	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub
				
	}

	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			screenshots();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			screenshots();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
