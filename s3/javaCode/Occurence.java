import java.util.Scanner;


public class Occurence {

	public static void main(String args[]){
	    Scanner scanner = new Scanner(System.in); 
	    String word; 
	    System.out.println("Enter String:"); 
	    word=scanner.nextLine(); 
	    for (int i=0;i<word.length();i++){
	         if(word.charAt(i)==' '){
	              continue;
	         }
	         boolean flag=false;
	        for(int j=0;j<i;j++){	
	      	   if(word.charAt(i)==word.charAt(j)){
	                   flag=true;
	              }    
	         }
	      if(flag==false){
	              int count=0;
	              for(int k=i;k<word.length();k++){
	                   if(word.charAt(i)==word.charAt(k)){
	                        count++;
	                   }
	              }
	              System.out.println(word.charAt(i)+"="+count+"times");
	          }
	    }
	}
}

