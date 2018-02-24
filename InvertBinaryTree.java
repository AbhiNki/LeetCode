package level_easy;

import java.util.Deque;
import java.util.LinkedList;

public class InvertBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static TreeNode invertBinaryTree(TreeNode root)
	{
		if(root==null)
		{
			return null;
		}
		TreeNode left=root.left;
		TreeNode right=root.right;
		
		root.left=invertBinaryTree(right);
		root.right=invertBinaryTree(left);
		
		return root;
	}
	
	public static TreeNode invertBinaryTree2(TreeNode root)
	{
		if(root==null)return null;
		
		Deque<TreeNode> stack=new LinkedList<>();
		stack.push(root);
		
		while(!stack.isEmpty())
		{
			TreeNode node=stack.pop();
			TreeNode left=node.left;
			node.left=node.right;
			node.right=left;
			
			if(node.left!=null)
			{
				stack.push(node.left);
			}
			if(node.right!=null)
			{
				stack.push(node.right);
			}
		}
		return root;
	}

}
