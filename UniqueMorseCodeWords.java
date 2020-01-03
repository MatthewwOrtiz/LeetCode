import java.util.ArrayList;
/*
International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

For convenience, the full table for the 26 letters of the English alphabet is given 

Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.

Return the number of different transformations among all words we have.

Example:
Input: words = ["gin", "zen", "gig", "msg"]
Output: 2
Explanation: 
The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."

There are 2 different transformations, "--...-." and "--...--.".

Note:

    The length of words will be at most 100.
    Each words[i] will have length in range [1, 12].
    words[i] will only consist of lowercase letters.

https://leetcode.com/problems/unique-morse-code-words/

 */



public class UniqueMorseCodeWords {

	public static void main(String args[]){
		String[] words = {"gin","zen","gig","msg"};
		
		System.out.println("There are "+ uniqueMorseRepresentations(words)+ " different transformations");
		
	}
	
	
	
	public static int uniqueMorseRepresentations(String[] words) {

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
		     System.out.print(morseWord+ "|");
		     if(morseList.contains(morseWord)){}
		     else{morseList.add(morseWord);}
		 }
		 System.out.println();
		 return morseList.size();
	    }
	
}
