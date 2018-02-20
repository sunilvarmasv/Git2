
public class reverseStringRecursive {

	public static String reverse(String str){
		int length=str.length();
		if(str.length()==0)return "";
		else{
			//return str.charAt(length-1)+reverse(str.substring(0,str.length()-1));
			return reverse(str.substring(1))+str.charAt(0);
		}
		
	}
	public static void main(String[]args){
		
		String rev=reverse("b");
		System.out.println("reverse value is :"+rev);
	}
}
