package com.mamithi.time1test;

import com.mamithi.time1.Time1;

public class Time1Test {
    public static void main(String[] args) {
        Time1 time1 = new Time1();

        System.out.print("The initial universal time is: ");
        System.out.println(time1.toUniversalString());
        System.out.print("The initial standard time is: ");
        System.out.println(time1.toString());

        time1.setTime(13, 27, 6);
        System.out.print("Universal time after setTime is: ");
        System.out.println(time1.toUniversalString());
        System.out.print("Standard time after setTime is: ");
        System.out.println(time1.toString());
        System.out.println();

        try{
            time1.setTime(99, 99, 99);
        }catch (IllegalArgumentException e){
            System.out.printf("Exception: %s\n\n", e.getMessage());
        }

        System.out.println("After attempting invalid setting");
        System.out.print("Universal time: ");
        System.out.println(time1.toUniversalString());
        System.out.print("Standard time: ");
        System.out.println(time1.toString());
    }
}
