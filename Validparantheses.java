package level_easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Validparantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String parantheses="()[]{}";
		boolean flag = validateParantheses(parantheses);
		System.out.println("String has valid parantheses: "+flag);
		
		
		

	}
	
	public static boolean validateParantheses(String str)
	{
		Stack<Character> stack = new Stack<Character>();
		
		for(char c: str.toCharArray())
		{
			if(c=='(')
			{
				stack.push(')');
			}
			else if(c=='{')
			{
				stack.push('}');
			}
			else if(c=='[')
			{
				stack.push(']');
			}
			else if(stack.isEmpty() || stack.pop()!=c)
				return false;
			
		}
		return true;
	}

}
