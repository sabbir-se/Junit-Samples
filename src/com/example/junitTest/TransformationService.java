package com.example.junitTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TransformationService {

	public String transformData(final Object[] data, final String pattern){
		Date date = (Date) data[0];
		int percentage = (Integer) data[1];
		StringBuilder result = new StringBuilder("['");
		result.append(new SimpleDateFormat(pattern).format(date));
		result.append("',");
		result.append(percentage);
		result.append("%]");
		return result.toString();
	}
}
