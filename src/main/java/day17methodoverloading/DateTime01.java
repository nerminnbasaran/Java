package day17methodoverloading;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {

        //Type code to get the current date

        Date currenDate = new Date();
        System.out.println(currenDate);//Fri Jan 27 15:03:29 EET 2023

        System.out.println(currenDate.getTime());//1674821074490 millisecond from Jan 1 in 1970 to our current date.
                                                // This structure is used to create unique numeric values

        // Type code to get current time in your local area

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);//15:09:30.544652 <<- Current time Hours:Minutes: Seconds: NanoSeconds

        // Type code to get current date in your local area

        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);//2023-01-27

        // Type code to get current date and current time in your local area.

        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime);//2023-01-27T15:13:10.761717

        // How to get a specific component from date and time

        System.out.println(myDate.getMonthValue());//1

        System.out.println(myDate.getMonth());//JANUARY

        System.out.println(myDateTime.getDayOfWeek());//FRIDAY

        //How to get time in another time zone

        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-01-27T22:04:29.536240

        //How to get a future date and time

        System.out.println(myDate.plusYears(3).plusMonths(4).plusDays(12));//2026-06-08

        System.out.println(myTime.minusHours(3).minusMinutes(20));

        //How to compare two dates

        LocalDate firstKidDob = LocalDate.of(2005,8,23);
        LocalDate secondKidDob = LocalDate.of(2011,3,11);

        boolean isFirstKidAfter = firstKidDob.isAfter(secondKidDob);

        System.out.println(isFirstKidAfter);//false

       boolean isFirstKidBefore = firstKidDob.isBefore(secondKidDob);

        System.out.println(isFirstKidBefore);//true

        // How to format Date

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd:MMM:yyyy");

        String formattedDate =dtf.format(myDate);

        System.out.println(formattedDate);//27:01:2023

        //d-->1, 2, 3, ...........31
        //dd--> 01, 02, 03, ......31

        //M--> 1, 2, 3, ....... 10, 11, 12
        //MM--> 01, 02, 03, ...., 10, 11, 12
        //MMM --> Jan, Feb, Mar
        //MMMM --> January, February

        //y--> 23(just two last digits of the year value)
        //yyyy--> 2023 (whole year value)

        // How to format Time

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm:ss a");//06:31:18 ÖS

        //HH--> 24 hours system
        //hh--> 12 hours system
        //After time pattern leave a space put "a" it put AM or PM next to the time value

        String formattedTime = dtf2.format(myTime);
        System.out.println(formattedTime);//18:23


    }
}
