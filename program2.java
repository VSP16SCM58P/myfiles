package training_projects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class program2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int i=0;
		//Scanner scanner=
		 HashMap hm = new HashMap();
		// Put elements to the map
	      hm.put("A", new Double(3434.34));
	      hm.put("B", new Double(123.22));
	      hm.put("C", new Double(1378.00));
	      hm.put("D", new Double(99.22));
	      hm.put("E", new Double(-19.08));
	      Iterator it = hm.entrySet().iterator();
	      while (it.hasNext()) {
	          Map.Entry pair = (Map.Entry)it.next();
	          System.out.println(pair.getKey() + " = " + pair.getValue());
	         
	      }
	      
		 
	}
}
