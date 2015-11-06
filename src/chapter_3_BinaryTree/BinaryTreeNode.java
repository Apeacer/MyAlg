package chapter_3_BinaryTree;

public class BinaryTreeNode<T> 
{
	/**
	 * 权值
	 */
	private T value;
	/**
	 * 左子树
	 */
	private BinaryTreeNode<T> leftChild;
	/**
	 * 右子树
	 */
	private BinaryTreeNode<T> rightChild;
	
	
	/**
	 * 一个参数构造方法
	 * @param value
	 */
	public BinaryTreeNode(T value)
	{
		setValue(value);
		setLeftChild(null);
		setRightChild(null);
	}
	
	/**
	 * 三个参数构造方法
	 * @param value
	 * @param leftChild
	 * @param rightChild
	 */
	public BinaryTreeNode(T value,BinaryTreeNode<T> leftChild,BinaryTreeNode<T> rightChild)
	{
		setValue(value);
		setLeftChild(leftChild);
		setRightChild(rightChild);
	}
	
	/**
	 * 得到节点权植
	 * @return
	 */
	public T getValue() 
	{
		return value;
	}
	/**
	 * 设置节点权值
	 * @param value
	 */
	public void setValue(T value) 
	{
		this.value = value;
	}
	/**
	 * 得到左子树根
	 * @return
	 */
	public BinaryTreeNode<T> getLeftChild() 
	{
		return leftChild;
	}
	/**
	 * 赋值左子树根
	 * @param leftChild
	 */
	public void setLeftChild(BinaryTreeNode<T> leftChild) 
	{
		this.leftChild = leftChild;
	}
	/**
	 * 得到右子树根
	 * @return
	 */
	public BinaryTreeNode<T> getRightChild() 
	{
		return rightChild;
	}
	/**
	 * 设置右子树根
	 * @param rightChild
	 */
	public void setRightChild(BinaryTreeNode<T> rightChild) 
	{
		this.rightChild = rightChild;
	}
	
	
}
