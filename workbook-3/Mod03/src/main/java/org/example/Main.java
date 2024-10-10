package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");


        String formattedDateTime = dateTime.format(formatter);

        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
}