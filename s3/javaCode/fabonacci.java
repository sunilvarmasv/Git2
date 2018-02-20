import java.util.Scanner;


public class fabonacci {

	public static void main(String[] args) {
		int f1=0;
		int f2=1;
		int f3=0;
		int number=10;
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter no limit for fabonacci series: ");
		int number=sc.nextInt();*/
		System.out.print(f1+","+f2);
		for(int i=2;i<number;i++){
			f3=f1+f2;
		System.out.print(","+f3);
			f1=f2;
			f2=f3;
			

	}

}
}
