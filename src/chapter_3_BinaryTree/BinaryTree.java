package chapter_3_BinaryTree;

public class BinaryTree<T>
{
	/**
	 * 定义根节点
	 */
	private BinaryTreeNode<T> root ;
	
	public BinaryTree(T rootValue)
	{
		root = new BinaryTreeNode(rootValue);
	}
	
	public void addLeftChild(BinaryTreeNode<T> Position,BinaryTreeNode<T> leftChild)
	{
		
	}
	
	/**
	 * 得到二叉树深度
	 */
	public int getMaxDeep(BinaryTreeNode<T> root)
	{
		if(root ==null)
			return 0;
		else 
		{
			int left = getMaxDeep(root.getLeftChild());
			int right = getMaxDeep(root.getRightChild());
			
			return 1+Math.max(left, right);
		}
	}
}
