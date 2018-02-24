/*Example 1:

Input: 123
Output:  321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21*/
package level_easy;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input=1534236469;
		int rem=0;
		int reverse=0;
		
		int result=reverse(input);
		System.out.println(result);
		
		//System.out.print("Reverse Number of "+input+" is :");
		/*if(input > 0)
		{
			while(input != 0)
			{
				rem=input%10;
				int newResult=reverse*10+rem;
				if((newResult-rem)/10!=reverse)
					reverse =0;
				reverse=newResult;
				input=input/10;
				
			}
			System.out.print(reverse);
		}
		else
		{
			input=0-input;
			while(input!=0)
			{
				rem=input%10;
				input=input/10;
				reverse=reverse*10+rem;
			}
			reverse=0-reverse;
			System.out.print(reverse);
		}*/

	}
	public static int reverse(int x) //this case takes cares of overflow
	{
	    int result = 0;

	    while (x != 0)
	    {
	        int tail = x % 10;
	        int newResult = result * 10 + tail;
	        System.out.println("new result:"+newResult+"   "+"tail: "+tail+"  "+"Result: "+result);
	        if ((newResult - tail) / 10 != result)
	        { //System.out.println((newResult-tail)/10);
	        	result= 0; }
	        result = newResult;
	        x = x / 10;
	    }
	    //System.out.println(result);

	    return result;
	}

}
