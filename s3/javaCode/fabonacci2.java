
public class fabonacci2 {

	public static void main(String[] args) {
		int f1=0,f2=1,f3=0;
		int num=13;
		System.out.print(f1+" "+f2);
		for(int i=2;i<=num;i++){
			f3=f1+f2;
			if(f3<100 && f3>0){
			System.out.print(" "+f3);
			}
			f1=f2;
			f2=f3;
		}

	}
}


