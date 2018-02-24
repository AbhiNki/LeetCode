package level_easy;

public class BinaryTreeLCA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static TreeNode findLCA1(TreeNode root, TreeNode p, TreeNode q)
	{
		if(root.val>p.val && root.val>q.val)
			return findLCA1(root.left, p, q);
		else if(root.val<p.val && root.val <q.val)
			return findLCA1(root.right, p, q);
		else return root;
	}
	
	public static TreeNode findLCA2(TreeNode root, TreeNode p, TreeNode q)
	{
		if(p.val>q.val)
		{
			return findLCA2(root, q,p);
		}
		if(root.val>=p.val && root.val <= q.val)
			return root;
		return findLCA2(root.val>p.val?root.left:root.right, p ,q);
	}
	
	public static TreeNode findLCA3(TreeNode root, TreeNode p, TreeNode q)
	{
		while (true) {
            if (root.val > p.val && root.val > q.val)
                root = root.left;
            else if (root.val < p.val && root.val < q.val)
                root = root.right;
            else
                return root;
        }
	}

}
