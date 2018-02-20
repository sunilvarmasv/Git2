import java.util.Scanner;


public class Prime2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		for (int i=1;i<=num;i++){
			boolean Isprime=true;
			for(int j=0;j<=i/2;j++){
				if(i%j==0){
					Isprime=false;
					break;
				}
			}if(Isprime)
			System.out.println("Prime number is: "+i);
		}
	}

}
