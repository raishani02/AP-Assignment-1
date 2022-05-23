package Q3;

import java.io.File;
import java.util.*;

public class SetDate {
    public static void main(String[] args) throws Exception {
        int total_args = args.length;
        if (total_args < 3) {
            System.out.println("Error: Arguments are less than 3.");
        } else if (total_args > 3) {
            System.out.println("Warning: Arguments must not be greater than 3.");
            try {
                setDate(args[0], args[1], args[2]);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } else {
            try {
                setDate(args[0], args[1], args[2]);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void setDate(String date, String time, String fileName) throws IllegalArgumentException {
        int month, day, year, hour, minute, second;
        String[] splitted_date = date.split("/");
        String[] splitted_time = time.split("-");

        if (splitted_date.length != 3) {
            throw new IllegalArgumentException("Invalid Date formate");
        } else if (splitted_time.length != 3) {
            throw new IllegalArgumentException("Invalid Time formate");
        } else {

            try {
                month = Integer.parseInt(splitted_date[0]);
                day = Integer.parseInt(splitted_date[1]);
                year = Integer.parseInt(splitted_date[2]);

                hour = Integer.parseInt(splitted_time[0]);
                minute = Integer.parseInt(splitted_time[1]);
                second = Integer.parseInt(splitted_time[2]);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid Number formate");
            }

            long time_in_miliseconds = 0;
            Calendar calendar = Calendar.getInstance();
            try {
                calendar.setLenient(false);
                calendar.set(year, month - 1, day, hour, minute, second);
                time_in_miliseconds = calendar.getTimeInMillis();

            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid " + e.getMessage());
            }

            File file = new File(fileName);
            if (file.exists()) {
                try {
                    file.setLastModified(time_in_miliseconds);
                } catch (IllegalArgumentException e) {
                    throw new IllegalArgumentException("Year must be greater than 1969");
                }

            } else {
                throw new IllegalArgumentException("File Not Exists:\t" + fileName);
            }
            System.out.println(
                    "File " + fileName + " last modified time is changesd with provided time:\t" + calendar.getTime());
        }
    }
}
