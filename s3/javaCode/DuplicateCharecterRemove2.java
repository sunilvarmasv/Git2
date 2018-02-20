import java.util.Scanner;



public class DuplicateCharecterRemove2 {

	public static void main(String[] args) {
	String word="bijekumarjha";
	char[] charecters=word.toCharArray();
	boolean[] found= new boolean[256];
	StringBuffer sb=new StringBuffer();
	for(char ch:charecters){
		if(!found[ch]){
			found[ch]=true;
			sb.append(ch);
		}
	}
	System.out.println(sb);
	
}
}
