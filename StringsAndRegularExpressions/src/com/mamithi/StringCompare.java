package com.mamithi;

public class StringCompare {
    public static void main(String[] args){
        String s1 = new String("hello");
        String s2 = "goodbye";
        String s3 = "Happy Birthday";
        String s4 = "happy birthday";

        System.out.printf(
              "s1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\n\n", s1, s2, s3, s4
        );

        if(s1.equalsIgnoreCase("hello")){
            System.out.println("s1 equals \"hello\"");
        }else{
            System.out.println("s1 does not equal \"hello\"");
        }

        if(s1 == "hello"){
            System.out.println("s1 is the same object as \"hello\"");
        }else{
            System.out.println("s1 is not the same object as \"hello\"");
        }

        if(s3.equalsIgnoreCase(s4)){
            System.out.printf("%s equals %s with case ignored\n", s3, s4);
        }else{
            System.out.println("s3 does not equal s4");
        }

        // test regionMatches (case sensitive)
        if(s3.regionMatches(0, s4, 0, 5)){
            System.out.println("First 5 characters of s3 and s4 match");
        }else{
            System.out.println("First 5 characters of s3 and s4 do not match");
        }

        // test region matches (ignore case)
        if(s3.regionMatches(true, 0, s4,0, 5)){
            System.out.println("First 5 characters of s3 and s4 match with case ignored");
        }else{
            System.out.println("First 5 characters of s3 and s4 do not match");
        }
    }
}
