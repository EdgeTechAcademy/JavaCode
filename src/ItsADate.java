import java.time.*;

public class ItsADate {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();//returns the system date time in the default timezone.
		System.out.println("dateTime from the system is:"+dateTime);

//creates a date time with the values provided as parameters in the sequence year, month, day of the month, hour of the day, minute of the hour. The second and nano second are set to 0.
		LocalDateTime ldtm = LocalDateTime.of(2014, 3, 30, 12, 30);
		System.out.println("dateTime created by passing in year, month,day, hour, minute is:"+ldtm.toString());

//creates a date time with the values provided as parameters in the sequence year, month, day of the month, hour of the day, minute of the hour, seconds of the minute. The nano second is set to 0.
		LocalDateTime ldts = LocalDateTime.of(2014, 3, 30, 12, 30,23);
		System.out.println("dateTime created by passing in year, month,day, hour, minute, seconds is :"+ldts.toString());

//creates a date time with the values provided as parameters in the sequence year, month, day of the month, hour of the day, minute of the hour, seconds of the minute and nano second of the second.
		LocalDateTime ldtns = LocalDateTime.of(2014, 3, 30, 12, 30,23,12000);
		System.out.println("dateTime created by passing in year, month,day, hour, minute, seconds, nano seconds is :"+ldtns.toString());

//creates a date time with the values provided as parameters in the sequence year, month value from the Month enum, day of the month, hour of the day, minute of the hour. The second and nano second are set to 0.
		LocalDateTime ldtem = LocalDateTime.of(2013, Month.APRIL, 1, 12, 30);
		System.out.println("The date time object created by passing in year, month from enum, day, hour , minute is : "+ldtem.toString());

//creates a date time with the values provided as parameters in the sequence year, month value from the Month enum, day of the month, hour of the day, minute of the hour, seconds of the minute. The nano second is set to 0.
		LocalDateTime ldtes = LocalDateTime.of(2013, Month.APRIL, 1, 12, 30,42);
		System.out.println("The date time object created by passing in year, month from enum, day, hour , minute,second is : "+ldtes.toString());

//creates a date time with the values provided as parameters in the sequence year, month value from the Month enum, day of the month, hour of the day, minute of the hour, seconds of the minute and nano seconds of the seconds.
		LocalDateTime ldtens = LocalDateTime.of(2013, Month.APRIL, 1, 12, 30,42,12000);
		System.out.println("The date time object created by passing in year, month from enum, day, hour , minute,seconds, ns is : "+ldtens.toString());

		int dayOfMonth = dateTime.getDayOfMonth();//returns the day of the month.
		System.out.println("day Of Month is :"+dayOfMonth);
		DayOfWeek dow = dateTime.getDayOfWeek();//returns DayOfWeek enum.
		System.out.println("dow:"+dow);
		int dayOfYear = dateTime.getDayOfYear();//returns the day of the year.
		System.out.println("day Of Year is :"+dayOfYear);
		int hour = dateTime.getHour();//returns hour of the day.
		System.out.println("hour:"+hour);
		int monthValue = dateTime.getMonthValue();//returns the number of the month in the year.
		System.out.println("month of the date in number is:"+monthValue);
		Month month = dateTime.getMonth();// returns the month enum for the month of the year.
		System.out.println("month of the date is :"+month);
		int sec = dateTime.getSecond();// returns seconds field value for the date time.
		System.out.println("Seconds of the date time is:"+sec);
		int nano = dateTime.getNano();// returns nano seconds field value for the date time.
		System.out.println("nano seconds of the date time is:"+nano);
		int year = dateTime.getYear();// returns year field value for the date time.
		System.out.println("year of the date is :"+year);

		//creates a new date time copy after subtracting 10 days from the date time.
		LocalDateTime ldtmd = dateTime.minusDays(10);
		System.out.println("date time after subtracting days is : "+ldtmd.toString());
//creates a new date time copy after subtracting 10 hours from the date time.
		LocalDateTime ldtmh = dateTime.minusHours(10);
		System.out.println("date time after subtracting hours is : "+ldtmh.toString());
//creates a new date time copy after subtracting 21 minutes from the date time.
		LocalDateTime ldtmm = dateTime.minusMinutes(21);
		System.out.println("date time after subtracting minutes is : "+ldtmm.toString());
//creates a new date time copy after subtracting 2 months from the date time.
		LocalDateTime ldtmmm = dateTime.minusMonths(2);
		System.out.println("date time after subtracting months is : "+ldtmmm.toString());
//creates a new date time copy after subtracting 3 years from the date time.
		LocalDateTime ldtmy = dateTime.minusYears(3);
		System.out.println("date time after subtracting years is : "+ldtmy.toString());
//creates a new date time copy after subtracting 32 weeks from the date time.
		LocalDateTime ldtmw = dateTime.minusWeeks(32);
		System.out.println("date time after subtracting weeks is : "+ldtmw.toString());
//creates a new date time copy after subtracting 1200 seconds from the date time.
		LocalDateTime ldtms = dateTime.minusSeconds(1200);
		System.out.println("date time after subtracting secs is : "+ldtms.toString());
//creates a new date time copy after subtracting 12000 nano seconds from the date time.
		LocalDateTime ldtmn = dateTime.minusNanos(12000);
		System.out.println("date time after subtracting nanos is : "+ldtmn.toString());

		//creates a new date time copy after adding 10 days to the date time.
		LocalDateTime ldtpd = dateTime.plusDays(10);
		System.out.println("date time after adding days is : "+ldtpd.toString());
//creates a new date time copy after adding 100 hours to the date time.
		LocalDateTime ldtph = dateTime.plusHours(100);
		System.out.println("date time after adding hours is : "+ldtph.toString());
//creates a new date time copy after adding 190 minutes to the date time.
		LocalDateTime ldtpmm = dateTime.plusMinutes(190);
		System.out.println("date time after adding minutes is : "+ldtpmm.toString());
//creates a new date time copy after adding 32 months to the date time.
		LocalDateTime ldtpdm = dateTime.plusMonths(32);
		System.out.println("date time after adding months is : "+ldtpdm.toString());
//creates a new date time copy after adding 120000 nano seconds to the date time.
		LocalDateTime ldtpn = dateTime.plusNanos(120000);
		System.out.println("date time after adding nanos is : "+ldtpn.toString());
//creates a new date time copy after adding 1200 seconds to the date time.
		LocalDateTime ldtps = dateTime.plusSeconds(1200);
		System.out.println("date time after adding seconds is : "+ldtps.toString());
//creates a new date time copy after adding 24 weeks to the date time.
		LocalDateTime ldtpw = dateTime.plusWeeks(24);
		System.out.println("date time after adding weeks is : "+ldtpw.toString());
//creates a new date time copy after adding 3 years to the date time.
		LocalDateTime ldtpy = dateTime.plusYears(3);
		System.out.println("date time after adding years is : "+ldtpy.toString());

		LocalDateTime ldtmddm = dateTime.withDayOfMonth(10); // sets the day of the month to 10.
		System.out.println("date time after adding modifying day of the month is : "+ldtmddm.toString());
		LocalDateTime ldtmddy = dateTime.withDayOfYear(12);//sets the day of year to 12.
		System.out.println("date time after adding modifying day of the year is : "+ldtmddy.toString());
		LocalDateTime ldtmdh = dateTime.withHour(12);//sets the hour of the day to 12. The other date time fields are not modified.
		System.out.println("date time after adding modifying hour is : "+ldtmdh.toString());
		LocalDateTime ldtmdmm = dateTime.withMinute(12);//sets the minute of the hour to 12. The other date time fields are not modified.
		System.out.println("date time after adding modifying minutes is : "+ldtmdmm.toString());
		LocalDateTime ldtmdm = dateTime.withMonth(4);//sets the month to 4. The other date time fields are not modified.
		System.out.println("date time after adding modifying month is : "+ldtmdm.toString());
		LocalDateTime ldtmdy = dateTime.withYear(2011);//sets the year to 2012. The other date time fields are not modified.
		System.out.println("date time after adding modifying year  is : "+ldtmdy.toString());
		LocalDateTime ldtmds = dateTime.withSecond(12);//sets the seconds of the minute to 12. The other date time fields are not modified.
		System.out.println("date time after adding modifying seconds is : "+ldtmds.toString());
		LocalDateTime ldtmdn = dateTime.withNano(120000);//sets the nano seconds of seconds to 120000. The other date time fields are not modified.
		System.out.println("date time after adding modifying nanos is : "+ldtmdn.toString());

		LocalDate ld = dateTime.toLocalDate();//gets the date value(LocalDate) from the date time. A LocalDate with same year, month and day as this LocalDateTime object will be returned.
		System.out.println("The date field from the date time object is : "+ld.toString());
		LocalTime lt = dateTime.toLocalTime();// gets the time value(LocalTime) from the date time. returns a LocalTime with the same hour, minute, second and nanosecond as this date-time.
		System.out.println("The time field from the date time object is : "+lt.toString());
	}
}
