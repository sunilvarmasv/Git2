import java.util.Scanner;


public class ReverseString {

	String value="";
	static String reverse="";
	public static String reverse(String str){

		for(int i=str.length()-1;i>=0;i--){
			reverse=reverse +str.charAt(i);
		}
		return reverse;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		System.out.println("String value before reverse is : "+str1);
		String reverseValue= reverse(str1);
		System.out.println("String value After reverse is : "+reverseValue);

	}

}
