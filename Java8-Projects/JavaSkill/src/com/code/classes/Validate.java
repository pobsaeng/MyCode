package com.code.classes;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

public class Validate {

    // Can not create instance
    private Validate() {}

    public static boolean isKTBUser(String userId) {
        if (userId == null || userId.trim().length() == 0) {
            return false;
        }
        return userId.matches("\\d\\w*");
    }
    //valid all type objects
    public static boolean isEmpty(Object object) {
        if (object == null) {
            return true;
        } else if (object instanceof String) {
            String str = (String) object;
            if (str.trim().equals("")) {
                return true;
            }
        } else if (object instanceof Collection) {
            Collection collection = (Collection) object;
            if (collection.isEmpty()) {
                return true;
            }
        } else if (object instanceof Map) {
            Map map = (Map) object;
            if (map.size() == 0) {
                return true;
            }
        } else if (object.getClass().isArray()) {
            Object[] array = (Object[]) object;
            if (array.length == 0) {
                return true;
            }
            boolean result = true;
            for (int i = 0; i < array.length; i++) {
                result = result && isEmpty(array[i]);
            }
            return result;
        }
        return false;
    }

    public static boolean required(Object object) {
        if (object == null) {
            return false;
        } else if (object instanceof String) {
            String str = (String) object;
            if (str.trim().equals("")) {
                return false;
            }
        } else if (object instanceof Collection) {
            Collection collection = (Collection) object;
            if (collection.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static boolean minLength(String data, int min) {
        if (data == null) {
            return false;
        }
        if (data.length() < min) {
            return false;
        }
        return true;
    }

    public static boolean maxLength(String data, int max) {
        if (data == null) {
            return false;
        }
        if (data.length() > max) {
            return false;
        }
        return true;
    }

    public static boolean length(String data, int min, int max) {
        if (data == null) {
            return false;
        }
        if (data.length() < min) {
            return false;
        }
        if (data.length() > max) {
            return false;
        }
        return true;
    }

    public static boolean renge(int data, int min, int max) {
        if (data < min) {
            return false;
        }
        if (data > max) {
            return false;
        }
        return true;
    }

    public static boolean renge(double data, double min, double max) {
        if (data < min) {
            return false;
        }
        if (data > max) {
            return false;
        }
        return true;
    }

    public static boolean renge(BigDecimal data, BigDecimal min, BigDecimal max) {
        if (data == null) {
            return false;
        }
        if (min != null && data.compareTo(min) < 0) {
            return false;
        }
        if (max != null && data.compareTo(max) > 0) {
            return false;
        }
        return true;
    }

    public static boolean renge(Date data, Date min, Date max) {
        if (data == null) {
            return false;
        }
        if (min != null && data.getTime() < min.getTime()) {
            return false;
        }
        if (max != null && data.getTime() > max.getTime()) {
            return false;
        }
        return true;
    }

    public static boolean isIntNumber(String num){
        try{
            Integer.parseInt(num);
        } catch(NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
