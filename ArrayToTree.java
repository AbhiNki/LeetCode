package level_easy;

public class ArrayToTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;
        
        TreeNode root=makeTree(nums, 0, nums.length-1);
        return root;
    }
    
    public TreeNode makeTree(int[] nums, int low, int high)
    {
        if(low>high)
            return null;
        
        int mid=low+(high-low)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=makeTree(nums, low, mid-1);
        node.right=makeTree(nums, mid+1,high);
        return node;
    }
}
