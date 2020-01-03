
public class defangingIPAddress {

	public static void main(String args[]){
		
		System.out.println("Given a valid (IPv4) IP address, return a defanged version of that IP address.");
		System.out.println();
		System.out.println("A defanged IP address replaces every period . with [.].");
		
		System.out.println();
		String address = "1.1.1.1";
		System.out.println(defangIPaddr(address));
	}
	
	
	
    public static String defangIPaddr(String address) {
        
        String newAddress =  address.replace(".","[.]");
     
     return newAddress;
 }	
}
