package array_geeks;

public class QuickSort{
	public static void main(String args[]){
		int[] arr =  {7,2,1,6,8,5,3,4};
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		System.out.println("\n");
		quickSort(arr, 0, arr.length-1);
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		return;
	}
	
	public static void quickSort(int[] arr, int start, int end){
		if(start < end){
			int pIndex = partition(arr, start, end);
			quickSort(arr, start, pIndex-1);
			quickSort(arr, pIndex+1, end);
		}
	}
	
	public static int partition(int[] arr, int start, int end){
		int pIndex = start;
		int pivot = arr[end];
		int temp ;
		for(int i=start; i<end; i++){
			if(arr[i]<= pivot){
				temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex =  pIndex + 1;
			}
		}
		arr[end] = arr[pIndex];
		arr[pIndex] = pivot;
		return pIndex;
	}
}
