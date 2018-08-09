package com.mamithi.spring1.learnspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);

		System.out.println(result);


//		SpringApplication.run(LearnSpringApplication.class, args);
	}
}
