package regrex;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegecPatternMatcher {

    public static final String EXAMPLE_TEST = "uru kk \"total\":  1";
    public static void main(String args[]){
        System.out.println("date:" + LocalDate.now().toString().replaceAll("-", "_"));
        Pattern pattern =  Pattern.compile("\"total\":\\s+{0,3}1");
        Matcher matches =  pattern.matcher(EXAMPLE_TEST);
        if(EXAMPLE_TEST.contains("")){
            System.out.println("print true");
        }else{
            System.out.println("print false");
        }
        if(matches.find()){
            System.out.println("trueeevdfdvf");
        }
        while(matches.find()){
            System.out.println(matches);
            System.out.println("Start: " + matches.start());
            System.out.println("End: " + matches.end());
            System.out.println("Matches group: " + matches.group());
            if(matches.group().toString().matches("\\w+\\s+\\w+")){
                System.out.println("Matching");
            }
        }
        Set<Long> expec = new LinkedHashSet<Long>();
        expec.add(123L);
        System.out.println(expec);
    }

}
