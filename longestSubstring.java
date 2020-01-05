import java.util.ArrayList;

public class longestSubstring {
	//Display: if 1: will display substrings else: wont show anything
	static int display = 1;
	
	public static void main(String args[]){
	
		System.out.println(sub("abcabcbb"));
		
		System.out.println(sub("bbbbbbb"));
		
		System.out.println(sub("pwwkew"));
	}
	
	static int sub(String word){
		//holds the greatest substring size
		int greatestLength = 0;
		//holds the current size of the substring we are looking for
		int size = 0;
		//holds the last position of the beginning of the substring
		int position =0;
		//substring holds the current letters we are comparing
		ArrayList substring = new ArrayList();
		for(int i =0; i<word.length();i++){
			if(substring.contains(word.charAt(i))){
				if(size>greatestLength){greatestLength=size;}
				size =0; i = position+1; position = i; i--;
				if(display==1){
				System.out.println(substring);}
				substring.clear();}
			else{size++;substring.add(word.charAt(i));}

		}

		return greatestLength;
		
	}
	
}
