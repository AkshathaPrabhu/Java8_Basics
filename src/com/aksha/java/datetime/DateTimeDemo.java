package com.aksha.java.datetime;

import java.time.*;

/**
 * Created by z002959 on 11/15/17.
 */
public class DateTimeDemo {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateAndTime =  LocalDateTime.now();
        System.out.println(dateAndTime);

        LocalDate purchaseDate = LocalDate.now();
        LocalDate expiryDate = purchaseDate.plusYears(2);

        Period expiryTime = Period.between(purchaseDate,expiryDate);
        System.out.println(expiryTime);

        LocalTime presentTime = LocalTime.now();
        LocalTime newTime = presentTime.plusHours(3).plusMinutes(25).plusSeconds(15);

        Duration showStartTime = Duration.between(presentTime,newTime);
        System.out.println(showStartTime);

        System.out.println(Instant.now());// gives the greenwich mean time (UTC)
        System.out.println(Instant.now().atZone(ZoneId.of("Asia/Kolkata")));     //Getting date of particular zone



        //Adding a period to a date
        Period toBeAdded = Period.of(2,5,0);
        LocalDate rightNow = LocalDate.of(2015,11,13);
        System.out.println( rightNow.plus(toBeAdded));






    }
}
