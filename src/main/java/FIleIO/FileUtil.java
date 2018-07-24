package FIleIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil{

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
