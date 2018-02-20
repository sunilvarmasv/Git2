import java.util.Scanner;


public class factorial2 {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		while(num>0){
			fact=fact*num;
			num--;
		}
		System.out.println("factorial is : "+fact);
	}

}
