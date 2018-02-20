import java.io.IOException;
import java.util.Scanner;

// sum of cube of every digit is armstrong 
public class Armstrong {
	public static void IsArmstrong(int number) throws IOException{
		int arm=0;
		int remainder=0;
		int temp=number;
		
		while(number>0){
		remainder=number%10;
		arm=arm+remainder*remainder*remainder;
		number=number/10;
		}
		if(arm==temp){
			System.out.println(temp+" is armstrong");
		}
		else {
			System.out.println(temp+" is not armstrong");
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		IsArmstrong(num);
		
		}
			
}



