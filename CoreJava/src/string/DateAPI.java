package string;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateAPI {

	public static void main(String[] args) {
		
		//Local Data and Time 
		
		LocalDate date = LocalDate.now();
		
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		
		System.out.println(time);
		
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println(dateTime);
		
		
		//Zoned Date and Time 
		
		ZoneId zId = ZoneId.of("Europe/Paris");
		
		ZonedDateTime zDateTime = ZonedDateTime.now(zId);
		
		System.out.println(zDateTime);
		
		
	}
	
}
