package tg;

public class StringCombination {
    public static void main(String args[]){
        TG tg = new TG();
        String str = tg.OriginalString("decfbgah");
        System.out.println(str);
    }
}

class TG{
    public String OriginalString(String modStr){
        modStr = modStr.trim();
        StringBuilder orgStr = new StringBuilder("");
        if(modStr.length()>0){
            int i = 0;
            for(i=modStr.length()-2; i>=0;){
                orgStr.append(modStr.charAt(i));
                i=i-2;
            }
            if(i%2==0){
                i = 1;
            }
            else{
                i=0;
            }
            while(i<modStr.length()){
                orgStr.append(modStr.charAt(i));
                i=i+2;
            }
        }else{
            return orgStr.toString();
        }
        return orgStr.toString();
    }
}
