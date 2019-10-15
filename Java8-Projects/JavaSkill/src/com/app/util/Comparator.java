/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.app.util;

import java.math.BigDecimal;

public class Comparator {
    public static boolean eq(BigDecimal b1, BigDecimal b2) {
        if (b1.compareTo(b2) == 0)
            return true;
        else
            return false;
    }

    public static boolean ne(BigDecimal b1, BigDecimal b2) {
        if (b1.compareTo(b2) != 0)
            return true;
        else
            return false;
    }

    public static boolean gt(BigDecimal b1, BigDecimal b2) {
        if (b1.compareTo(b2) == 1)
            return true;
        else
            return false;
    }

    public static boolean lt(BigDecimal b1, BigDecimal b2) {
        if (b1.compareTo(b2) == -1)
            return true;
        else
            return false;
    }

    public static boolean ge(BigDecimal b1, BigDecimal b2) {
        if (b1.compareTo(b2) >= 0)
            return true;
        else
            return false;
    }

    public static boolean le(BigDecimal b1, BigDecimal b2) {
        if (b1.compareTo(b2) <= 0)
            return true;
        else
            return false;
    }

    public static BigDecimal max(BigDecimal b1, BigDecimal b2) {
        if (gt(b1, b2)) {
            return b1;
        } else {
            return b2;
        }
    }

    public static BigDecimal min(BigDecimal b1, BigDecimal b2) {
        if (gt(b1, b2)) {
            return b2;
        } else {
            return b1;
        }
    }

     public static BigDecimal min(BigDecimal[] b1) {
         BigDecimal result=b1[0];
         if (b1.length>1) {
             for(int i=1;i<b1.length;i++) {
                 result = min(result,b1[i]);
             }
         }
         return result;
    }

     public static BigDecimal max(BigDecimal[] b1) {
         BigDecimal result=b1[0];
         System.out.println(result);
         if (b1.length>1) {
             for(int i=1;i<b1.length;i++) {
                 result = max(result,b1[i]);
             }
         }
         return result;
    }

//    public static boolean eqZero(BigDecimal b1) {
//        if (b1.compareTo(BaseConstants.DEFUALT_AMT) == 0)
//            return true;
//        else
//            return false;
//    }
//
//    public static boolean neZero(BigDecimal b1) {
//        if (b1.compareTo(BaseConstants.DEFUALT_AMT) != 0)
//            return true;
//        else
//            return false;
//    }

    public static void main(String[] args) {
        System.out.println(min(new BigDecimal("997000000"),new BigDecimal("500000000")));
        System.out.println(min(new BigDecimal("500000000"),new BigDecimal("997000000")));
    }
 }
