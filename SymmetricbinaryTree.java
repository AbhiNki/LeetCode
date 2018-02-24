package level_easy;

public class SymmetricbinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call the function
	}
	public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        boolean result=isSymmetricHelp(root.left, root.right);      
        return result;
    }
    
    public boolean isSymmetricHelp(TreeNode p, TreeNode q)
    {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        
        if(p.val==q.val)
            return isSymmetricHelp(p.left, q.right) && isSymmetricHelp(p.right, q.left);
        
        return false;
    }

}
