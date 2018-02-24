package level_easy;
//one step at a time or 2 stape at a time
public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numOfSteps=3;
		
		int noOfWays=calculateWays(numOfSteps);
		System.out.println(noOfWays);
		

	}
	
	public static int calculateWays(int n)
	{
		if(n==0 || n==1 || n==2)
			return n;
		
		int[] steps=new int[n];
		steps[0]=1;
		steps[1]=2;
		for(int i=2;i<n; i++)
		{
			steps[i]=steps[i-1]+steps[i-2];
		}
		return steps[n-1];
	}

}
