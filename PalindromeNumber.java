package level_easy;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=2147447412;
		
		boolean result= checkPalindrome(number);
		System.out.println("the number is a palindrome:" +result);
	}
	
	public static boolean checkPalindrome(int number)
	{
		if(number < 0 || (number % 10 == 0 && number != 0))
			return false;
		
		int halfRevertNum=0;
		while(number > halfRevertNum)
		{
			halfRevertNum=halfRevertNum*10+number%10;
			number=number/10;
		}
		
		
		return number==halfRevertNum || number == halfRevertNum / 10;
	}
}
