import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class CommonCharacters {

	public static void main(String args[])
	{
		System.out.println("Returns the reoccuring letters in a list of words.");
		
		String[] A = {"cool","lock","cook"};
		String[] B = {"bella","label","roller"};
		commonChars(A);
		commonChars(B);
	}

	public static void commonChars(String[] A) {
		Dictionary main = makeDictonary(A[0]);
		
		for(int i = 0; i<A.length;i++)
		{
			Dictionary b = makeDictonary(A[i]);
			compare(main,b);
		}
		System.out.println(convert(main));
    }
	
	
	public static Dictionary makeDictonary(String A){
		
		Dictionary geek = new Hashtable();
		
		for(int i = 0; i<A.length();i++)
		{
			if(geek.get(A.charAt(i))==null)
				geek.put(A.charAt(i), 1);
			else{
				geek.put(A.charAt(i),((int)geek.get(A.charAt(i)) + 1));}
		}
		
		return geek;
	}
	
	
	public static Dictionary compare(Dictionary a,Dictionary b){
		
		List mainKeys = new ArrayList<String>();
		
	    for (Enumeration k = a.keys(); k.hasMoreElements();) 
        { 
            mainKeys.add(k.nextElement()); 
        } 
	    
	    for(int i = 0; i<mainKeys.size();i++){
	    	if(b.get(mainKeys.get(i))!=null){
	    		if((int)a.get(mainKeys.get(i))>(int)b.get(mainKeys.get(i))){
	    			a.put(mainKeys.get(i), (int)b.get(mainKeys.get(i)));
	    		}
	    	}
	    	if(b.get(mainKeys.get(i))==null){
	    		a.remove(mainKeys.get(i));
	    	}
	    }
	    			return a;
	}
	
	public static void printKeys(Dictionary geek){
	    for (Enumeration k = geek.keys(); k.hasMoreElements();) 
        { 
            System.out.println("Keys in Dictionary : " + k.nextElement()); 
        } 
	}
	
	public static void printValues(Dictionary geek){
		    for (Enumeration i = geek.elements(); i.hasMoreElements();) 
	        { 
	            System.out.println("Value in Dictionary : " + i.nextElement()); 
	        } 
	   }
	public static List<String> convert(Dictionary A){
		
		List ans = new ArrayList<String>();
		
		List mainKeys = new ArrayList<String>();
	    for (Enumeration k = A.keys(); k.hasMoreElements();) 
        { 
            mainKeys.add(k.nextElement()); 
        } 
	    
	    List mainValues = new ArrayList<String>();
	    for (Enumeration i = A.elements(); i.hasMoreElements();) 
        { 
           mainValues.add(i.nextElement());
        } 
		
	    for (int i =0; i<mainKeys.size();i++) 
        { 
	    	if((int)A.get(mainKeys.get(i))>1){
	    		for(int j =0; j<(int)A.get(mainKeys.get(i));j++){
	    			ans.add(mainKeys.get(i));
	    		}
          }else{
        	  ans.add(mainKeys.get(i));
          }
        } 
		
		return ans;
		
	}
	
	}
	
	
	
