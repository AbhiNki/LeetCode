//Write a function to find the longest common prefix string amongst an array of strings.
// array = {leets, leetcode, leet, leeds}
// LCP = lee

package level_easy;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str={};//{"leets", "leetcode", "leet", "leeds"};
		String pre1=findLCP1(str);
		System.out.println("The longest common prefix using method 1 is: "+pre1);
		
		
		Arrays.sort(str);
		System.out.print("Sorted Array:");
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+"  ");
		}
		System.out.println();
		
		String pre2=findLCP2(str);
		System.out.println("The longest common prefix using method 2 is: "+pre1);
	}
	private static String findLCP2(String[] str) {
		StringBuilder result =new StringBuilder();
		if(str!=null && str.length>0)
		{
			char[] firstStr = str[0].toCharArray();
			char[] lastStr = str[str.length-1].toCharArray();
			
			for(int i=0;i<firstStr.length;i++)
			{
				if(lastStr.length > i && lastStr[i]==firstStr[i])
				{
					result.append(firstStr[i]);
				}
				else 
					return result.toString();
			}
			return result.toString();
		}

		return null;
	}
	public static String findLCP1(String[] str)
	{
		if(str==null || str.length==0)
			return "";
		
		String pre=str[0];
		int i=1;
		while(i<str.length)
		{
			while(str[i].indexOf(pre)!=0)
			{
				pre = pre.substring(0, pre.length()-1);
			}
			i++;
		}
		return pre;
	}

}
