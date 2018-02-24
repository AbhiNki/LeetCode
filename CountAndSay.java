package level_easy;

public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		String countandsayval=countAndSay(n);
		System.out.println(countandsayval);

	}
	
	public static String countAndSay(int n) {
        StringBuilder current=new StringBuilder("1");
        StringBuilder prev;
        int count;
        char say;
        
        for(int i=1;i<n;i++)
        {
            prev=current;
            say=prev.charAt(0);
            current= new StringBuilder();
            count=1;
            for(int j=1;j<prev.length();j++)
            {
                if(prev.charAt(j)!=say)
                {
                    current.append(count).append(say);
                    count=1;
                    say=prev.charAt(j);
                }
                else 
                	count++;
            }
            current.append(count).append(say);
        }
		return current.toString();   
	}
}
