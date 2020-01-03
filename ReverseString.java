/*
 Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.

 

Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

https://leetcode.com/problems/reverse-string/
 */
public class ReverseString {

	public static void main(String args[])
	{
		char[] s = {'h','e','l','l','o'};
		char[] t = {'H','a','n','n','a','h'};
		print(s);
		System.out.println();
		reverseString(s);	
		print(s);
		System.out.println();
		print(t);
		System.out.println();
		reverseString(t);
		print(t);
	}
	
	
    public static void reverseString(char[] s) 
    {
        for(int i = 0;i<s.length;i++)
        {
        	if(i<(s.length-i))
        	{
	        	char temp = s[i];
	        	s[i] = s[(s.length-i)-1];
	        	s[(s.length-i)-1] = temp;
	        }
        }
    	
    }
    
    public static void print(char[] s)
    {
    	for(int i =0; i <s.length;i++)
    	{
    		System.out.print(s[i] + " ");
    	}
    }
	
	
}
