package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        int bobsalary = 15000;
        int garysalary = 23000;
        System.out.println(Math.max(bobsalary,garysalary));

        String HighestSalary = "garysalary";
        System.out.println(Math.max(bobsalary, garysalary));

        int carprice = 10000;
        int truckprice = 30000;
        System.out.println(Math.min(carprice, truckprice));


    }

}
