
public class Pallindrome {
	public static void main (String[]args){
		int reaminder=0,reverse=0;
		int number=222;
		int temp=number;
		while (number>0){
		reaminder=number%10;
		reverse=reverse*10+reaminder;
		number=number/10;
		}
		if(reverse==temp){
			System.out.println("Number is pallindrome !!");
		}else {
			System.out.println("Number is not pallindrome");
		}
	}

}
