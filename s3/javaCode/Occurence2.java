import java.util.Scanner;




public class Occurence2 {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	String value = sc.next();
	wordCount(value);
}

private static void wordCount(String value) {
	
	
	boolean flag=false;
	for(int i=0; i< value.length()-1; i++){
		for(int j=0;j<i;j++){
			if(value.charAt(i)==value.charAt(j))
				flag=true;
			
		}
		if(flag==false){
			int count=0;
			for(int k=i;k<value.length();k++){
				if(value.charAt(i)==value.charAt(k))
					count++;
			}
			System.out.println("letter is: "+value.charAt(i)+" count is: "+count);
		}
	}
	
}
}
