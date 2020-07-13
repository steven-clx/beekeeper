package com.steven.beekeeper.util;

import com.steven.beekeeper.constant.DateFormat;

import java.text.ParseException;
import java.util.Date;


public class Parser {

    public static Boolean parseBoolean(String str) {
        if (str == null) return null;
        return Boolean.parseBoolean(str);
    }

    public static Double parseDouble(String str) {
        if (str == null) return null;
        return Double.parseDouble(str);
    }

    public static Date parseDate(String str) throws ParseException {
        if (str == null) return null;
        return DateFormat.FULL_DATE_FORMAT.parse(str);
    }

}
