package level_easy;

public class ValidNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s ="24E6";
			
			//Double d= Double.parseDouble(s);
			//System.out.println(d);
			boolean b=validateNum(s);
			System.out.println(b);
	}
	public static boolean validateNum(String s)
	{
		
	s=s.trim();
    int n=s.length();
    if(n==0) return false;
    int signCount=0;
    boolean hasNum=false;
    boolean hasE=false;
    boolean hasPoint=false;
    
    for(int i=0;i<s.length();i++)
    {
        char c=s.charAt(i);
        if(!isValid(c)) return false;
        
        if(c > '0' && c <'9') 
            hasNum=true;
        
        if(c=='e' || c=='E')   
        {
            if(hasE || !hasNum) return false;
            if(i==n-1) return false;
            hasE=true;
        }
        if(c=='.')
        {
            if(hasPoint || hasE) return false;
            System.out.println(!hasNum +"  "+ (i==n-1));
            if(!hasNum && i==n-1) return false;

            hasPoint =true;
        }
        if(c=='+' || c =='-')
        {
            if(signCount==2) return false;
            if(i==n-1) return false;
            signCount++;
        }
    }
    return true;
    
}

	public static boolean isValid(char c)
	{
	    return c=='.'|| c=='+' || c=='-' || c=='e' || c=='E' || (c>='0' && c<='9');
	}

}


