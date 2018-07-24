package strings;

public class StringPalindrome {

	public static void  main(String[] args){
		String str =  "MADAM";
		Boolean flag = false;
		for(int i=0, j=str.length()-1; i<j; i++, j--){
			if(str.charAt(i)==str.charAt(j)){
				flag = true;
			}else{
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("Data: " + str + " is a palindrome");
		}else{
			System.out.println("Data: " + str + " is not a plaindrome");
		}
	}
}
