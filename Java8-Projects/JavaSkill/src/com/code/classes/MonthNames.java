package com.code.classes;
import java.text.DateFormatSymbols;
import java.util.Locale;

public class MonthNames {
    public static void main(String[] args) {
        String[] months = new DateFormatSymbols().getMonths();
        for (int i = 0; i < months.length; i++) {
            String month = months[i];
            if(month.length() > 0) {
            	System.out.println("month = " + month);
            }
            
        }

        String[] shortMonths = new DateFormatSymbols(Locale.US).getShortMonths();
        for (int i = 0; i < shortMonths.length; i++) {
            String shortMonth = shortMonths[i];
            if(shortMonth.length() > 0) {
            	System.out.println("shortMonth = " + shortMonth);
            }
            
        }

        String[] germanyMonths = new DateFormatSymbols(Locale.US).getMonths();
        for (int i = 0; i < germanyMonths.length; i++) {
            String germanyMonth = germanyMonths[i];
            if(germanyMonth.length() > 0) {
            	 System.out.println("germanyMonth = " + germanyMonth);
            }
           
        }

        String[] germanyShortMonths = new DateFormatSymbols(Locale.US).getShortMonths();
        for (int i = 0; i < germanyShortMonths.length; i++) {
            String germanyShortMonth = germanyShortMonths[i];
            if(germanyShortMonth.length() > 0) {
            	System.out.println("germanyShortMonth = " + germanyShortMonth);
            }
            
        }
    }
}