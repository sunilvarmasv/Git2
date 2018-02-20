package s3one;

import java.util.HashSet;
import java.util.Iterator;

class Hashset{  
	 public static void main(String args[]){  
	  //Creating HashSet and adding elements  
		 
	  HashSet<String> set=new HashSet<String>();  
	  set.add("Hash");  
	  set.add("Set");  
	  set.add("Hash");  
	  set.add("Set");  
	  
	  //Traversing elements  
	  Iterator<String> itr=set.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  
	}  




