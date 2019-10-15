package com.code.classes;

import java.util.Arrays;
import java.util.List;

public class StringUtil {

    public static String trim(String orgStr) {
        if (orgStr == null || (orgStr != null && orgStr.equalsIgnoreCase("null"))) {
            return "";
        } else {
            return orgStr.trim();
        }
    }

    public static boolean isEmpty(String orgStr) {
        return "".equals(trim(orgStr));
    }

    public static boolean valueIn(String value, String[] strList) {
        List list = Arrays.asList(strList);
        return list.contains(value);
    }
    public static String uiKcs(String paraStr){
        if(isEmpty(paraStr)){
            return "--";
        }else{
            return paraStr.trim();
        }
        
    }
}
