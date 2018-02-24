/*Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/



package level_easy;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 7, 11, 15};
		int target = 18;
		//Brute force method O(n^2) complexity
		int[] result= bruteForceMethod(nums, target);
		System.out.print("Brute Force Result:");
		displayResult(result);
		
		
		//O(n) complexity
		int[] result2 = twoPassMethod(nums, target);
		System.out.println();
		System.out.print("Two Pass Method Result:");
		displayResult(result2);
		
		//O(n) complexity
		int[] result3 = onePassMethod(nums, target);
		System.out.println();
		System.out.print("One Pass Method Result:");
		displayResult(result3);

	}
	
	private static int[] onePassMethod(int[] nums, int target) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++)
		{
			int complement= target-nums[i];
			if(map.containsKey(complement))
			{
				return new int[]{complement, nums[i]};
			}
			map.put(nums[i], i);
		}
		return null;
	}

	public static int[] twoPassMethod(int[] nums, int target)
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i< nums.length;i++)
		{
			map.put(nums[i], i);
		}
		
		for(int j=0;j<nums.length;j++)
		{
			int complement= target-nums[j];
			if(map.containsKey(complement) && map.get(complement)!=j)
				return new int[]{complement, nums[j]};
		}
		
		return null;
	}
	
	public static int[] bruteForceMethod(int[] nums, int target)
	{
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(target-nums[i] == nums[j])
				{
					return new int[]{nums[i],nums[j]};
				}
			}
		}
		return null;
	}
	
	public static void displayResult(int[] result)
	{
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+"  ");
		}
	}
}
