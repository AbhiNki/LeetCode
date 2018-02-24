package level_easy;

public class StringPalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="A man, a plan, a canal: Panama";
		
		System.out.println(s.toLowerCase().replaceAll("\\\\W+", ""));
		//String s="";
		//String s="abcba";
		boolean result=checkPalindrome(s);
		System.out.println(result);

	}
	public static boolean checkPalindrome(String s) {
        if(s.isEmpty())
            return true;
        
        
        int head=0;
        int tail=s.length()-1;
        
        char cHead;
        char cTail;
        
        while(head<=tail)
        {
            cHead=s.charAt(head);
            cTail=s.charAt(tail);
            if(!Character.isLetterOrDigit(cHead))
            {
                head++;
            }
            else if(!Character.isLetterOrDigit(cTail))
            {
                tail--;
            }
            else 
            {
            	if(Character.toLowerCase(cHead) != Character.toLowerCase(cTail))
                {
                	return false;
                }
                head++;
                tail--;
            }
        }
        return true;
    }

}
