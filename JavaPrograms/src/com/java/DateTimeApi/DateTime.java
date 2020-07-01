package com.java.DateTimeApi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalDate d1 = LocalDate.of(1998, 07, 01);
		System.out.println(d1);
		LocalTime t1 =LocalTime.now(ZoneId.of("GMT"));
		System.out.println(t1);
		Instant i = Instant.now();
		System.out.println(i);
		//for (String s : ZoneId.getAvailableZoneIds()) {
		//	System.out.println(s);
			
		//}
	}

}
