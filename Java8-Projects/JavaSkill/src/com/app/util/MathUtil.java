package com.app.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MathUtil {

    public static BigDecimal pow(BigDecimal base, int exp) {
        return pow(base,new BigDecimal(""+exp));
    }
    
    public static BigDecimal pow(BigDecimal base, double exp) {
        return pow(base,new BigDecimal(""+exp));
    }

    public static BigDecimal pow(BigDecimal base, BigDecimal exp) {
        BigDecimal result = FormatUtil.defaultValue0();
        double b = base.doubleValue();
        double e = exp.doubleValue();
        double p = Math.pow(b, e);
        result = new BigDecimal(p);
        return result;
    }

//    public static BigDecimal divide(BigDecimal a, BigDecimal b) {
//        a = FormatUtil.null2Zero(a);
//        b = FormatUtil.null2Zero(b);
//        if (Comparator.eqZero(b)) {
//            return FormatUtil.defaultValue0();
//        } else {
//            return a.divide(b, BaseConstants.SCALE_8,BaseConstants.SYSTEM_ROUNDING);
//        }
//    }

    public static BigDecimal sum(List decimalList) {
        BigDecimal result = FormatUtil.defaultValue0();
        if (decimalList!=null) {
            for(int i=0;i<decimalList.size();i++) {
                result = result.add((BigDecimal)decimalList.get(i));
            }
        }
        return result;
    }

    public static BigDecimal sum(BigDecimal[] decimalArray) {
        BigDecimal result = FormatUtil.defaultValue0();
        if (decimalArray!=null) {
            return sum(Arrays.asList(decimalArray));
        }
        return result;
    }

//    public static BigDecimal avg(List listOfBidecimal) {
//        BigDecimal result = FormatUtil.defaultValue0();
//        if (listOfBidecimal!=null && listOfBidecimal.size()>0) {
//            BigDecimal sum = sum(listOfBidecimal);
//            BigDecimal n = new BigDecimal(listOfBidecimal.size());
//            result = sum.divide(n, BaseConstants.SCALE_8, BaseConstants.SYSTEM_ROUNDING);
//        }
//        return result;
//    }

//    public static BigDecimal avg(BigDecimal[] decimalArray) {
//        BigDecimal result = FormatUtil.defaultValue0();
//        if (decimalArray!=null) {
//            return avg(Arrays.asList(decimalArray));
//        }
//        return result;
//    }

    public static double normsinv(double p) {
        double a1 = -39.6968302866538, a2 = 220.946098424521, a3 = -275.928510446969;
        double a4 = 138.357751867269, a5 = -30.6647980661472, a6 = 2.50662827745924;
        double b1 = -54.4760987982241, b2 = 161.585836858041, b3 = -155.698979859887;
        double b4 = 66.8013118877197, b5 = -13.2806815528857, c1 = -7.78489400243029E-03;
        double c2 = -0.322396458041136, c3 = -2.40075827716184, c4 = -2.54973253934373;
        double c5 = 4.37466414146497, c6 = 2.93816398269878, d1 = 7.78469570904146E-03;
        double d2 = 0.32246712907004, d3 = 2.445134137143, d4 = 3.75440866190742;
        double p_low = 0.02425, p_high = 1 - p_low;
        double q, r;

        if (p < 0 || p > 1 || p==0) {
            //211212
            return 0;
            //return Double.NaN;
        } else {
            if (p < p_low) {
                q = Math.sqrt(-2 * Math.log(p));
                double value;
                value = (((((c1 * q + c2) * q + c3) * q + c4) * q + c5) * q + c6)
                        / ((((d1 * q + d2) * q + d3) * q + d4) * q + 1);
                return value;
            } else {
                if (p <= p_high) {
                    q = p - 0.5;
                    r = q * q;
                    double value;
                    value = (((((a1 * r + a2) * r + a3) * r + a4) * r + a5) * r + a6) * q
                            / (((((b1 * r + b2) * r + b3) * r + b4) * r + b5) * r + 1);
                    return value;
                } else {
                    q = Math.sqrt(-2 * Math.log(1 - p));
                    double value;
                    value = -(((((c1 * q + c2) * q + c3) * q + c4) * q + c5) * q + c6)
                            / ((((d1 * q + d2) * q + d3) * q + d4) * q + 1);
                    return value;
                }
            }
        }
        //return MathUtil.round(StatUtil.getInvCDF(p, true),10);
    }

    public static double normsdist(double z) {
        double t = (z > 0) ? z : (-z);
        double p = 1 - Math.pow((1 + (t * (0.0498673470 + t * (0.0211410061 + t
                * (0.0032776263 + t * (0.0000380036 + t * (0.0000488906 + t
                * 0.0000053830))))))), -16) / 2;

        return (z > 0) ? p : (1 - p);
    }

    public static double round(double value, int scale) {
        BigDecimal b = new BigDecimal(value);
        b = b.setScale(scale, BigDecimal.ROUND_HALF_UP);
        return b.doubleValue();
    }

    public static BigDecimal roundB(double value, int scale) {
        BigDecimal b = new BigDecimal(value);
        b = b.setScale(scale, BigDecimal.ROUND_HALF_UP);
        return b;
    }

    public static BigDecimal round(BigDecimal value, int scale) {
        value = value.setScale(scale + 1, BigDecimal.ROUND_CEILING);
        return value.setScale(scale, BigDecimal.ROUND_HALF_UP);
    }

    public static BigDecimal round0(BigDecimal value){
        //if(value!=null) value.setScale(0, BigDecimal.ROUND_HALF_UP);
        if(value!=null) value = round(value, 0);
        return value;
    }

    public static BigDecimal round1(BigDecimal value){
        //if(value!=null) value.setScale(1, BigDecimal.ROUND_HALF_UP);
        if(value!=null) value = round(value, 1);
        return value;
    }

    public static BigDecimal round2(BigDecimal value){
        //if(value!=null) value.setScale(2, BigDecimal.ROUND_HALF_UP);
        if(value!=null) value = round(value, 2);
        return value;
    }

    public static BigDecimal round3(BigDecimal value){
        //if(value!=null) value.setScale(3, BigDecimal.ROUND_HALF_UP);
        if(value!=null) value = round(value, 3);
        return value;
    }

    public static BigDecimal round4(BigDecimal value){
        //if(value!=null) value.setScale(4, BigDecimal.ROUND_HALF_UP);
        if(value!=null) value = round(value, 4);
        return value;
    }

    public static BigDecimal round5(BigDecimal value){
        //if(value!=null) value.setScale(5, BigDecimal.ROUND_HALF_UP);
        if(value!=null) value = round(value, 5);
        return value;
    }

    public static BigDecimal round6(BigDecimal value){
        //if(value!=null) value.setScale(6, BigDecimal.ROUND_HALF_UP);
        if(value!=null) value = round(value, 6);
        return value;
    }

    public static BigDecimal round7(BigDecimal value){
        //if(value!=null) value.setScale(7, BigDecimal.ROUND_HALF_UP);
        if(value!=null) value = round(value, 7);
        return value;
    }

    public static BigDecimal round8(BigDecimal value){
        //if(value!=null) value.setScale(8, BigDecimal.ROUND_HALF_UP);
        if(value!=null) value = round(value, 8);
        return value;
    }

    public static BigDecimal round15(BigDecimal value){
        //if(value!=null) value.setScale(15, BigDecimal.ROUND_HALF_UP);
        if(value!=null) value = round(value, 15);
        return value;
    }

    public static BigDecimal null20(BigDecimal value){
        if(value==null) value = new BigDecimal("0");
        return value;
    }

    public static BigDecimal percent8(BigDecimal value){
        //if(value!=null) value.setScale(8, BigDecimal.ROUND_HALF_UP);
        if(value!=null) {
            value = value.divide(new BigDecimal("100"), 8, BigDecimal.ROUND_HALF_UP);
        }
        return value;
    }

    public static void main(String[] args) {
//        List decimalList= new ArrayList();
//        for(int i=0;i<100000;i++) {
//            decimalList.add(new BigDecimal((Math.random()*1000000000+1)));
//        }
//        long start = System.currentTimeMillis();
//        System.out.println(sum(decimalList));
//        System.out.println("sum using "+ (System.currentTimeMillis() - start) +" millisec");
//        start = System.currentTimeMillis();
//        System.out.println(avg(decimalList));
//        System.out.println("avg using "+(System.currentTimeMillis() - start) + " millsec");
//        start = System.currentTimeMillis();
        BigDecimal a = new BigDecimal("0.251046");
        BigDecimal b = new BigDecimal("25.1046");
        BigDecimal c = new BigDecimal("25.1054");
        BigDecimal d = new BigDecimal("25.1044");
        b.setScale(3, BigDecimal.ROUND_CEILING);
        System.out.println("b =" +b);
//        System.out.println("a =" +round2(a));
//        System.out.println("b =" +round2(b));
        System.out.println("a =" +a.setScale(2, BigDecimal.ROUND_HALF_UP));
//        System.out.println("b =" +b.setScale(2, BigDecimal.ROUND_HALF_UP));
//        System.out.println("c =" +c.setScale(2, BigDecimal.ROUND_HALF_UP));
//        System.out.println("d =" +d.setScale(2, BigDecimal.ROUND_HALF_UP));

    }
}
