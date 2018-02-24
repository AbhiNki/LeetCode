package level_easy;

public class BinaryAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="11";
		String b="1";
		
		String result=binaryAdd(a,b);
		System.out.println(result);

	}
	
	public static String binaryAdd(String a, String b)
	{
		int aLength=a.length();
		int bLength=b.length();
		String result="";
		int carry=0, i=0;
		
		while(i < aLength || i < bLength || carry!=0)
		{
			int x=(i<aLength)?Character.getNumericValue(a.charAt(aLength-1-i)):0;
			int y=(i<bLength)?Character.getNumericValue(b.charAt(bLength-1-i)):0;
			result=(x + y + carry)%2 + result;
			carry=(x + y + carry)/2;
			i++;
		}
		return result;
	}

}
