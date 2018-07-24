package JsonParsing;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Set;

public class SampleJsonParsing{

    public static void main(String args[]){
        try {
            FileUtil fileUtil =  new FileUtil();
            String str = fileUtil.readFile("D:\\Interview\\src\\main\\resources\\sampleJson.json");
            ParseJsonString parseJsonString = new ParseJsonString();
            parseJsonString.readJsonString(str);
        }catch(Exception ex){
            System.out.println("Exception Message" + ex.getMessage());
        }

    }
}


class ParseJsonString{

    public void readJsonString(String jsonString) throws ParseException {
        JSONParser jsonParser = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject)jsonParser.parse(jsonString);
            parseJson(jsonObject);
            for(String key:tempHashMap.keySet()){
                System.out.println("Key: " + key + ", Value: " + tempHashMap.get(key));
            }
        }catch(ParseException exObj){
            throw exObj;
        }
    }


    /**
     * @author sgudigar@sapient.com
     * @param jsonObject
     * @return HashMap<String, String>
     * parses Json recursively.
     */
    HashMap<String, String> tempHashMap =  new HashMap<String, String>();
    private HashMap<String, String> parseJson(JSONObject jsonObject){
        HashMap<String, String> n = new HashMap<String, String>();
            for(Object key:jsonObject.keySet()){
                if(jsonObject.get(key).getClass().getName().matches("org.json.simple.JSONObject")){
                    n = parseJson((JSONObject)(jsonObject.get(key)));
                    for(String k:n.keySet()){
                        tempHashMap.put(key+" | " + k, n.get(k));
                    }
                }else if(jsonObject.get(key).getClass().getName().matches("org.json.simple.JSONArray")){
                    for(Object json:((JSONArray)jsonObject.get(key))) {
                        HashMap<String, String> m = parseJson(((JSONObject) json));
                        if(m.containsKey("code") && key.toString().matches("rooms")){
                            for (String k : m.keySet()) {
                                n.put(key + "_" + m.get("code") + " | " + k, m.get(k));
                            }
                        }else if(m.containsKey("checkIn") && key.toString().matches("shiftRates")){
                            for (String k : m.keySet()) {
                                n.put(key + "_" + m.get("checkIn") + " | " + k, m.get(k));
                            }
                        }else if(m.containsKey("code") && key.toString().matches("hotels")){
                            for (String k : m.keySet()) {
                                n.put(key + "_" + m.get("code") + " | " + k, m.get(k));
                            }
                        }else {
                            for (String k : m.keySet()) {
                                n.put(key + " | " + k, m.get(k));
                            }
                        }
                    }
                }else{
                    n.put(key.toString(), jsonObject.get(key).toString());
                }
        }
        return n;
    }

}

class FileUtil{

    /**
     * @author sgudigar@sapient.com
     * @param  fileName
     * @return String
     * @throws IOException
     */
    public String readFile(String fileName) throws IOException{
        fileName =  fileName.replaceAll("\\\\|/", "\\\\\\\\");
        StringBuilder str = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                str.append(line);
            }
        }catch(FileNotFoundException ex){
            throw ex;
        }catch(IOException ex){
            throw ex;
        }finally{
            return str.toString();
        }
    }
}