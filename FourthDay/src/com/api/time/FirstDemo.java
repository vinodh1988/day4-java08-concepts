package com.api.time;




import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FirstDemo {
     public static void main(String n[]) {
    	 LocalDate date = LocalDate.now(); 
    		System.out.println("the current date is "+ 
    							date); 
    		
    		LocalTime time = LocalTime.now(); 
    		System.out.println("the current time is "+ 
    							time); 
    		
    		LocalDateTime current = LocalDateTime.now(); 
    		System.out.println("current date and time : "+ 
    							current); 

    		
    		// to print in a particular format 
    		DateTimeFormatter format = 
    		DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
    		
    		
    		String formatedDateTime = current.format(format); 
    		
    		System.out.println("in foramatted manner "+ 
    							formatedDateTime); 
    	Date d =new Date();
    	System.out.println(d);
    	
    	LocalDate date2 = LocalDate.of(1950,1,26); 
    	System.out.println("the repulic day :"+date2); 
    	DateTimeFormatter format2 = 
        		DateTimeFormatter.ofPattern("dd-MM-yyyy");
    	System.out.println(date2.format(format2));
    	System.out.println(date2.getDayOfMonth());
    	System.out.println(date2.getDayOfWeek());
    	
    	LocalDate dateA = LocalDate.now(); 

		LocalDate dateB = 
			LocalDate.of(2014, Month.DECEMBER, 12); 

		Period gap = Period.between(dateB, dateA); 
		System.out.println("gap between dates "+ 
						"is a period of "+gap); 
		
		

		LocalTime time1 = LocalTime.now(); 
		System.out.println("the current time is " + 
							time1); 

		Duration fiveHours = Duration.ofHours(5); 

		// adding five hours to the current 
		// time and storing it in time2 
		LocalTime time2 = time1.plus(fiveHours); 

		System.out.println("after adding five hours " + 
						"of duration " + time2); 
		
		ZonedDateTime currentZone = ZonedDateTime.now(); 
		System.out.println("the current zone is "+ 
							currentZone.getZone()); 
		
		ZoneId tokyo = ZoneId.of("Asia/Tokyo"); 

		ZonedDateTime tokyoZone = 
				currentZone.withZoneSameInstant(tokyo); 
						
		System.out.println("tokyo time zone is " + 
							tokyoZone); 
     }
}

