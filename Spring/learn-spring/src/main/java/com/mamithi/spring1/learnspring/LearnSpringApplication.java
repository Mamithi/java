package com.mamithi.spring1.learnspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class LearnSpringApplication {

    public static void main(String[] args) {
//        BinarySearch binarySearch = new BinarySearch(new QuickSortAlgorithm());



		ApplicationContext applicationContext =
                SpringApplication.run(LearnSpringApplication.class, args);

		BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);

        System.out.println(result);

    }
}
