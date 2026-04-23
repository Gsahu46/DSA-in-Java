package practice.dsa.firstprogram;

import java.util.Scanner;

public class Secondclass {

	public static void main(String[] args) {
//		int age;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your Age: ");
		
		int age = sc.nextInt();
		if(age <= 0) {
			System.out.println("Your age is Invalid ");
		}
		else {
			System.out.println("Your age is Valid = " + age);
		}

	}

}
