package com.hms.hospice.GenericUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class IAnnotransform implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod,
			Class<?> occurringClazz) {
	annotation.setRetryAnalyzer(com.hms.hospice.GenericUtils.IRetryAnalyser.class);
		
	}
	
	
	
	
	
	

}
