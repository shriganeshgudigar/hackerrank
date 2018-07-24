
package test;

import java.util.LinkedHashMap;

class Test2 {

    public static void main(String args[]){
        xSignature();
        return ;
    }


    public static void xSignature(){
        // Your API Key and secret
//        trade retail client
		String apiKey = "h2dptp9dwmvu4pj7fy49yfgj";
		String Secret = "TG9gwvMDja";

//        		wholesale client
//        String apiKey = "a63g8wsuvkgukkz6v92jdfxx";
//        String Secret = "k4PG5AnsDq";



        String signature = org.apache.commons.codec.digest.DigestUtils
                .sha256Hex(apiKey + Secret + System.currentTimeMillis() / 1000);
        System.out.println(signature);
        return ;
    }

}