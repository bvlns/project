package cloud.date.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class GMTtoIST{
	  public static void main(String args[]) throws ParseException{
		  SimpleDateFormat dateTimeFormat = new SimpleDateFormat("HH:mm");
	        dateTimeFormat.setTimeZone(TimeZone.getTimeZone("America/New_York"));
	        String estDateTimeString = "5:30"; //(EST)
	        Date date = dateTimeFormat.parse(estDateTimeString);
	        DateFormat timeFormat = new SimpleDateFormat("HH:mm");
	        timeFormat.setTimeZone(TimeZone.getTimeZone("Asia/Calcutta"));
	        String istTime = timeFormat.format(date);
	        System.out.println("Time IST = " + istTime);
	  }
	}
