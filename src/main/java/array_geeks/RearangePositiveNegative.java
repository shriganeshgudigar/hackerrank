package array_geeks;

public class RearangePositiveNegative{
	public static void main(String args[]){
		int arr[]={-1, -2, -3, -4, 5, 6, -7, 8, 9};
		rearrange(arr);
		for(int i=0; i<arr.length; i++){
			System.out.print(" " + arr[i] + " ");
		}
	}
	
	public static void rearrange(int[] arr){
		int pIndex = partition(arr);
		int temp;
		int i=0, j = pIndex;
		for(int k=0; k<arr.length; k++){
			System.out.print(" after " + arr[k] + " ");
		}
		while( i<arr.length && j<arr.length){
			temp = arr[i];
			arr[i] =arr[j];
			arr[j] =temp;
			j= j + 1;
			i = i+2;
		}
	}
	
	public static int partition(int[] arr){
		int pivot = 0;
		int pIndex = 0;
		int temp;
		for(int i=0; i<arr.length; i++){
			if(arr[i] < pivot){
				temp = arr[pIndex];
				arr[pIndex] = arr[i];
				arr[i] = temp;
				pIndex = pIndex + 1;
			}
		}
		return pIndex;
	}
}
