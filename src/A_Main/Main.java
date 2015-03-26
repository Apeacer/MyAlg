package A_Main;

import java.util.Collection;
import chapter_1_sort.Sort;

public class Main 
{
	//主方法
	public static void main (String[] arg)
	{
		Sort sort=new Sort(lists);
//		sort.selectSort();
//		sort.bubbleSort();
//		sort.insertSort();
		sort.quickSort();
		for(int a: lists)
		{
			System.out.print(a+" ");
		}
	}
	
	//插入排序测试用例
	public static void testInsterSort()
	{
	}
	Collection<?>a;
	
	static int lists[]={6,2,8,5,7,2,1,0,34,12,96,23,16,38,63,42};
}
