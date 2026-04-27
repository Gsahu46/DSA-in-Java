package practice.array;

import java.util.Scanner;

public class MajorityElement {
	
	
	public static int majorityElement(int[] nums) {
		int candidate = 0;
		int count = 0;
		
		for(int num : nums) {
			if(count == 0) {
				candidate = num;
			}
			
			if(num == candidate) {
				count++;
			}
			else {
				
				count--;
			}
		}
		return candidate;
		
	}
	public static void main(String[] args) {
		
		int[] num1 = new int[10]; // = {3, 2, 1, 9, 7, 2, 1, 8, 2};
		int[] num2 = {7, 22, 64, 89, 22, 22, 88, 55, 64, 89, 64};
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements: ");
		for(int i = 0; i < num1.length; i++) {
			
			num1[i] = sc.nextInt();
		}
		
		
		System.out.println("Majority element is: " + majorityElement(num1));
		System.out.println("Majority element is: " + majorityElement(num2));
		

	}
}
