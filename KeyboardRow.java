import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyboardRow {

	public static void main(String args[]){
		String[] A = {"Hello", "Alaska", "Dad", "Peace"};
		
		char[] top = {'q','w','e','r','t','y','u','i','o','p'};
		char[] middle = {'a','s','d','f','g','h','j','k','l'};
		char[] bottom = {'z','x','c','v','b','n','m'};
		
		List<Character> topp = new ArrayList<Character>();
		List<Character> middlee = new ArrayList<Character>();
		List<Character> bottomm = new ArrayList<Character>();
		
		List<String> ans = new ArrayList<String>();
		
		for(int i = 0; i<top.length;i++){
			topp.add(top[i]);
		}
		for(int i = 0; i<middle.length;i++){
			middlee.add(middle[i]);
		}
		for(int i = 0; i<bottom.length;i++){
			bottomm.add(bottom[i]);
		}
		
		for(int i = 0; i<A.length;i++){
			int tcount = 0;
			int mcount = 0;
			int bcount = 0;
			for(int j =0;j<A[i].length();j++){
				
				if(topp.contains(A[i].toLowerCase().charAt(j))){
					 tcount++;
				}
				if(middlee.contains(A[i].toLowerCase().charAt(j))){
					 mcount++;
				}
				if(bottomm.contains(A[i].toLowerCase().charAt(j))){
					 bcount++;
				}
			
			}
			System.out.println(tcount);
			System.out.println(mcount);
			System.out.println(bcount);
			System.out.println();
			if(tcount == A[i].length()||mcount == A[i].length()||bcount == A[i].length())
			{ans.add(A[i]);}
		}
		System.out.println(ans);
	}
	
	
	
}
