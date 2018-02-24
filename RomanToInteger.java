package level_easy;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String roman="XVII";
		
		int intVal=romanToInteger(roman);
		System.out.println(roman+" = "+intVal);
	}
	
	public static int romanToInteger(String roman)
	{
		int[] nums=new int[roman.length()];
		for(int i=0;i<roman.length();i++)
		{
			switch(roman.charAt(i))
			{
			case 'M':
				nums[i]=1000;
				break;
			case 'D':
				nums[i]=500;
				break;
			case 'C':
				nums[i]=100;
				break;
			case 'L':
				nums[i]=50;
				break;
			case 'X':
				nums[i]=10;
				break;
			case 'V':
				nums[i]=5;
				break;
			case 'I':
				nums[i]=1;
				break;
			}
		}
		
		int sum=0;
		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i]<nums[i+1])
			{
				sum=sum-nums[i];
			}
			else
			{
				sum= sum+nums[i];
			}
		}
		return sum+nums[nums.length-1];
	}

}
