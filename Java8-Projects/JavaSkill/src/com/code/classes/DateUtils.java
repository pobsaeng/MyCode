package com.code.classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateUtils {
    public static Date addDate(Date date,int add){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, add);
        return c.getTime();
    }

    public static Date addMonth(Date date,int add){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.MONTH, add);
        return c.getTime();
    }

    public static Date addYear(Date date,int add){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.YEAR, add);
        return c.getTime();
    }
    public static void main(String[] args){
        SimpleDateFormat format  = new SimpleDateFormat("yyyy-MM-dd",Locale.US);
        Date d = addMonth(new Date(), 1);
        System.out.println(format.format(d));
    }
}
