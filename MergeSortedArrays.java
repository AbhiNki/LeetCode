package level_easy;

public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1={1,3,4,6,8,33,0,0,0,0,0,0};
		int[] array2={2,5,7,9,32,45};
		
		merge(array1, 6, array2, 6);

	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) 
	{
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i >= 0 && j >= 0)
        {
            nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while(j>=0)
        {
        	nums1[k--]=nums2[j--];
        }
        
        for(int x=0;x<nums1.length;x++)
        {
        	System.out.print(nums1[x]+" ");
        }
        
    }

}
