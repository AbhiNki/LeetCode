package level_easy;


//find if two binary trees are same or not
public class ComapreBinaryTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Call the function
	}

public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val==q.val)
        {
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
        return false;
        
    }

}


    