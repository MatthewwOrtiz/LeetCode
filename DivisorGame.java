import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DivisorGame {

	public static void main(String args[]){
		System.out.println(divisorGame(4));
	}
	
    public static boolean divisorGame(int N) {
		Random rand = new Random();    	
    	int turns = 0;
		while(N>2){
    		List fact = factors(N);
    		int n = rand.nextInt(fact.size());
    		N=N-(int)fact.get(n);
    		turns++;
    	}   
    	if(turns%2==0){return true;}
    	else{return false;}
    }
	
    public static List factors(int n){
		List fact = new ArrayList();
    	for(int i = 1;i<n;i++)
    	{
    		if(n%i==0){fact.add(i);}
    	}
    	return fact;
    }
}
