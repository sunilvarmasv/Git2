import java.util.Scanner;


public class ReverseOFNumber {
	
	static int  reverseNumber=0;
	static int remainder=0;
	
	public static int reversNumber(int number){
		
		while(number>0){
		remainder=number%10;
		reverseNumber=reverseNumber*10+remainder;
		number=number/10;
	}
		return reverseNumber;

	}
	public static void main(String[]args){
	
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int reverse=reversNumber(number);
		System.out.println("reverse of the "+number+" is :"+reverse);
	}

}
