
public class productAndSum {

	public static void main(String args[]){
		
		subtractProductAndSum(4421);
		
	}
	
	
	 public static int subtractProductAndSum(int n) {
		 int product=1;
		 int sum=0;
		 String temp = Integer.toString(n);
		 for (int i = 0; i < temp.length(); i++)
		 {
		     product *= temp.charAt(i) - '0';
		     sum += temp.charAt(i) - '0';
		 }		 
		 return product - sum;
	 }
}