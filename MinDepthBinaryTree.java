package level_easy;

public class MinDepthBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        int leftDepth=minDepth(root.left);
        int rightDepth=minDepth(root.right);
        
        return (leftDepth==0 || rightDepth==0)?leftDepth+rightDepth+1:Math.min(leftDepth, rightDepth)+1;
    }

}