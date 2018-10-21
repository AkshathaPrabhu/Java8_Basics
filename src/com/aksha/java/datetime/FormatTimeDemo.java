package com.aksha.java.datetime;

import java.time.*;
import java.time.format.*;

/**
 * Created by z002959 on 11/15/17.
 */
public class FormatTimeDemo {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println("Date in DD MM YYYY format");
        String formatStr1 = "dd/MM/YYYY";
        String formatStr2 = "dd MM YYYY";
        String indianFormat = DateTimeFormatter.ofPattern(formatStr1).format(today);
        System.out.println(indianFormat);

        LocalDateTime todayDateTime = LocalDateTime.now();
        System.out.println("Standard format : "+ todayDateTime);

        String datetimeFormat = "dd MMM YYYY";
        System.out.println(DateTimeFormatter.ofPattern(datetimeFormat).format(today));


    }
}
