package level_easy;

public class NumberOf1Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11; //32 bit=00000000000000000000000000001011
		int countOf1in32bits=getCount(n);
		System.out.println(countOf1in32bits);

	}
	
	public static int getCount(int n)
	{
		int ones=0;
		while(n!=0)
		{
			ones=ones+(n&1);
			n>>>=1;
		}
		
		return ones;
	}
	

}
