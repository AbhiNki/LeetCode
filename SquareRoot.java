package level_easy;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=8;
		//int sqrtRoot=getSQRT(number);
		
		int sqrtRoot2=getSQRT2(number);
		System.out.println(sqrtRoot2);

	}
	
	public static int getSQRT(int number) //not efficient for other numbers like 8
	{
		int temp;
		int sqrtVal=number/2;
		do
		{
			temp=sqrtVal;
			sqrtVal=(temp+(number/temp))/2;
		}
		while((temp-sqrtVal)!=0);
		return sqrtVal;
	}
	
	public static int getSQRT2(int number)
	{
		if(number==0)
			return 0;
		if(number==1)
			return 1;
		int left=1;
		int right=number;
		int ans=0;
		int mid;
		while(left<=right)
		{
			mid= left + (right-left)/2;
			
			if(mid < number/mid)
			{
				left =mid+1;
				ans=mid;
			}
			else
				right=mid-1;
		}
		return ans;
		
	}
	

}
