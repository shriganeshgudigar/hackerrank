package FIleIO;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class readExcel {
    public static void main(String args[]){
        try {
            readexcel("123");
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }

    public static void readexcel(String filePath)throws FileNotFoundException, IOException{
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("D:\\CrossSell\\test.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            Sheet firstSheet = workbook.getSheet("GTA_HBG_DATA_test");
            Row row = firstSheet.getRow(0);
            Iterator<Cell> cellIterator = row.cellIterator();
            ArrayList headerList  = new ArrayList();
            while(cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                headerList.add(getCellValue(cell).toString());
            }

            Iterator<Row> rowIterator = firstSheet.rowIterator();
            ArrayList<LinkedHashMap<String,String>> allRows = new ArrayList<LinkedHashMap<String, String>>();
            int cellCount =  headerList.size();
            while(rowIterator.hasNext()){
                Row nextRow  =  rowIterator.next();
                int itr = 0;
                LinkedHashMap<String, String> dataMap = new LinkedHashMap<String, String>();
                while(itr < cellCount){
                    String header = headerList.get(itr).toString();
                    if(nextRow.getCell(itr) != null) {
                        Cell cell = nextRow.getCell(itr);
                        dataMap.put(header, getCellValue(cell).toString());
                    }else{
                        dataMap.put(header, "");
                    }
                    itr  = itr + 1;
                }

                allRows.add(dataMap);
            }
            Iterator allrowsIterator =  allRows.iterator();
            System.out.println("Row count: " + allRows.size());
            while(allrowsIterator.hasNext()) {
                Object obj = ((Object) allrowsIterator.next());
                LinkedHashMap<String, String> map = ((LinkedHashMap<String, String>) obj);
                for(Map.Entry<String, String> map1: map.entrySet()){
                    System.out.println("Key: " + map1.getKey() + " Value " + map1.getValue());
                }
                System.out.println("\n");
            }
            System.out.println("DataMap: ");
        }catch(FileNotFoundException ex){
            throw ex;
        }catch(IOException ex){
            throw ex;
        }
    }

    public static Object getCellValue(Cell cell){
        Object value =null;
        try {
            switch ((cell.getCellType())) {
                case 1:
                    value =  cell.getStringCellValue();
                    break;
                case 4:
                    value =  cell.getBooleanCellValue();
                    break;
                case 0:
                    value =  cell.getNumericCellValue();
                    break;
                default:
                    System.out.println("coming hererer");
                    value = null;
            }
        }catch(Exception ex){
            System.out.println("dfr");
            System.out.println(ex.getMessage());
        }finally{
            return value;
        }

    }

    public static LinkedList<LinkedList<String>> readExcelWithoutHeader(String fileName, String sheetName)throws FileNotFoundException, IOException{
        LinkedList<LinkedList<String>> allRows = new LinkedList<LinkedList<String>>();
        try{
            FileInputStream fileInputStream = new FileInputStream(new File("D:\\CrossSell\\test.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            Sheet firstSheet = workbook.getSheet("GTA_HBG_DATA_test");
            Iterator<Row> rowIterator = firstSheet.rowIterator();
            while(rowIterator.hasNext()){
                Row currentRow = rowIterator.next();
                Iterator<Cell> cellIterator = currentRow.cellIterator();
                LinkedList<String> currentList = new LinkedList<String>();
                while(cellIterator.hasNext()){
                    Cell currentCell = cellIterator.next();
                    currentList.add(getCellValue(currentCell).toString());
                }
                allRows.add(currentList);
            }
        }catch(FileNotFoundException ex){
            throw ex;
        }catch(IOException ex){
            throw ex;
        }
        return allRows;
    }
}