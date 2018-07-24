package array_geeks;

public class MergeSort{
	public static  void main(String args[]){
		int arr[] =   {7,2,1,6,8,5,3,4};
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		System.out.println("\n");
		mergeSort(arr);
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void mergeSort(int[] arr){
		if(arr.length <= 1){
			return;
		}else{
			int mid = arr.length/2;
			int l[]= new int[mid];
			int r[]= new int[arr.length-mid];
			for(int i=0; i<mid; i++){
				l[i] = arr[i];
			}
			for(int i=mid,j=0; i<arr.length; i++,j++){
				r[j] = arr[i];
			}
			mergeSort(l);
			mergeSort(r);
			merge(l, r, arr);
		}
	}
	
	public static void merge(int[] l, int[] r, int[] arr){
		int i=0, j=0, k=0;
		while(i < l.length && j < r.length){
			if(l[i] < r[j]){
				arr[k] = l[i];
				i = i + 1;
			}else{
				arr[k] = r[j];
				j = j + 1;
			}
			k = k + 1;
		}
		if(i < l.length){
			while(i < l.length){
				arr[k] = l[i];
				i = i + 1;
				k = k + 1;
			}
		}else{
			while(j < r.length){
				arr[k] = r[j];
				j = j + 1;
				k = k + 1;
			}
		}
			
	}
}
