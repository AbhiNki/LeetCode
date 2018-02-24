package level_easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsNthRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nthRow=3;
		
		List<Integer> res=getNthRow(nthRow);
		System.out.println(res);
		

	}
	
	public static List<Integer> getNthRow(int n)
	{
		List<Integer> res=new ArrayList<Integer>();
		for(int i=0;i<n+1;i++)
		{
			res.add(1);
			for(int j=i-1;j>0;j--)
			{
				res.set(j, res.get(j-1)+res.get(j));
			}
		}
		return res;
	}

}
