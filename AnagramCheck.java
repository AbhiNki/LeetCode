package level_easy;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="iceman";
		String str2="cinema";
		
		boolean result=isAnagram(str1,str2);
		System.out.println(result);
	}
	public static boolean isAnagram(String s, String t)
	{
		if(s.length()!=t.length())
			return false;
		int[] checkCount=new int[26];
		for(int i=0;i<s.length();i++)
		{
			checkCount[s.charAt(i)-'a']++;
			checkCount[t.charAt(i)-'a']--;
		}
		for(int i:checkCount)
		{
			if(i!=0)
				return false;
		}
		return true;
	}
}
