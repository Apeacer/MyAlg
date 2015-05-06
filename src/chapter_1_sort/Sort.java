package chapter_1_sort;

import javax.swing.text.Highlighter.Highlight;

/**
 * auto		魏宁
 * date		2015.3.14
 * discribe	用于各种排序
 */
public class Sort 
{
	int []array;
	int length;
	
	
	/**
	 * discribe: 构造方法传入数组
	 * @param array   被排数组
	 */
	public Sort(int[] array)
	{
		this.array=array;	
		this.length=array.length;
	}
	
	/**
	 * discribe: 将两个书交换
	 * @param a
	 * @param b
	 */
	private void swap(int a ,int b)
	{
		int temp=array[a];
		array[a]=array[b];
		array[b]=temp;
	}
	
	/**
	 * discribe: 选择排序
	 * @param array   被排数组
	 */
	public void selectSort()
	{
		for(int i = 0 ; i < length ; i++)
		{
			for(int j = i+1 ; j < length ; j++)
			{
				if(array[i] > array[j])
					swap(i, j);
			}
		}
	}
	
	/**
	 * discribe: 冒泡排序
	 * @param array   被排数组
	 */
	public void bubbleSort()
	{
		for(int i = length-1; i > 0; i--)
		{
			for(int j = 0 ; j < i ; j++ )
			{
				if(array[j] > array[j + 1])
				swap(j, j+1);
			}
			
		}
	}
	
	/**
	 * discribe: 插入排序
	 * @param array   被排数组
	 */
	public void insertSort()
	{	
		for(int j=1;j<length;j++)
		{		
			for(int i=j; (i > 0) && (array[i] < array[i-1]); i--)
			{
				swap(i-1, i);
			}
		}
		
	}
	
	/**
	 * discribe: 快速排序
	 * @param array   被排数组
	 */
	public void quickSort()
	{
		quickSorting(array, 0, length-1);
	}
	public void quickSorting(int[]list, int low, int hight)
	{
		int pivotops;
		
		if(low<hight)
		{
			pivotops=partition(list,low,hight);
			quickSorting(list, low, pivotops-1);
			quickSorting(list, pivotops+1, hight);
		}
	}
	public int partition(int[] list,int low, int height)
	{
		int pivot=list[low];
		while(low<height)
		{
			while(low<height && list[height]>=pivot)
				height--;
			
			if(low<height)
				list[low++]=list[height];
			
			while (low<height && list[low]<=pivot)
				low++;
			
			if(low<height)
				list[height--]=list[low];
			
		}
		
		list[low]=pivot;
		return low;

	}
	

	
}
