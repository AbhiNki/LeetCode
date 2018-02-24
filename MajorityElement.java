package level_easy;

import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,2,2,2,2,3,4};
		
		int res=getMajorityElement(nums);
		System.out.println(res);
	}
	public static int getMajorityElement(int[] nums)
	{
		HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i])+1);
                
            }               
            else
                map.put(nums[i],1);
            
            if(map.get(nums[i])>nums.length/2)
                    return nums[i];
        }
        return 0;
	}

}
