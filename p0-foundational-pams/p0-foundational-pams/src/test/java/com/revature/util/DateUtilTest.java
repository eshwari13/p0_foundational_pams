package com.revature.util;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Period;

import org.junit.Test;

public class DateUtilTest {
	@Test
	public void testAgeCalculator() {
		
		LocalDate today = LocalDate.now();
		LocalDate dateOfBirth = LocalDate.parse("2000-11-11");
		
		int age = Period.between(dateOfBirth, today).getYears();
		assertEquals(22,age);
		
	}
}
