package level_easy;

public class DecToBin {

	static String res="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=16;
		getBinary(n);
		System.out.println(res);

	}
	public static void getBinary(int n)
	{
		if(n>0)
		{
			int rem=n%2;
			getBinary(n>>1);
			res=res+rem;
			
		}
		
	}

}
