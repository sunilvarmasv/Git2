
public class Occurence3 {

	public static void main(String[] args) {
	String name="monday mo nk ey";
	int count=0;
	for(int i=0;i<name.length();i++){
	
		boolean flag=false;
		for(int j=0;j<i;j++){
			if(name.charAt(i)==name.charAt(j)){
				flag=true;
			}
		}
		if(!flag){
			int counti=0;
			for(int k=0;k<name.length();k++){
				if(name.charAt(i)==name.charAt(k)){
					counti++;
				}
				
			}System.out.println(name.charAt(i)+" letter is"+counti+" times");
		}
	}
	
	}

}
