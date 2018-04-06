package cloud.jobassist.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Test {

	public static void main(String[] args) {
		     
		Date today = new Date();
	      
        //displaying this date on IST timezone
        DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm");
        df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        String IST = df.format(new Date("10:00"));
        System.out.println("Date in Indian Timezone (IST) : " + IST);
      
        //dispalying date on PST timezone
//        df.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
//        String PST = df.format(today);
//        System.out.println("Date in PST Timezone : " + PST);

	}

}
