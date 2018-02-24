package level_easy;

import java.util.ArrayList;
import java.util.List;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "abc";
		List<String> list =getAnagrams1("",str, new ArrayList<String>());
		System.out.println(list);
		
		
	}
	
	public static List<String> getAnagrams(String str)
	{
		List<String> list =new ArrayList<>();
		String anagrams="";
		for(int i=0;i<str.length();i++)
		{
			anagrams=str.charAt(i)+str.substring(0,i);
			list.add(anagrams);
		}
		return list;
	}
	
	public static List<String> getAnagrams1(String s1, String s2, List<String> list)
	{
		if(s2.length()<=1)
        {
            list.add(s1+s2);
        }
        else
        {
            for(int i=0; i<s2.length(); i++)
            {
                String x = s2.substring(i, i+1);
                String y = s2.substring(0, i);
                String z = s2.substring(i+1);
                getAnagrams1(s1+x, y+z, list);
            }
        }
		return list;
	}

}
