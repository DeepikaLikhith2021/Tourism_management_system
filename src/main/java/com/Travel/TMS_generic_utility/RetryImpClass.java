package com.Travel.TMS_generic_utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImpClass  implements IRetryAnalyzer{
 int count=0;
 int retryLimit=3;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count<retryLimit)
		{
			count++;
			return true;
		}
		
		return false;
	}

}
