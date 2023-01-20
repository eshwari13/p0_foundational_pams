package com.revature.util;

import java.time.LocalDate;
import java.time.Period;


public class DateUtil {
	public static int ageCalculator(String dateOfBirth) {
	
			LocalDate curDate = LocalDate.now();
			LocalDate birthDate = LocalDate.parse(dateOfBirth);
		
		int age = Period.between(birthDate, curDate).getYears();
		return age;
		
	}
}
