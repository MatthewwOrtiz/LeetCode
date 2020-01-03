import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String args[])
	{
		System.out.println("Write a program that outputs the string representation of numbers from 1 to n.");
		System.out.println("");
		System.out.println("But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.");
		System.out.println("For numbers which are multiples of both three and five output “FizzBuzz”.");

		
		System.out.println(fizzBuzz(15));
	}
	
	 public static List<String> fizzBuzz(int n) {
		 List<String> ans = new ArrayList<>();
		 
		 for(int i=1; i<=n;i++)
		 {
			if(i%3==0 & i%5==0)
				ans.add("FizzBuzz");
			else if(i%3==0)
				ans.add("Fizz");
			else if(i%5==0)
				ans.add("Buzz");
			else
				ans.add(Integer.toString(i));
		 }
		 return ans;
	    }
}
