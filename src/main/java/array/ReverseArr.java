package array;

public class ReverseArr {
	
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,6};
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		ReverseArr.reverseArr(arr);
		System.out.println ("\n");
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	public static int[] reverseArr(int[] arr){
		int temp;
		int start = 0, end = arr.length -1;
		while(start < end){
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start =  start + 1;
			end =  end - 1;
		}
		return arr;
	}
}
