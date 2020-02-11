import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class decompressedList {

	public static void main(String args[]){
		int[] nums = {1,2,3,4};
	
		decompressRLElist(nums);
	}
	
	
	
    public static int[] decompressRLElist(int[] nums) {
    	List<Integer> ans = new LinkedList<Integer>();
    	
    	for(int i =0;i<nums.length/2;i++){
    		int size = nums[2*i];
    		int multiple = nums[2*i+1];
    		for(int j=0;j<size;j++){
    			ans.add(multiple);
    		}
    	}
    	
    	int[] arr= new int[ans.size()];
    	 for (int i =0; i < ans.size(); i++) {
             arr[i] = ans.get(i); }
    	return arr;
    	
    }
	
}
