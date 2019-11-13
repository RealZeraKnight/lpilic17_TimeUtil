package net.htlgrieskirchen.pos3.timeutil;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class TimeUtilPro
{   
    private TimeUtilPro() {
    }

    // ########## LOCALDATE METHODS ##########
    
    public static LocalDate intToLocalDate(int date)
    {
        int year = Integer.parseInt(Integer.toString(date).substring(0,4));
        int month = Integer.parseInt(Integer.toString(date).substring(4,6));
        int day = Integer.parseInt(Integer.toString(date).substring(6,8));
        return LocalDate.of(year,month,day);
    }

    public static LocalDate longToLocalDate(long dateTime)
    {
        int year = Integer.parseInt(Long.toString(dateTime).substring(0,4));
        int month = Integer.parseInt(Long.toString(dateTime).substring(4,6));
        int day = Integer.parseInt(Long.toString(dateTime).substring(6,8));
        int hour = Integer.parseInt(Long.toString(dateTime).substring(8,10));
        int minute = Integer.parseInt(Long.toString(dateTime).substring(10,12));

        return LocalDateTime.of(year,month,day,hour,minute).toLocalDate();
    }
    
    public static LocalDate dateToLocalDate(Date dateTime)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String[] date = sdf.format(dateTime).split("-");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        return LocalDate.of(year,month,day);
    }
    
    public static LocalDate calendarToLocalDate(Calendar dateTime)
    {
        return dateToLocalDate(dateTime.getTime());
    }
    
    // ########## LOCALDATETIME METHODS ##########
            
    public static LocalDateTime intToLocalDateTime(int date) {

        int year = Integer.parseInt(Integer.toString(date).substring(0,4));
        int month = Integer.parseInt(Integer.toString(date).substring(4,6));
        int day = Integer.parseInt(Integer.toString(date).substring(6,8));
        return LocalDateTime.of(year,month,day,0,0);
    }
    
    public static LocalDateTime longToLocalDateTime(long dateTime) {
        int year = Integer.parseInt(Long.toString(dateTime).substring(0,4));
        int month = Integer.parseInt(Long.toString(dateTime).substring(4,6));
        int day = Integer.parseInt(Long.toString(dateTime).substring(6,8));
        int hour = Integer.parseInt(Long.toString(dateTime).substring(8,10));
        int minute = Integer.parseInt(Long.toString(dateTime).substring(10,12));
        LocalDateTime ld = LocalDateTime.of(year,month,day,hour,minute);
        return ld;
    }
    
    public static LocalDateTime dateToLocalDateTime(Date dateTime) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh-mm");
        String[] date = sdf.format(dateTime).split("-");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        int hour = Integer.parseInt(date[3]);
        int minute = Integer.parseInt(date[4]);

        return LocalDateTime.of(year,month,day,hour,minute);

    }
    
    public static LocalDateTime calendarToLocalDateTime(Calendar dateTime)
    {
        return dateToLocalDateTime(dateTime.getTime());
    }
           
    // ########## INT METHODS ##########
    
    public static int localDateToInt(LocalDate date)
    {
        String month;
        String day;
        if(date.getMonthValue() >= 10)
        {
            month = ""+date.getMonthValue();
        }
        else
        {
            month = "0"+date.getMonthValue();
        }
        if(date.getDayOfMonth() >= 10)
        {
            day = ""+date.getDayOfMonth();
        }
        else
        {
            day = "0"+date.getDayOfMonth();
        }
        String number = date.getYear()+""+month+""+day;
        return Integer.parseInt(number);
    }

    public static int localDateTimeToInt(LocalDateTime dateTime)
    {
        String month;
        String day;
        if(dateTime.getMonthValue() >= 10)
        {
            month = ""+dateTime.getMonthValue();
        }
        else
        {
            month = "0"+dateTime.getMonthValue();
        }
        if(dateTime.getDayOfMonth() >= 10)
        {
            day = ""+dateTime.getDayOfMonth();
        }
        else
        {
            day = "0"+dateTime.getDayOfMonth();
        }
        String number = dateTime.getYear()+""+month+""+day;
        return Integer.parseInt(number);

    }

    // ########## LONG METHODS ##########
    
    public static long localDateToLong(LocalDate date)
    {
        String month;
        String day;
        if(date.getMonthValue() >= 10)
        {
            month = ""+date.getMonthValue();
        }
        else
        {
            month = "0"+date.getMonthValue();
        }
        if(date.getDayOfMonth() >= 10)
        {
            day = ""+date.getDayOfMonth();
        }
        else
        {
            day = "0"+date.getDayOfMonth();
        }
        String number = date.getYear()+""+month+""+day+"0000";
        return Long.parseLong(number);
    }

    public static long localDateTimeToLong(LocalDateTime dateTime)
    {
        String month;
        String day;
        String hour;
        String minutes;
        if(dateTime.getMonthValue() >= 10)
        {
            month = ""+dateTime.getMonthValue();
        }
        else
        {
            month = "0"+dateTime.getMonthValue();
        }
        if(dateTime.getDayOfMonth() >= 10)
        {
            day = ""+dateTime.getDayOfMonth();
        }
        else
        {
            day = "0"+dateTime.getDayOfMonth();
        }
        if(dateTime.getHour() >= 10)
        {
            hour = ""+dateTime.getHour();
        }
        else
        {
            hour = "0"+dateTime.getHour();
        }
        if(dateTime.getMinute() >= 10)
        {
            minutes = ""+dateTime.getMinute();
        }
        else
        {
            minutes = "0"+dateTime.getMinute();
        }

        String number = dateTime.getYear()+""+month+""+day+""+hour+""+minutes;
        return Long.parseLong(number);
    }

    // ########## DATE METHODS ##########

    public static Date localDateToDate(LocalDate date)
    {
        return java.util.Date.from(date.atStartOfDay()
            .atZone(ZoneId.systemDefault())
            .toInstant());
    }

    public static Date localDateTimeToDate(LocalDateTime dateTime)
    {
        return java.util.Date
                .from(dateTime.atZone(ZoneId.systemDefault())
                .toInstant());
    }

    // ########## CALENDAR METHODS ##########
    
    public static Calendar localDateToCalendar(LocalDate date)
    {
        Calendar c = new GregorianCalendar(date.getYear(), date.getMonthValue(), date.getDayOfMonth());
        return c;
    }

    public static Calendar localDateTimeToCalendar(LocalDateTime dateTime)
    {
        Calendar c = new GregorianCalendar(dateTime.getYear(), dateTime.getMonthValue(), dateTime.getDayOfMonth(), dateTime.getHour(), dateTime.getMinute());
        return c;
    }

}
