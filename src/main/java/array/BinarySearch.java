package array;

public class BinarySearch {
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,6,7};
		Boolean flag =  binarySearch(arr, 9);
		if(flag){
			System.out.println("Present");
		}else{
			System.out.println("Absent");
		}
	}
	
	public static Boolean binarySearch(int arr[], int searchEle){
		Boolean flag = false;
		int start = 0, end = arr.length - 1 ;
		int mid = (start + end)/2;
		while(start <= end){
			System.out.println("Start mid end" + start +" " +mid + " "+end );
			if(searchEle == arr[mid]){
				flag = true ;
				break;
			}else if(searchEle < arr[mid]){
				end = mid -1;
				mid = (start + end)/2;
			}else if(searchEle > arr[mid]){
				start = mid + 1;
				mid = (start + end)/2;
			}
		}
		return flag;
	}
}
