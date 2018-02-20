

public class CountHowManyPallindrome {
	
	
	public static void count(String word){
		
		char[]charecters=word.toCharArray();
		String word1="";
		String rev;
		
		for(int i=0;i<charecters.length;i++){
			for(int j=i+1;j<charecters.length;j++){
				if(charecters[i]==charecters[j]){
					word1=word.substring(i,j+1);
					if(word.length()<2){
						System.err.println("Word not valid");
					}else{
						StringBuffer sb=new StringBuffer(word1);
						rev=sb.reverse().toString();
						if(word1.contentEquals(rev)){
							System.out.println("reverse word is :"+sb.reverse());
							System.out.println("Actual is: "+word1);
							
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		count("abcbbcba");
		System.out.println("================");

	}
	
	

}
