package net.htlgrieskirchen.pos3.timeutil;

import org.junit.jupiter.api.Test;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeUtilProTest
{

    @Test
    void intToLocalDate()
    {
        int zahl = 20030201;
        LocalDate expected = LocalDate.of(2003,02,01);
        LocalDate result = TimeUtilPro.intToLocalDate(zahl);
        assertEquals(expected, result);
    }

    @Test
    void longToLocalDate()
    {
        long zahl = 200302011234L;
        LocalDate expected = LocalDateTime.of(2003,02,01,12,34).toLocalDate();
        LocalDate result = TimeUtilPro.longToLocalDate(zahl);
        System.out.println(expected);
        assertEquals(expected, result);
    }

    @Test
    void dateToLocalDate()
    {
        Date date = new Date(103,01,01);
        LocalDate expected = LocalDate.of(2003,02,01);
        LocalDate result = TimeUtilPro.dateToLocalDate(date);
        assertEquals(expected, result);
    }

    @Test
    void calendarToLocalDate()
    {
        Calendar c = new GregorianCalendar(2003,01,01);
        LocalDate expected = LocalDate.of(2003,02,01);
        LocalDate result = TimeUtilPro.calendarToLocalDate(c);
        assertEquals(expected, result);
    }

    @Test
    void intToLocalDateTime()
    {
        int zahl = 20030201;
        LocalDateTime expected = LocalDateTime.of(2003,02,01,0,0);
        LocalDateTime result = TimeUtilPro.intToLocalDateTime(zahl);
        assertEquals(expected, result);
    }

    @Test
    void longToLocalDateTime()
    {
        long zahl = 200302011234L;
        LocalDateTime expected = LocalDateTime.of(2003,02,01,12,34);
        LocalDateTime result = TimeUtilPro.longToLocalDateTime(zahl);
        assertEquals(expected, result);
    }

    @Test
    void dateToLocalDateTime()  {
        Date date = new Date(103,01,01, 12,34);
        LocalDateTime expected = LocalDateTime.of(2003,02,01,12,34);
        LocalDateTime result = TimeUtilPro.dateToLocalDateTime(date);
        assertEquals(expected, result);
    }

    @Test
    void calendarToLocalDateTime()
    {
        Calendar c = new GregorianCalendar(2003,01,01,12, 34);
        LocalDateTime expected = LocalDateTime.of(2003,02,01,12,34);
        LocalDateTime result = TimeUtilPro.calendarToLocalDateTime(c);
        assertEquals(expected, result);
    }

    @Test
    void localDateToInt()
    {
        LocalDate ld = LocalDate.of(2003,02,01);
        int expected = 20030201;
        int result = TimeUtilPro.localDateToInt(ld);
        assertEquals(expected,result);
    }

    @Test
    void localDateTimeToInt()
    {
        LocalDateTime ldt = LocalDateTime.of(2003,02,01,12,34);
        int expected = 20030201;
        int result = TimeUtilPro.localDateTimeToInt(ldt);
        assertEquals(expected,result);
    }

    @Test
    void localDateToLong()
    {
        long excepted = 200302010000L;
        long result = TimeUtilPro.localDateToLong(LocalDateTime.of(2003,02,01,00,00).toLocalDate());
        assertEquals(excepted, result);
    }

    @Test
    void localDateTimeToLong()
    {
        long excepted = 200302011234L;
        long result = TimeUtilPro.localDateTimeToLong(LocalDateTime.of(2003,02,01,12,34));
        assertEquals(excepted, result);
    }

    @Test
    void localDateToDate()
    {
        Date excepted = new Date(103,01,01);
        Date result = TimeUtilPro.localDateToDate(LocalDate.of(2003,02,01));
        assertEquals(excepted,result);
    }

    @Test
    void localDateTimeToDate()
    {
        Date excepted = new Date(103,01,01,12,34);
        Date result = TimeUtilPro.localDateTimeToDate(LocalDateTime.of(2003,02,01,12,34));
        assertEquals(excepted,result);
    }

    @Test
    void localDateToCalendar()
    {
        Calendar excepted = new GregorianCalendar(2003,02,01);
        Calendar result = TimeUtilPro.localDateToCalendar(LocalDate.of(2003,02,01));
        assertEquals(excepted,result);
    }

    @Test
    void localDateTimeToCalendar()
    {
        Calendar excepted = new GregorianCalendar(2003,02,01,12,34);
        Calendar result = TimeUtilPro.localDateTimeToCalendar(LocalDateTime.of(2003,02,01,12,34));
        assertEquals(excepted,result);
    }
}