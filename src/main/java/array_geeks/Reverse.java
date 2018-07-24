package array_geeks;

public class Reverse {
	public static void main(String args[]){
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int d =  2;

		int[] arr1 = reverse(arr, 0, d-1);
		int[] arr2 = reverse(arr1, d, arr.length-1);
		int[] arrfinale = reverse(arr2, 0, arr2.length-1);
		for(int i=0; i<arrfinale.length; i++){
			System.out.println("Array ele at " + (i+1) + " " + arrfinale[i]);
		}
		return;
	}
	
	/**
	 * reversal algorithm for array rotation.
	 */
	
	public static int[] reverse(int arr[], int start, int end){
		int temp;
		while(start < end){
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start = start + 1;
			end = end - 1;
		}
		return arr;
	}
}
