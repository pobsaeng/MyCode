package com.code.classes;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FormatUtil {

    public static final BigDecimal percentVal = new BigDecimal("100.0000");
    public static final DecimalFormat amountFormat = new DecimalFormat("###,##0");
    public static final DecimalFormat amount2DigitFormat = new DecimalFormat("###,##0.00");
    public static final DecimalFormat amount3DigitFormat = new DecimalFormat("###,##0.000");
    public static final DecimalFormat amount4DigitFormat = new DecimalFormat("###,##0.0000");
    public static final DecimalFormat amount5DigitFormat = new DecimalFormat("###,##0.00000");
    public static final SimpleDateFormat usDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    public static final SimpleDateFormat usTimestampFormat = new SimpleDateFormat("yyyy/MM/dd:HH:mm", Locale.US);
    public static final SimpleDateFormat thaiDateFormat = new SimpleDateFormat("dd/MM/yyyy", new Locale("th", "TH"));
    public static final SimpleDateFormat thaiDateFormat2 = new SimpleDateFormat("yyyy", new Locale("th", "TH"));
    public static final SimpleDateFormat engDateFormat2 = new SimpleDateFormat("yyyy", new Locale("en", "US"));
    public static final SimpleDateFormat thaiDateShortFormat = new SimpleDateFormat("dd/MM/yy", new Locale("th", "TH"));
    public static final SimpleDateFormat thaiDate4FileFormat = new SimpleDateFormat("ddMMyyyy", new Locale("th", "TH"));
    public static final SimpleDateFormat thaiDate6FileFormat = new SimpleDateFormat("yyyyMM", new Locale("th", "TH"));
    public static final SimpleDateFormat thaiDate7FileFormat = new SimpleDateFormat("MMMM G yyyy", new Locale("th", "TH"));
    public static final DecimalFormat amountDBFormat = new DecimalFormat("#####0");
    public static final DecimalFormat amountDB2DigitFormat = new DecimalFormat("#####0.00");
    public static final DecimalFormat amountDB4DigitFormat = new DecimalFormat("#####0.0000");
    public static final DecimalFormat amountDB5DigitFormat = new DecimalFormat("#####0.00000");
    public static final DecimalFormat amountDB6DigitFormat = new DecimalFormat("#####0.000000");
    public static final DecimalFormat amountDB8DigitFormat = new DecimalFormat("#####0.00000000");
    public static final DecimalFormat amountDB15DigitFormat = new DecimalFormat("#####0.000000000000000");
    public static final DecimalFormat display8DigitFormat = new DecimalFormat("####.########");
    public static final DecimalFormat display2DigitFormat = new DecimalFormat("###,###,###,###.##");
    //public static final StringFormatter usMMFormat(Date dueDate, String format);

    public static String formatddMMyyTH(Date date) {

        try {
            return thaiDateShortFormat.format(date);
        } catch (Exception e) {
            return "";
        }
    }

    public static String formatmmmmYYYYTH(String date) {
        String d1 = date;
        d1 = d1.substring(3, 7);
        String d2 = date;
        d2 = d2.substring(7, 9);
        int i1 = Integer.parseInt(d1);
        i1 = i1; //+ 543;
        String tmp = "" + i1 + d2;

        try {
            Date d = new SimpleDateFormat("yyyyMM").parse(tmp);
            String d3 = FormatUtil.formatEmptyString(FormatUtil.formatddMMyyyyTH7File(d));

            return d3;
        } catch (Exception e) {
            return "";
        }
    }

    public static String formatmmmmYYYYTH2(String date) {
        String tmp = date.trim();


        try {
            Date d = new SimpleDateFormat("yyyyMM").parse(tmp);
            String d3 = FormatUtil.formatEmptyString(FormatUtil.formatddMMyyyyTH7File(d));

            return d3;
        } catch (Exception e) {
            return "";
        }
    }

    public static String formatmmmmYYYYTH3(String date) {
        String tmp = date;
        tmp = tmp.replace("between", "");
        System.out.println("date " + tmp);
        String date1 = tmp;
        date1 = tmp.substring(0, 7);
        date1 = date1.substring(0, 5)+"/"+date1.substring(5, 7);
        String date2 = tmp;
        date2 = tmp.substring(11, 18);
        date2 = date2.substring(0, 5)+"/"+date2.substring(5, 7);
        System.out.println("date1 " + date1);
        System.out.println("date2 " + date2);
        try {
            //Date d = new SimpleDateFormat("yyyy/MM").parse("2013/01");            
            Date d = new SimpleDateFormat("yyyy/MM").parse(date1);
            String d3 = FormatUtil.formatEmptyString(FormatUtil.formatddMMyyyyTH7File(d));
            
            //Date d2 = new SimpleDateFormat("yyyy/MM").parse("2013/07");
            Date d2 = new SimpleDateFormat("yyyy/MM").parse(date2);
            String d4 = FormatUtil.formatEmptyString(FormatUtil.formatddMMyyyyTH7File(d2));
            return d3 +" ถึ�? "+d4;
        } catch (Exception e) {
            return "";
        }
    }

    public static String formatddMMyyyyTH(Date date) {

        try {
            return thaiDateFormat.format(date);
        } catch (Exception e) {
            return "";
        }
    }

    public static String formatyyyyTH(Date date) {

        try {
            return thaiDateFormat2.format(date);
        } catch (Exception e) {
            return "";
        }
    }

    public static String formatyyyyEn(Date date) {

        try {
            return engDateFormat2.format(date);
        } catch (Exception e) {
            return "";
        }
    }

    public static String formatddMMyyyyTH4File(Date date) {

        try {
            return thaiDate4FileFormat.format(date);
        } catch (Exception e) {
            return "";
        }
    }

    public static String formatddMMyyyyTH6File(Date date) {

        try {
            return thaiDate6FileFormat.format(date);
        } catch (Exception e) {
            return "";
        }
    }

    public static String formatddMMyyyyTH7File(Date date) {

        try {
            return thaiDate7FileFormat.format(date);
        } catch (Exception e) {
            return "";
        }
    }

    public static Date toDateTH(String string) {
        try {
            return thaiDateFormat.parse(string);
        } catch (Exception e) {
            return null;
        }
    }

    public static Date toDateTHShort(String string) {
        try {
            return thaiDateShortFormat.parse(string);
        } catch (Exception e) {
            return null;
        }
    }

    public static Date toDate(String string) {
        try {
            return usDateFormat.parse(string);
        } catch (Exception e) {
            return null;
        }
    }

    //===============
    public static int usMMFormat(Date date, String format) {
        try {

            SimpleDateFormat form = new SimpleDateFormat(format);
            return Integer.parseInt(form.format(date));

        } catch (Exception e) {
            return 0;
        }
    }
    //===============

    public static String formatDBdate(Date date) {
        try {
            return "'" + usDateFormat.format(date) + "'";
        } catch (Exception e) {
            return "NULL";
        }
    }

    public static String formatCurrency(BigDecimal aValue) {
        try {
            if (aValue == null) {
                return "0";
            }
            return amountFormat.format(aValue);
        } catch (Exception e) {
            return "0";
        }
    }

    public static String formatCurrency2Digi(BigDecimal aValue) {
        try {
            return amount2DigitFormat.format(aValue);
        } catch (Exception e) {
            return "0.00";
        }
    }

    public static String formatCurrency2DigiOrDash(BigDecimal aValue) {
        try {
            if (aValue != null) {
                return amount2DigitFormat.format(aValue);
            } else {
                return "--";
            }

        } catch (Exception e) {
            return "0.00";
        }
    }

    public static String formatCurrency4Digi(BigDecimal aValue) {
        try {
            return amount4DigitFormat.format(aValue);
        } catch (Exception e) {
            return "0.0000";
        }
    }

    public static String formatCurrency4DigiOrDash(BigDecimal aValue) {
        try {
            if (aValue != null) {
                return amount4DigitFormat.format(aValue);
            } else {
                return "--";
            }

        } catch (Exception e) {
            return "0.00";
        }
    }

    public static String formatCurrency3Digi(BigDecimal aValue) {
        try {
            return amount3DigitFormat.format(aValue);
        } catch (Exception e) {
            return "0.000";
        }
    }

    public static String formatCurrency5Digi(BigDecimal aValue) {
        try {
            return amount5DigitFormat.format(aValue);
        } catch (Exception e) {
            return "0.00000";
        }
    }

    public static BigDecimal string2BigDecimal(String text) {
        try {
            return new BigDecimal(text);
        } catch (Exception e) {
            return new BigDecimal("0");
        }
    }

    public static int string2Integer(String text) {
        try {
            return Integer.parseInt(text.trim());
        } catch (Exception e) {
            return 0;
        }
    }

    public static String string2String(String text) {
        try {
            if (!Validate.isEmpty(text) && "null".equalsIgnoreCase(text.trim())) {
                return "";
            } else {
                return text.trim();
            }

        } catch (Exception e) {
            return "";
        }
    }

    public static int obj2Integer(Object obj) {
        try {
            return Integer.parseInt(String.valueOf(obj));
        } catch (Exception e) {
            return 0;
        }
    }

    public static BigDecimal obj2Bigdecimal(Object obj) {
        try {
            if (obj != null) {
                return (BigDecimal) obj;
            } else {
                return new BigDecimal("0.00");
            }

        } catch (Exception e) {
            return new BigDecimal("0.00");
        }
    }

    public static String formatPercent(BigDecimal val) {
        try {
            val = val.multiply(percentVal);
            return formatCurrency3Digi(val);

        } catch (Exception e) {
            return "0.000";
        }
    }

    public static String formatPercentWithSign(BigDecimal val) {
        return formatPercent(val) + "%";
    }

    public static String formatPercentOrDash(BigDecimal val) {
        try {
            if (val != null) {
                val = val.multiply(percentVal);
                return formatCurrency3Digi(val);
            } else {
                return "--";
            }

        } catch (Exception e) {
            return "0.000";
        }
    }

    public static String formatPercent2DigiOrDash(BigDecimal val) {
        try {
            if (val != null) {
                val = val.multiply(percentVal);
                val = val.setScale(3, BigDecimal.ROUND_CEILING);
                val = val.setScale(2, BigDecimal.ROUND_HALF_UP);
                return formatCurrency2Digi(val);
            } else {
                return "--";
            }

        } catch (Exception e) {
            return "0.000";
        }
    }

    public static String formatPercentOrDashWithSign(BigDecimal val) {
        return formatPercentOrDash(val) + "%";
    }

    public static String formatPercentNoPrec(BigDecimal val) {
        try {
            val = val.multiply(percentVal);
            return formatCurrency(val);
        } catch (Exception e) {
            return "0.00";
        }
    }

//    public static BigDecimal string2Percent(String text) {
//        try {
//
//            if (text.indexOf(".") < 0) {
//                text += ".0000";
//            }
//
//            BigDecimal val = new BigDecimal(text);
//            val = val.setScale(BaseConstants.SCALE_8);
//            return val.divide(percentVal, BigDecimal.ROUND_HALF_UP);
//        } catch (Exception e) {
//            return new BigDecimal("0.00");
//        }
//    }

    public static BigDecimal string2Percent8Digi(String text) {
        try {

            if (text.indexOf(".") < 0) {
                text += ".00000000";
            }

            BigDecimal val = new BigDecimal(text);
            return val.divide(percentVal, 8, BigDecimal.ROUND_HALF_UP);
        } catch (Exception e) {
            return new BigDecimal("0.00000000");
        }
    }

    public static String formatDBString(String text) {
        if (text != null) {
            return (text.trim().length() == 0) ? null : "'" + text.trim().replaceAll("'", "''") + "'";
        } else {
            return "''";
        }
    }

    public static String formatDBString4Prepare(String text) {
        if (text != null) {
            return (text.trim().length() == 0) ? null : text.trim().replaceAll("'", "''");
        } else {
            return " ";
        }
    }

    public static String formatDBStringDefault(String text) {
        if (text != null) {
            return (text.trim().length() == 0) ? null : "'" + text.trim().replaceAll("'", "''") + "'";
        } else {
            return "NULL";
        }
    }

    public static String obj2String(Object obj) {
        try {
            if (obj == null) {
                return "";
            } else {
                return String.valueOf(obj);
            }
        } catch (Exception e) {
            return "";
        }
    }

    public static String getStrCurrDate() {
        return formatddMMyyyyTH(Calendar.getInstance().getTime());
    }

    public static Date getCurrDate() {
        return Calendar.getInstance().getTime();
    }

    public static String getCurrTimestamp() {
        return usTimestampFormat.format(Calendar.getInstance().getTime());
    }

    public static String getStrCurrDate4File() {
        return formatddMMyyyyTH4File(Calendar.getInstance().getTime());
    }

    public static String formatEmptyDashString(String text) {
        if (Validate.isEmpty(text)) {
            return "--";
        } else {
            return text.trim();
        }
    }

    public static String formatEmptyString(String text) {
        if (Validate.isEmpty(text)) {
            return "";
        } else {
            return text.trim();
        }
    }

    public static String formatEmptyHtml(String text) {
        if (Validate.isEmpty(text)) {
            return "&nbsp;";
        } else {
            return text.trim();
        }
    }

    public static String formatDBCurrency(BigDecimal aValue) {
        try {
            return amountDBFormat.format(aValue);
        } catch (Exception e) {
            return "0";
        }
    }

    public static String formatDBCurrency2Digi(BigDecimal aValue) {
        try {
            return amountDB2DigitFormat.format(aValue);
        } catch (Exception e) {
            return "0";
        }
    }

    public static String formatDBCurrency4Digi(BigDecimal aValue) {
        try {
            return amountDB8DigitFormat.format(aValue);
        } catch (Exception e) {
            return "0";
        }
    }

    public static String formatDBCurrency5Digi(BigDecimal aValue) {
        try {
            return amountDB5DigitFormat.format(aValue);
        } catch (Exception e) {
            return "0";
        }
    }

    public static String formatDBCurrency6Digi(BigDecimal aValue) {
        try {
            return amountDB6DigitFormat.format(aValue);
        } catch (Exception e) {
            return "0";
        }
    }

    public static String formatDBCurrency8Digi(BigDecimal aValue) {
        try {
            return amountDB8DigitFormat.format(aValue);
        } catch (Exception e) {
            return "0";
        }
    }

    public static String formatDBCurrency15Digi(BigDecimal aValue) {
        try {
            return amountDB15DigitFormat.format(aValue);
        } catch (Exception e) {
            return "0";
        }
    }

    public static String formatDBPercent8Digi(BigDecimal aValue) {
        try {
            aValue = aValue.divide(percentVal, BigDecimal.ROUND_HALF_UP);
            return amountDB8DigitFormat.format(aValue);
        } catch (Exception e) {
            return "0";
        }
    }

    public static BigDecimal null2Zero(BigDecimal b1) {
        if (b1 != null) {
            return b1;
        } else {
            return new BigDecimal("0");
        }
    }

    public static BigDecimal minZero(BigDecimal b1) {
        if (b1 != null && b1.compareTo(defaultValue0()) >= 0) {
            return b1;
        } else {
            return new BigDecimal("0");
        }
    }

    public static BigDecimal defaultValue0() {
        return new BigDecimal("0");
    }

    public static BigDecimal defaultValue1() {
        return new BigDecimal("1");
    }

    public static BigDecimal defaultValue12() {
        return new BigDecimal("12");
    }

    public static BigDecimal valueMultiply100(BigDecimal b1) {
        if (b1 != null) {
            return b1.multiply(new BigDecimal("100.00"));
        } else {
            return new BigDecimal("0.00");
        }
    }

//    public static BigDecimal valueDivideBy100(BigDecimal b1) {
//        if (b1 != null) {
//            return b1.divide(new BigDecimal("100"), BaseConstants.SCALE_8, BaseConstants.SYSTEM_ROUNDING);
//        } else {
//            return new BigDecimal("0");
//        }
//    }

    public static String formatDisplay8Digit(BigDecimal aValue) {
        try {
            return display8DigitFormat.format(aValue);
        } catch (Exception e) {
            return "0";
        }
    }

    public static String formatDisplayPercent8Digit(BigDecimal aValue) {
        try {
            aValue = aValue.multiply(percentVal);
            return display8DigitFormat.format(aValue);
        } catch (Exception e) {
            return "0";
        }
    }

    public static String formatDisplayYesNo(String flagVal) {
        if (flagVal != null) {
            if (flagVal.equalsIgnoreCase("Y")) {
                return "Yes";
            } else if (flagVal.equalsIgnoreCase("N")) {
                return "No";
            } else {
                return "";
            }
        } else {
            return "";
        }
    }

    public static String trimText(String text) {
        if (text != null) {
            return text.trim();
        } else {
            return "";
        }
    }

//    public static BigDecimal trans2Percent(BigDecimal val) {
//        try {
//            return val.divide(percentVal, BaseConstants.SCALE_8, BaseConstants.SYSTEM_ROUNDING);
//        } catch (Exception e) {
//            return new BigDecimal(" 0.0000");
//        }
//    }

    public static String formatDBCurrency2DigiDefault(BigDecimal aValue) {
        try {
            if (aValue == null) {
                return "NULL";
            }
            return amountDB2DigitFormat.format(aValue);
        } catch (Exception e) {
            return "NULL";
        }
    }

    public static String formatDBCurrency5DigiDefault(BigDecimal aValue) {
        try {
            if (aValue == null) {
                return "NULL";
            }
            return amountDB5DigitFormat.format(aValue);
        } catch (Exception e) {
            return "NULL";
        }
    }

    public static String formatDBCurrency8DigiDefault(BigDecimal aValue) {
        try {
            if (aValue == null) {
                return "NULL";
            }
            return amountDB8DigitFormat.format(aValue);
        } catch (Exception e) {
            return "NULL";
        }
    }

    public static String formatDisplay2Digi(BigDecimal aValue) {
        try {
            return display2DigitFormat.format(aValue);
        } catch (Exception e) {
            return "0";
        }
    }

    public static String formatDisplay2DigiOrDash(BigDecimal aValue) {
        try {
            if (aValue != null) {
                return display2DigitFormat.format(aValue);
            } else {
                return "--";
            }

        } catch (Exception e) {
            return "0";
        }
    }

    public static String formatDisplayOrDash(BigDecimal aValue) {
        try {
            if (aValue != null) {
                return amountFormat.format(aValue);
            } else {
                return "--";
            }

        } catch (Exception e) {
            return "0";
        }
    }

    public static String formatPercentDisplay2DigiOrDash(BigDecimal aValue) {
        try {
            if (aValue != null) {
                aValue = aValue.multiply(percentVal);
                return display2DigitFormat.format(aValue);
            } else {
                return "--";
            }

        } catch (Exception e) {
            return "0";
        }

    }

    public static void main(String[] args) {
//        System.out.println(formatDBCurrency8Digi(string2Percent("-1")));

    }
}
