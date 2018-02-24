package level_easy;

public class LastWordLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string ="Hello World";
		int length=getlastWordLength(string);
		System.out.println(length);
	}
	public static int getlastWordLength(String s)
	{
		//System.out.println(s.length()+ " "+s.lastIndexOf(' '));
		int length=s.length()-s.lastIndexOf(' ')-1;
		return length;
	}
}
