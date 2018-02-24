package level_easy;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		
		boolean result = isHappyNumber(num);
		System.out.println(result);
	}
	
	public static boolean isHappyNumber(int n)
	{
		int x=n;
		int y=n;
		
		while(x>1)
		{
			x=calSquareSum(x);
			if(x==1)
				return true;
			y=calSquareSum(calSquareSum(y));
			if(y==1)
				return true;
			if(x==y)
				return false;
		}
		return true;
	}
	public static int calSquareSum(int n)
	{
		int z=n;
		int sum=0;
		while(z>0)
		{
			int digit=z%10;
			sum=sum+(digit*digit);
			z=z/10;
		}
		return sum;
	}
	
	

}
