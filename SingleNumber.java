package level_easy;
//Given an array of integers, every element appears twice except for one. Find that single one.


public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums={1,1,2,3,4,5,4,2,3};
		
		int result=getSingleNumber(nums);
		System.out.println(result);
	}
	
	public static int getSingleNumber(int[] nums)
	{
		int result=0;
		for(int i=0;i<nums.length;i++)
		{
			result^=nums[i];
		}
		return result;
	}
}
