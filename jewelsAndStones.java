
public class jewelsAndStones {

	public static void main(String args[]){
		String J = "aA"; 
		String S = "aAAbbbb";
		
		System.out.println("You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.");
		System.out.println();
		System.out.println("The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so a is considered a different type of stone from A.");

		
		System.out.println(" S and J will consist of letters and have length at most 50.\n The characters in J are distinct.");
		
		System.out.println(numJewelsInStones(J,S));
		
	}
	
	
	
	
	
	 public static int numJewelsInStones(String J, String S) {
	        
	        int count = 0;
	        
	        
	        for(int i = 0; i<J.length();i++){
	            for(int j=0;j<S.length();j++){
	                if(J.charAt(i) == S.charAt(j)){
	                    count++;}}
	                
	            }
	        
	        return count;
	            
	        }
	
	
}
