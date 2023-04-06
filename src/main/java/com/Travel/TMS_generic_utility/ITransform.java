package com.Travel.TMS_generic_utility;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class ITransform implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod,
			Class<?> occurringClazz) {
		// TODO Auto-generated method stub
		annotation.setRetryAnalyzer(com.Travel.TMS_generic_utility.RetryImpClass.class);
		
		
	}

	
	
		
	

	
	}

	
	


