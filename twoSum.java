
public class twoSum {

	public static void main(String args[]){
		int[] nums = {2, 7, 11, 15}; 
		int target = 9;
		
		System.out.println("Given an array of integers, return indices of the two numbers such that they add up to a specific target.");
		System.out.println();
		System.out.println("You may assume that each input would have exactly one solution, and you may not use the same element twice.");
		
		print(twoSum(nums,target));
		
	}
	
	
	
    public static int[] twoSum(int[] nums, int target) {
        
        int answer[] = new int[2];
        for(int i = 0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    answer[0] = i;
                    answer[1] = j;
                    return answer;}
            }
        }
        return null;
    }
    
    public static void print(int[] nums){
    	
    	for(int i =0; i<nums.length;i++){
    		System.out.println(nums[i]);
    	}
    	
    }
                
}
