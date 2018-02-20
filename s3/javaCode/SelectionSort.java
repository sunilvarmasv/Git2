
public class SelectionSort {

	public static void main(String[] args) {
		int arr[]={1,4,3,2,0,8,7};
		selectionSort(arr);
     for(int i=0;i<=arr.length-1;i++)
    	 System.out.print(arr[i]);
     }


	private static void selectionSort(int[] arr) {
		int index=0;
		int smallestnumber=0;
		
		for(int i=0;i<arr.length-1;i++){
			
			index=i;
			for(int j=i+1;j<=arr.length-1;j++){
				
			if(arr[j]<arr[index]){
				index=j;
			}
			
		}smallestnumber=arr[index];
		arr[index]=arr[i];
		arr[i]=smallestnumber;
		}
		
	}

}
