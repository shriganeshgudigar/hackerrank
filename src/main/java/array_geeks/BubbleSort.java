package array_geeks;

public class BubbleSort {
	public static void main(String args[]){
		int arr[] = {7,6,5,4,3,2,1};
		bubbleSort(arr);
		for(int i=0; i<arr.length; i++){
			System.out.println("Array ele at index " + i + " " + arr[i]);
		}
	}
	
	/**
	 * Big O(n2)
	 * sorts in ascending order;
	 */
	public static int[] bubbleSort(int arr[]){
		int temp;
		for(int j=0; j<=(arr.length-2); j++){
			for(int i=0; i<=(arr.length-2-j); i++){
				if(arr[i] > arr[i+1]){
					temp =  arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
	}
}
