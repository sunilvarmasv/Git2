package s3one;

import java.util.ArrayList;
import java.util.ListIterator;

public class lists1{  
public static void main(String args[]){  
	
ArrayList<String> al=new ArrayList<String>();  


al.add("Selenium");  
al.add("Katalon");  
al.add("Guava");  
al.add("Xamarin");  


System.out.println("element at 2nd position: "+al.get(2));  



ListIterator<String> itr=al.listIterator();  
System.out.println("traversing elements in forward direction...");  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  



System.out.println("traversing elements in backward direction...");  
while(itr.hasPrevious()){  
System.out.println(itr.previous());  
}  
}  
}  
