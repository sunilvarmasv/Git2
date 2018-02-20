import java.util.Scanner;




public class Factorial {

	public static void main(String[] args) {
		int	fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number for factorial");
		int number=sc.nextInt();
		for(int i=number;i>0;i--){
		fact=fact*i;
			
		}System.out.print(fact);
		
		

	}

}
