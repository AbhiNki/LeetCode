package level_easy;

public class BinaryTreePathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public boolean hasPathSum(TreeNode root, int sum) {
        
        if(root==null)return false;
        
        if(root.left==null && root.right==null)
            return sum==root.val;
        
        return (hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val));
        
    }


}
