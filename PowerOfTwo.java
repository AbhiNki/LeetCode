package level_easy;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=324;
		boolean result=checkPowerOfTwo(n);
		System.out.println(result);
	}
	public static boolean checkPowerOfTwo(int n)
	{
		if(n<=0)return false;
		
		return (n & (n-1))==0? true: false;
	}

}
