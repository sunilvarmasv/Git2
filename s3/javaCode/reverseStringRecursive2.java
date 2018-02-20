import java.util.Scanner;


public class reverseStringRecursive2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String to reverse");
		String sentnc=sc.next();
		String s=reversseString(sentnc);
		System.out.println(s);
		

	}

	private static String reversseString(String sentnc) {
		if(sentnc.length()==0){
			return "";
	
		}else{
			return reversseString(sentnc.substring(1))+sentnc.charAt(0);
			
			
		}
		
	}

}
