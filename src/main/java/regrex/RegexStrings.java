package regrex;

public class RegexStrings{

    public static final String EXAMPLE_TEST = "MY";


    public static void main(String args[]){
        String str = "200";
        System.out.println(str.toString().matches("200" ));
        int i = Integer.parseInt(str.split("\\.")[0]);
        String[] splitString = (EXAMPLE_TEST.split("\\s+"));
        System.out.println(splitString.length);// should be 14
        for (String string : splitString) {
            System.out.println(string);
        }
        // replace all whitespace with tabs
        System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
    }
}
