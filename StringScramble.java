package level_easy;

public class StringScramble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="great";
		String s2="rgtae";
		
		if(s1.length()!=s2.length())
			System.out.println(false);
		int[] chars = new int[26];
		
		for(int i=0;i<s1.length();i++)
		{
			chars[(int)s1.charAt(i)-'a']++;
		}
		for(int i:chars)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		for(int i=0;i<s2.length();i++)
		{
			chars[(int)s2.charAt(i)-'a']--;
		}
		for(int i:chars)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i:chars)
		{
			if(i !=0)
			{
				System.out.println(false);
				System.exit(0);
			}
		}
		System.out.println(true);
		
		
		
	}

}
