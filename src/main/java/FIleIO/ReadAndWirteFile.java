package FIleIO;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ReadAndWirteFile {

    public static void main(String args[]) {

        try {
            System.out.println(System.getProperty("user.dir"));
            String path = System.getProperty("user.dir") + "//src//main//resources//123.txt";
            FileReader file = new FileReader(path);
            BufferedReader fileReader= new BufferedReader(file);
            String line = null;
            while((line = fileReader.readLine()) != null){
                System.out.println("Line: "+ line);
            }
        }catch(FileNotFoundException obj){
            System.out.println("obj1:" + obj.getClass().getName().toString());
        }catch(IOException obj){
            System.out.println("obj2:" + obj.getClass().getName().toString());
        }


    }
}

