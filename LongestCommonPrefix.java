/*
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Note:

All given inputs are in lowercase letters a-z.

 */

public class LongestCommonPrefix {

	public static void main(String args[]){
		String[] words = {"flower","flow","flight"};
		System.out.println("The prefix is: "+ LCP(words));
		
		String[] words2 = {"dog","racecar","car"};
		System.out.println("The prefix is: "+ LCP(words2));
		
		String[] words3 = {"hog","hold","hommage"};
		System.out.println("The prefix is: "+ LCP(words3));
		
		String[] words4 = {"kang","kong","kag"};
		System.out.println("The prefix is: "+ LCP(words4));
	}
	
	public static String LCP(String words[]){
		String pre = prefix(words[0],words[1]);
		String word = "";
		for(int i =2; i<words.length;i++){
			if(!(words[i].contains(pre))){word = prefix(pre,words[i]);}
			else{word=pre;}
		}
		return word;
	}
	
	public static String prefix(String one, String two){
		String pre = ""; 
		for(int j=0;j<one.length();j++){
			if(j<one.length() && j<two.length() && one.charAt(j)==two.charAt(j)){pre=pre+one.charAt(j);}
			else{ break;}
		}
		return pre;
	}
	
}
