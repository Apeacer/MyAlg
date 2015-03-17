package chapter_1_sort;

/**
 * auto		:魏宁
 * date		：2015.3.14
 * discribe	:用于插入排序
 */
public class InsertSort 
{
	public InsertSort()
	{
		
	}
	
	/**
	 * discribe: 数组的排序
	 * @param : array   被排数组
	 * @return: array   排完数组
	 */
	public int[] sort(int[] array)
	{
		
		int length=array.length;//得到数组的长度
		
		int [] now_array=array;
		
		for(int j=2;j<length+1;j++)
		{
			
			int key=now_array[j];
			int i=j-1;
			while(i>0&&now_array[i]>key)
			{
				
			}
		}
		
		return now_array;
		
	}
	
	/**
	 * discribe:将两个书交换
	 * @param a
	 * @param b
	 */
	private void swap(Object a ,Object b)
	{
		Object temp=a;
		a=b;
		b=temp;
	}
	
}
