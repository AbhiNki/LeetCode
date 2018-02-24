/*
 * Given a sorted array and a target value, return the index if the target is found.
 *  If not, return the index where it would be if it were inserted in order.
    You may assume no duplicates in the array.
 */

package level_easy;

public class InsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array ={1,3,5,6,12};
		int target = 13;
		int index=findInsertIndex(array, target);
		System.out.println(index);
	}	
	public static int findInsertIndex(int[] array, int target)
	{
		int index=0;
		for(int i=0;i < array.length;i++)
		{
			if(array[i]>=target)
				{return i;}
			index=i+1;
		}
		return index;
	}
}
