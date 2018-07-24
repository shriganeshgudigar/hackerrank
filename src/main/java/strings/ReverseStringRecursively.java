package strings;

public class ReverseStringRecursively {
    public static void main(String[] args){
        String str = "MORNING";
        ReverseStringRecursively.reverseRecur(str);
        System.out.println("rstr: " + rstr.toString());
    }

    public static StringBuilder rstr = new StringBuilder();

    public static void reverseRecur(String str){
        if(str.length()==2){
            return;
        }else{
            reverseRecur(str.substring(1));
            str =  str.substring(1);
            rstr.append(str.charAt(1));
            return;
        }
    }
}
