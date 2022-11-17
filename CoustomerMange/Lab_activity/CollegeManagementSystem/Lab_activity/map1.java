package collection;
import java.util.*;
public class map1 {
	public static void main(String[] args) {  
	    Map map=new HashMap();  
	    //Adding elements to map  
	    map.put(1,"Rajan");  
	    map.put(5,"Ankit");  
	    map.put(2,"mahi");  
	    map.put(6,"Amit");  
	    //Traversing Map  
	    Set set=map.entrySet();//Converting to Set so that we can traverse  
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    }  
	}  
	}  


