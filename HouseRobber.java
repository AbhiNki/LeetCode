package level_easy;

/*
 * You are a professional robber planning to rob houses along a street. Each house has a certain
 * amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will 
 * automatically contact the police if two adjacent houses were broken into on the same night.
Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 * 
 */

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] houseMoney={40,50,20,10,2,5,60};
		int result=maxProfit(houseMoney);
		System.out.println(result);

	}
	
	public static int maxProfit(int[] money)
	{
		int a=0;
		int b=0;
		for(int i=0;i<money.length;i++)
		{
			if(i%2==0)
			{
				a=Math.max(a+money[i], b);
			}
			else
			{
				b=Math.max(a, b+money[i]);
			}
		}
		return Math.max(a, b);
	}

}
