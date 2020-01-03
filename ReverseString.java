
public class ReverseString {

	public static void main(String args[])
	{
		char[] s = {'h','e','l','l','o'};
		char[] t = {'H','a','n','n','a','h'};
		reverseString(t);
		reverseString(s);	
		print(s);
		System.out.println();
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
