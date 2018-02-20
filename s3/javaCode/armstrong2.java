import java.util.Scanner;




public class armstrong2 {

	public static void main(String[] args) {
		int remainder=0,result=0;
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		while(num>0){
			remainder=num%10;
			result=result+remainder*remainder*remainder;
			num=num/10;
		}
		if(result==temp){
			System.out.println("After calculating Result value is :"+result);
			System.out.println("Temp value is :"+temp);
			System.out.println("Number is armstrong !");
		}else {
			System.out.println("Not armstrong");
			System.out.println("After calculating Result value is :"+result);
			System.out.println("Temp value is :"+temp);
		}

	}

}
