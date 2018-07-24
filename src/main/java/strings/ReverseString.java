package strings;
import java.lang.String;

public class ReverseString{
    public static void main(String[] args) {
        String str =  "Morning";
        StringBuilder s = new StringBuilder();
        for(int i = str.length()-1; i>=0; i--){
            s.append(str.charAt(i));
        }
        System.out.println("Reversed String: " + s.toString());
        System.out.println(s.charAt(0));

        int[] arr ={1,2,3};
        StringBuilder st =  new StringBuilder();
        for(int i : arr){
            st.append("\'" + i +"\'" + ",");
        }
        System.out.println(st.toString());
    }



}
