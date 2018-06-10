package com.mamithi.studentpoll;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Random;

public class StudentPoll {
    public static void main(String[] args) {
        Random random = new Random();
        int[] responses = new int[20];
        int[] frequency = new int[6];

        for(int counter = 0; counter < 20; counter++){
            responses[counter] = 1 + random.nextInt(5);
        }

        for(int answer = 0; answer < responses.length; answer++){
          try{
              ++frequency[responses[answer]];
          } catch (ArrayIndexOutOfBoundsException e){
              System.out.println(e);
              System.out.printf(" responses[%d] = %d\n\n",
                      answer, responses[answer]);
          }
        }

        System.out.printf("%s%10s\n", "Rating", "Frequency");

        for(int rating = 1; rating < frequency.length; rating++){
            System.out.printf("%6d%10d\n", rating, frequency[rating]);
        }
    }
}
