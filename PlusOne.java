package level_easy;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] digits={8,9,9,9};
		int[] newDigits=onePlus(digits);
		
		System.out.print("[ ");
		for(int i=0;i<newDigits.length;i++)
		{
			System.out.print(newDigits[i]+" ");
		}
		System.out.println("]");
	}
	public static int[] onePlus(int[] digits)
	{
		for(int i=digits.length-1;i>=0;i--)
		{
			if(digits[i]<9)
			{
				digits[i]++;
				return digits;
			}
			digits[i]=0;
		}
		
		int[] newDigits = new int[digits.length+1];
		newDigits[0]=1;
		return newDigits;
	}

}
