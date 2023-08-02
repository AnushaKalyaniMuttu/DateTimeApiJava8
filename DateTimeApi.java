package com.hiber;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeApi {

	public static void main (String [] args) {
		LocalDate d=LocalDate.now(ZoneId.of("Europe/Nicosia"));
		LocalTime t=LocalTime.now(ZoneId.of("Europe/Nicosia"));
		Instant i=Instant.now();
		System.out.println(i);
		System.out.println(t);
		LocalDate d2=LocalDate.of(1989, Month.APRIL, 20);
		System.out.println(d2);

		for(String s:ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
	}
}
