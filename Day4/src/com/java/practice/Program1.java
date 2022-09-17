package com.java.practice;
import java.util.Scanner;

class Client{
	public String firstname;
	public String lastname;
	public int order;
	public int payment;
	
	public String showFullName() {
		return firstname+"  "+lastname;
	}
	
}

public class Program1 {
	public static void main(String[] args) {
		Client c1 = new Client();
		
		c1.firstname = "Naruto";
		c1.lastname = "Uzumaki";
		
		System.out.println(c1.showFullName());
	}

}
