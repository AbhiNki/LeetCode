package level_easy;

import java.lang.reflect.Array;
import java.util.HashMap;

public class IsomorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "title";
		String str2= "paper";
		
		boolean result= isIsomorphic1(str1, str2);
		System.out.println(result);
	}
	public static boolean isIsomorphic1(String str1, String str2)
	{
		if(str1.length()!=str2.length())
			return false;
		int size=str1.length();
		HashMap<Character, Character> map=new HashMap<Character, Character>();
		for(int i=0;i<size;i++)
		{
			char a=str1.charAt(i);
			char b=str2.charAt(i);
			
			if(map.containsKey(a))
			{
				if(map.get(a).equals(b))
					continue;
				else
					return false;
			}
			else
			{
				if(!map.containsValue(b))
				{
					map.put(a, b);
				}
				else 
					return false;
			}
		}
		
		return true;
	}
	
	public static boolean isIsomorphic2(String str1, String str2)
	{
		if(str1.length()!=str2.length())return false;
		
		int[] charArr1=new int[256];
		int[] charArr2=new int[256];
		for(int i=0;i<str1.length();i++)
		{
			if(charArr1[str1.charAt(i)]!=charArr2[str2.charAt(i)]) return false;
			charArr1[str1.charAt(i)]=i+1;
			charArr2[str2.charAt(i)]=i+1;
		}
		return true;
	}

}
