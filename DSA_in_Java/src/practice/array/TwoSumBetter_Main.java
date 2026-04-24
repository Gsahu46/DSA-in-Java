package practice.array;

import java.util.Arrays;

class DSA{

	boolean twoSum(int arr[], int target)
	{
		Arrays.sort(arr);
		
		int left = 0, right = arr.length - 1;
		
		while(left < right)
		{
			int sum = arr[left] + arr[right];
			
			if(sum == target)
			{
				return true;
			}
			else if(sum < target)
			{
				left++;
			}
			else
			{
				right--;
			}
		}
		return false;
	}
	
}


public class TwoSumBetter_Main {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,6,8,9,0};
		int target = 6;
		
		DSA l1 = new DSA();
		
		
		if(l1.twoSum(arr, target)) {
			System.out.println("Digit is found: " + target);
			
		}
		else {
			System.out.println("Digit is not found");
		}		

	}	

}
