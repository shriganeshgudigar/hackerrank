package array_geeks;

public class NumberPalindrome {
	public static void main(String args[]){
		int data =  123454321;
		Boolean bool = palindrome(data);
		if(bool){
			System.out.println("Data: " + data + " is a palindrome");
		}else{
			System.out.println("Data: " + data + " is not a plaindrome");
		}
	}
	
	public static Boolean palindrome(int data){
		Boolean flag = false;
		int[] arr = new int[10];
		int q = data, reminder, i = 0;
		while(q>0){
			reminder = q%10;
			q = q/10;
			arr[i] =  reminder;
			i =  i + 1;
		}
		for(int j=0, k=i-1; j<k; j++, k--){
			if(arr[j]==arr[k]){
				flag =  true;
			}else{
				flag = false;
				break;
			}
		}
		return flag;
	}
}
