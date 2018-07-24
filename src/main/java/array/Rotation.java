package array;

public class Rotation {
	public static void main(String[] args) {
		System.out.println("hello");
		int arr[] = {1,2,3,4,5};
		int rotation =  2;
		int finalArr[] = rotation(arr, rotation);
		int k = 0;
		
		while(k < finalArr.length ){
			System.out.print(finalArr[k] + " ");
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
}
