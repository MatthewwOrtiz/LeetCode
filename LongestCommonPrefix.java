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

https://leetcode.com/problems/longest-common-prefix/
 */

public class LongestCommonPrefix {

	public static void main(String args[]){
		String[] words = {"flower","flow","flight"};
		System.out.println("The prefix is: "+ LCP(words));
		
		String[] words2 = {"dog","racecar","car"};
		System.out.println("The prefix is: "+ LCP(words2));
		
		String[] words3 = {"hog","hold","hommage"};
		System.out.println("The prefix is: "+ LCP(words3));
		
		String[] words4 = {"ca","c","bba","bacb","bcb"};
		System.out.println("The prefix is: "+ LCP(words4));
	}
	
	public static String LCP(String words[]){
		//Makes initial prefix
        if(words.length<=1){return words[0];}
		String pre = prefix(words[0],words[1]);
		String word = "";
		//loops past first check
        if(words.length<=2){return pre;}
		for(int i =2; i<words.length;i++){
			//if the word doesnt have the prefix, check for a sub prefix
			if(!(words[i].startsWith(pre))){word = prefix(pre,words[i]); pre=word;}
			else{word=pre;}
		}
		return word;
	}
	
	public static String prefix(String one, String two){
		String pre = ""; 
		//loops prefix
		for(int j=0;j<one.length();j++){
			if(j<one.length() && j<two.length() && one.charAt(j)==two.charAt(j)){pre=pre+one.charAt(j);}
			else{ break;}
		}
		return pre;
	}
	
}
