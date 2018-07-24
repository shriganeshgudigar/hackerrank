package array_geeks;

public class PairOfGivenSum {
	public static void main(String[] args){
		int arr[] = {1,2,3,4,5,6,7};
		sumOfPair(arr, 5);
		return;
	}
	
	public static void sumOfPair(int arr[],int sum){
		int start = 0, end = arr.length-1;
		
		while(start < end){
			if((arr[start]+arr[end]) == sum){
				System.out.println("Start: " + arr[start] + " End: " + arr[end]);
				start = start + 1;
				end = end - 1;
			}else if(arr[start]+arr[end] > sum){
				end =  end - 1;
			}else if(arr[start]+arr[end] < sum){
				start = start + 1;
			}
		}
		return;
	}
}
