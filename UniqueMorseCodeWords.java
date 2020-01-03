import java.util.ArrayList;

public class UniqueMorseCodeWords {

	public static void main(String args[]){
		
		
		
	}
	
	
	
	public int uniqueMorseRepresentations(String[] words) {

	    char[] alpha ={'a','b','c','d','e','f','g','h','j','k','l','m','n','o',
	                'p','q','r','s','t','u','v','w','x','y','z'};
	 
		 String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
		                   ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...",
		                   "-","..-","...-",".--","-..-","-.--","--.."};
		 
		 ArrayList morseList = new ArrayList();
		 
		 for(int i =0; i<words.length;i++){
		     String morseWord = "";
		     String str = words[i];
		     char[] ch  = str.toCharArray();
		     for(char c : ch)
		     {
		         int temp = (int)c;
		         int temp_integer = 96;
		         if(temp<=122 & temp>=97)
		         morseWord = morseWord + morse[temp-temp_integer-1];
		     }
		     if(morseList.contains(morseWord)){}
		     else{morseList.add(morseWord);}
		 }
		 
		 return morseList.size();
	    }
	
}
