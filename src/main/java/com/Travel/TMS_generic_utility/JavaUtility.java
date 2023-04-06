package com.Travel.TMS_generic_utility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	public int random() {
		Random ran=new Random();
		int random=ran.nextInt(1000);
		return random;
	}
	
	public String getSystemNum() {
		Date dt=new Date();
		String date=dt.toString();
		return date;
	}
	public String systemdate() {
		SimpleDateFormat dateformat=new SimpleDateFormat("DD--MM-YYYY, hh:mm:ss");
		Date dt=new Date();
		String getDateAndTime=dateformat.format(dt);
		getDateAndTime.replace(":", "-");
		return getDateAndTime;
		
		
	}

}
