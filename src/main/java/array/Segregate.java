package array;

public class Segregate {
	public static void main(String args[]){
		int arr[] = {0, 0, 1, 0,0,0,0, 1, 0,0,0,0,0};
		segregate(arr);
		for(int i=0; i<arr.length; i++){
			System.out.print(" " + arr[i] + " ");
		}
	}
	
	public static void segregate(int arr[]){
		int start = 0, end = arr.length -1,  temp;
		while(start < end){
			if(arr[start] < arr[end]){
				start =  start + 1;
				end = end - 1;
			}else if(arr[start] == arr[end] && arr[start] == 0){
				start =  start + 1;
			}else if(arr[start] == arr[end] && arr[end] == 1){
				end =  end - 1;
			}else if(arr[start] > arr[end]){
				temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start = start + 1;
				end =  end  - 1;
			}
		}
		
	}
}
