/*
A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.  For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.

A valid parentheses string S is primitive if it is nonempty, and there does not exist a way to split it into S = A+B, with A and B nonempty valid parentheses strings.

Given a valid parentheses string S, consider its primitive decomposition: S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.

Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.

 

Example 1:

Input: "(()())(())"
Output: "()()()"
Explanation: 
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".

Example 2:

Input: "(()())(())(()(()))"
Output: "()()()()(())"
Explanation: 
The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".

Example 3:

Input: "()()"
Output: ""
Explanation: 
The input string is "()()", with primitive decomposition "()" + "()".
After removing outer parentheses of each part, this is "" + "" = "".

 

Note:

    S.length <= 10000
    S[i] is "(" or ")"
    S is a valid parentheses string

https://github.com/MatthewwOrtiz/LeetCode
 */
public class removeOutermostParantheses {

	public static void main(String args[]){
		
		String s = "(()())(())";
		
		System.out.println(s);
		System.out.println(removeOuterParentheses(s));
		
		
	}
	
	
	
	
	 public static String removeOuterParentheses(String S) {
		 //keeps count of open paren
		    	int outer = 0;
		    	//keeps track of close paren
		        int inner = 0;
		        
		        //keeps track of outermost paren
		        int start =0;
		        //keeps track of outermost parn
		        int end =0;
		        
		        
		        //holds answer
		        String newString = "";
		        
		        //loop through string
		        for(int i =0; i<S.length();i++){
		            
		        	//counts all close paren
		            if(S.charAt(i) == ')'){
		                outer++;
		            }
		            
		            //counts all open paren
		            if(S.charAt(i) == '('){
		                inner++;
		            }
		            
		            //keeps track of ending
		            end++;
		            if (outer == inner){
		            	
		            	String sub = S.substring(start,end);
		                StringBuilder sb = new StringBuilder(sub);
		                sb.deleteCharAt(sub.length()-1);
		                sb.deleteCharAt(0);
		                newString = newString + sb.toString();
		                
		                start = end;
		            }
		    
		            
		        }
		        return newString;
		    }
	
	
	
}
