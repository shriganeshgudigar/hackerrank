package array;

public class Rotation {
	public static void main(String[] args) {
		System.out.println("hello");
		int arr[] = {1,2,3,4,5};
		int rotation =  5;//2 left rotation.
		reverse(arr, rotation, arr.length-1);
		reverse(arr, 0, rotation-1);
		reverse(arr, 0, arr.length-1);
		int k = 0;
		
		while(k < arr.length ){
			System.out.print(arr[k] + " ");
			k = k + 1;
		}
		return;
	}
	
	public static int[] rotation(int arr[], int noOfPosition){
		int j=0, prev;
		while(j<noOfPosition){
			int temp = arr[arr.length-1];
			int i = arr.length - 1;
			while(i != 0){
				prev = arr[i-1];
				System.out.println("prev " + prev + " i-1 " + (i -1));
				arr[i-1] = temp;
				temp = prev;
				i = i - 1;
			}
			arr[arr.length-1] = temp;
			j =  j + 1;
		}
		return arr;
	}

	//reversal algorithm.

	public static void reverse(int arr[], int startIndex, int endIndex){
		int i=startIndex, j=endIndex, temp =0;
		while(i<j){
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		int k = 0;

	}

	public static void rotationReversalAlgorithm(int arr[], int rotationCount){

	}
}
