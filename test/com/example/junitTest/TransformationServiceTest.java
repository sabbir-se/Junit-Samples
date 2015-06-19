package com.example.junitTest;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.Before;
import org.junit.Test;

public class TransformationServiceTest {

	private TransformationService service;
	
	@Before
	public void setUp() throws Exception {
		service = new TransformationService();
	}
	
	@Test
	public void testTransformData() throws ParseException {
		Object [] inputdata = new Object[]{
			new SimpleDateFormat("yyyy").parse("2014"), 100	
		};
		String pattern = "yyyy-MM-dd";
		String result = service.transformData(inputdata, pattern);
		assertEquals("['2014-01-01',100%]", result);
	}
	
	@Test(expected=NullPointerException.class)
	public void testTransformDataError(){
		service.transformData(new Object[]{null,100}, "yyyy-MM-dd");
	}
}
