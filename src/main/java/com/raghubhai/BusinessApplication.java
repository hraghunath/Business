package com.raghubhai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BusinessApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusinessApplication.class, args);
		String str="raghunath";
		String reverse="";
		for(int i=str.length()-1;i>=0;i++){
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Revese of the string is::"+reverse);
	}

}
