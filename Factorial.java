package level_easy;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int result=getFactorial(num);
		System.out.println(result);
	}
	public static int getFactorial(int num)
	{
		if(num==0) return 0;
		if(num==1) return 1;
		if(num>1) 
			return num*getFactorial(num-1);
		return 0;
	}

}
