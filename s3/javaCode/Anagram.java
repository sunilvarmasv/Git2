import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Scanner;

//checking wether two strings are same or not..
public class Anagram  {

	public static void IsAnagram(String word,String anagram){
		int found=0;
		 int length1=word.length();
		 int length2=anagram.length();
		 if(length1!=length2){
			 throw new RuntimeException("Given Strings should be in same length !");
		 }
		 
		for(int i=0;i<length1;i++){
	
			for(int j=0;j<length1;j++){
				if(word.charAt(i)==anagram.charAt(j)){
					found++;
					break;
				}
			}
			}
			if(length1==found){
				System.out.println("String is anagram !!");
			}else
			{
				System.out.println("String is not anagram !");
			}

		 
	}
			
public static void main(String[] args) {
				
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the first string: ");
			 String value=sc.next();
			System.out.println("Enter the first string: ");
			String second=sc.next();
			IsAnagram(value, second);
			System.out.println("Bijendra file.seperate value is :"+System.getProperty("file.separator"));
			
	}


}
