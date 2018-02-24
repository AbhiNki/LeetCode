package level_easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRows=5;
		
		List<List<Integer>> triangle= getPascalTriangle(numRows);
		System.out.println(triangle);
	}
	
	public static List<List<Integer>> getPascalTriangle(int numRows)
	{
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		if(numRows==0)
			return triangle;
		
		for(int i=0;i<numRows;i++)
		{	
			List<Integer> row = new ArrayList<Integer>();
			for(int j=0;j<i+1;j++)
			{
				if(j==0||j==i)
					row.add(1);
				else
					row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
			}
			triangle.add(row);
		}
		
		return triangle;
	}

}
