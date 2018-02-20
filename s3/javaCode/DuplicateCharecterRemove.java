import java.util.Scanner;


public class DuplicateCharecterRemove {

	public static void main(String[] args) {
	String word="aaaaaaaaaaa";
		boolean[] found=new boolean[256];
		StringBuffer sb=new StringBuffer();
		char[] charecters=word.toCharArray();
		for(char ch:charecters){
			if(!found[ch]){
				found[ch]=true;
				sb.append(ch);
			}
		}
		System.out.println("After remove duplicate word: "+sb);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
}

