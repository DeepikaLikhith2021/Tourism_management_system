package com.Travel.TMS_generic_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String readDataFromPropertyFile(String key) throws Throwable {
		FileInputStream fi=new FileInputStream(IPathConstant.FILEPATH);
		Properties property=new Properties();
		property.load(fi);
		String value=property.getProperty(key);
		return value;
	}

}
