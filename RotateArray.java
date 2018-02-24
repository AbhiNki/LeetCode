package level_easy;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array={1,2,3,4,5,6,7};
		int k=3;
		
		//int[] rotatedArray=rotateArray(array,k);
		
		int[] rotatedArray2=rotateArray2(array,k);
		
		for(int i : rotatedArray2)
		{
			System.out.print(i+" ");
		}

	}
	public static int[] rotateArray(int[] array, int k) //gets time limit error not good for huge array
	{
		for(int i=0;i<3;i++)
		{
			int temp=array[array.length-1];
			for(int j=array.length-2;j>=0;j--)
			{
				array[j+1]=array[j];
			}
			array[0]=temp;
		}
		return array;
	}
	
	public static int[] rotateArray2(int[] array, int k)
	{
		k=k%array.length;
		reverse(array,0, array.length-1);
		reverse(array,0,k-1);
		reverse(array,k,array.length-1);
		int[] result=array;
		return result;
	}
	public static void reverse(int[] array, int start, int end)
	{
		while(start<end)
		{
			int temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;
			end--;
		}
	}

}
