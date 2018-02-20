
public class reverseString2 {

	public static void main(String[] args) {
		String word="bije is bad boy";
		word=word.concat("baby");
		System.out.println(word);
		for(int i=word.length()-1;i>=0;i--){
			System.out.print(word.charAt(i));
		}

	}

}
