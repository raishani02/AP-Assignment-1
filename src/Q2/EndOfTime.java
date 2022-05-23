package Q2;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class EndOfTime {
    public static void main(String[] args) throws Exception {
        
        long currentTimeMillis = System.currentTimeMillis();
        
        //creation of date object
        Date objCurrentDate = new Date(currentTimeMillis);
      
        //printing value of Date
        System.out.println("Before formatting using Date Object : " + objCurrentDate);
        
        //giving format to date
        SimpleDateFormat simpledateformat = new SimpleDateFormat("MM/dd/yyyy 'at' hh:mma  'EST'");

        TimeZone eastTimeZone = TimeZone.getTimeZone("EST");
        simpledateformat.setTimeZone( eastTimeZone );

        //formatted value of current Date
        System.out.println("After formatting using Date Object : " + simpledateformat.format(objCurrentDate));
      
        //doing same thing of Date using Calendar
        Calendar calender = Calendar.getInstance();
        calender.setTimeInMillis(currentTimeMillis);
        System.out.println("Using Calendar Object : " + simpledateformat.format(calender.getTime()));

    }
}

