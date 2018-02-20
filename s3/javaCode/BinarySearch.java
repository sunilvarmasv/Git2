import java.util.Scanner;


public class BinarySearch {

	public static void main(String[] args) {
		int first,last,middle=0;
		int[] arr=new int[5];
		first=0;
		last=arr.length;
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		
		}
		System.out.println("Enter Element to tbe searched : ");
		int ele=sc.nextInt();     								// 1 2 3 4 5
		for(int j=0;j<=last;j++){
			if(first<last)
			middle= (last+first)/2;
			if(arr[middle]<ele) 
				first=middle+1;
			else if(arr[middle]==ele) {
				System.out.println("Element found at location "+(middle+1));
				break;
			}
			else{
				last=middle-1;
			}
			
		}
	
		
		}

	}

