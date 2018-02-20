import java.util.Scanner;


public class BublooSort {

	public static void main(String[]args){
		int num[]={1,4,3,2,0,8,7,9};
		System.out.println("Number before sorting are: ");
		for(int i=0;i<=num.length-1;i++){
			System.out.print(+num[i]);
		}
		bubleSort(num);
		System.out.println("Number after sorting are: ");
		for(int i=0;i<=num.length-1;i++){
			System.out.print(+num[i]);
		}
	}

	private static void bubleSort(int[] num) {
		 int temp=0;
		int n=num.length;
		 for(int i=0;i<=n;i++){
			 for(int j=1;j<=n-1;j++){
				 if(num[j-1]>num[j]){
					 temp=num[j];
					 num[j]=num[j-1];
					 
					 num[j-1]=temp;
				 }
			 }
		 }
		
	}
}