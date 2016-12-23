package training_projects;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class program3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enumeration names;
		Enumeration values;

		   String key = null;
		 
		 Hashtable<String, Integer> hashtable =new Hashtable<String, Integer>();
		 hashtable.put("A",75);
		 hashtable.put("B",65);
		 hashtable.put("C",85);
		 hashtable.put("D",95);
		 hashtable.put("E",55);
		 
		 List<Object> maxKeyList=new ArrayList<Object>();
	        Integer maxValue = 0; 
	       
	        for(Map.Entry<String, Integer> entry : hashtable.entrySet()) {
	             if(entry.getValue() > maxValue) {
	                 maxValue = entry.getValue();
	                key= entry.getKey();
	             }
	        }
	        System.out.println("max Keys : "+key);
		
	 
		}
	
}