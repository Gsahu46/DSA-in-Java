package practice.array;

class TwoSum{
	
	  boolean twoSumProblem(int[] arr, int target) {
		
		int n = arr.length;
		for(int i = 0; i < n; i++)
		{
			for(int j = i+1; j < n; j++) {
				if(arr[i] + arr[j] == target) {
					System.out.println("Yes target is found: " + arr[j]);
					return true;
				}
			}
		}
		return false;
		
	}
}

public class TwoSum_Main {

	public static void main(String[] args) {
		
		int arr[] = {0, -1, 6 , 5, -2};
		int target = -2;
		
		TwoSum n1 = new TwoSum();
		n1.twoSumProblem(arr, target);
	}

}
