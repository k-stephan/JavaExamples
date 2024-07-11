import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class readfile {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException
	{
		
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(new FileReader("D:\\Workspace\\apiqa\\src\\test\\resources\\createfirmdata"));
		System.out.println("Starting:"+ json);
		
		JSONObject name1 = (JSONObject) json.get("objApprovalEntity");
		//System.out.println(name1);

        JSONObject result1 = (JSONObject) name1.get("ObjBasicOffice");
       // System.out.println(result1);

        JSONObject result2 = (JSONObject) result1.get("PrimaryAddress");
        //System.out.println(result2);
        
        for (Object key : result2.keySet()) 
        {
        
        	String keyStr = (String)key;
        	Object keyvalue = result2.get(keyStr);
        	
            //System.out.println("key: "+ keyStr + " value: " + keyvalue);
            if (keyStr.equalsIgnoreCase("PostalCode")) 
            {
            	result2.put(keyStr.toString(), "23456");
               // System.out.println("key: "+ keyStr + " value: " + keyvalue);
            	
            	//Write into the file
                try (FileWriter file = new FileWriter("D:\\Workspace\\apiqa\\src\\test\\resources\\createfirmdata")) 
                {
                
                    file.write(json.toString());

                }
	
           }
          
       	
        }
       
        System.out.println("After"+json);
        	
	
	}

}
