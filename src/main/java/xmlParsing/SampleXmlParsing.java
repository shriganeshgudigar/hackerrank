package xmlParsing;

import FIleIO.FileUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.*;
import java.util.HashMap;
import java.util.List;

public class SampleXmlParsing {
    public static void main(String args[]){
        FileUtil fileUtil = new FileUtil();
        try {
            String str = fileUtil.readFile("D:\\Interview\\src\\main\\resources\\sampleXml.xml");
            FileInputStream file =  new FileInputStream("D:\\Interview\\src\\main\\resources\\sampleXml.xml");
            ParseXmlString parseXmlString =  new ParseXmlString();
            System.out.println("Coming to Parse");
            parseXmlString.readXmlString(file);
        }catch(Exception ex){
            System.out.println("Exception Class: " + ex.getClass().getName());
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}

class ParseXmlString{
    public void readXmlString(FileInputStream str)throws XPathExpressionException, ParserConfigurationException, SAXException, IOException{
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(str);
            XPath xpath = XPathFactory.newInstance().newXPath();
            System.out.println("Coming till here: ");
            NodeList nodeList = (NodeList) xpath.compile("class/student[1]/firstname").evaluate(doc, XPathConstants.NODESET);
            Node document = nodeList.item(0);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            Source xmlSource = new DOMSource(document);
            Result outputTarget = new StreamResult(outputStream);
            InputStream is = new ByteArrayInputStream(outputStream.toByteArray());
            System.out.println(nodeList.item(0).getTextContent());
            System.out.println(nodeList.item(0));
            System.out.println("Length: " + nodeList.getLength());
            System.out.println("NodeList: " + nodeList.item(0).getNodeName());
            System.out.println("NodeList: " + nodeList.item(0).getNodeValue());
            System.out.println("NodeList: " + nodeList.item(0).getChildNodes().item(2).getChildNodes().item(4).getNodeValue().toString());
//            HashMap<String, String> parsedXmlMap = parseXml(nodeList);
        }catch(XPathExpressionException ex){
            throw ex;
        }catch(ParserConfigurationException ex){
            throw ex;
        }catch(SAXException ex){
            throw ex;
        }catch(IOException ex){
            throw ex;
        }
    }

    private HashMap<String, String> parseXml(NodeList nodeList){
        if(nodeList.getLength() == 0){
            HashMap<String, String> map = new HashMap<String, String>();
            nodeList.item(0).getAttributes();
            String key = nodeList.item(0).getNodeName() + " | ";
//            map.put(nodeList.item(0).getAttributes())
            return map;
        }else {
            HashMap<String, String> tempHashMap = new HashMap<String, String>();
            for (int i = 0; i < nodeList.getLength(); i++) {
                HashMap<String, String> map = parseXml(nodeList.item(i).getChildNodes());
                for (String key : map.keySet()) {
                    tempHashMap.put(nodeList.item(i).getAttributes().toString(), "");
                }
            }

            return tempHashMap;
        }
    }
}
