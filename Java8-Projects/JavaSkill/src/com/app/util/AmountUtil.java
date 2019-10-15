/**
 * Insert the class' description here.
 * Creation date: Dec 24, 2003 3:46:49 PM
 * @author: jintanac
 * @Version : <version>
 * @See : <class>
 * Last Update :Dec 24, 2003 3:46:49 PM
 */

package com.app.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class AmountUtil {

	public static String displayAmount(BigDecimal amt) {
		if (amt == null)
			amt = new BigDecimal("0.00");

		DecimalFormat df = new DecimalFormat("###,###,###,##0.00");
		return df.format(amt.doubleValue());
	}

	public static BigDecimal displayBigDecimal(String amt) {
		if (amt == null)
			return new BigDecimal("0.00");
		DecimalFormat df = new DecimalFormat("###########0.00");
		return (BigDecimal) df.formatToCharacterIterator(amt);
	}

	public static String displayQty(BigDecimal amt) {
		if (amt == null)
			amt = new BigDecimal("0.00");

		DecimalFormat df = new DecimalFormat("###,###,###,###");
		return df.format(amt.doubleValue());
	}
	
	public static BigDecimal round(BigDecimal amt, int numMovePoint, int mod, int modRemainRound) {
		if (amt == null)
			return new BigDecimal("0.00");

		long l1 = amt.movePointRight(numMovePoint).longValue();
		long l2 = l1 % mod;
		long discountAmount = 0;
		if (l2 <= modRemainRound)
			discountAmount = -l2;
		else
			discountAmount = mod - l2;
		l1 += discountAmount;

		return new BigDecimal(String.valueOf(discountAmount)).movePointLeft(numMovePoint);
	}

	private static String padLeft(String in, int size, char padChar) {                
	    if (in.length() <= size) {
	        char[] temp = new char[size];
	        
	        for(int i =0;i<size;i++){
	            temp[i]= padChar;
	        }
	        int posIniTemp = size-in.length();
	        for(int i=0;i<in.length();i++){
	            temp[posIniTemp]=in.charAt(i);
	            posIniTemp++;
	        }            
	        return new String(temp);
	    }
	    return "";
	}
}
