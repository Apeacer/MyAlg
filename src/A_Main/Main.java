package A_Main;

import java.util.Collection;

import chapter_1_sort.Sort;
import chapter_2_numbertheory.NumberTheory;

public class Main 
{
	//主方法
	public static void main (String[] arg)
	{
		//排序
//		Sort sort=new Sort(lists);
//		sort.selectSort();
//		sort.bubbleSort();
//		sort.insertSort();
//		sort.quickSort();
//		for(int a: lists)
//		{
//			System.out.print(a+" ");
//		}System.out.println();

		
		//数论
		NumberTheory nTheory=new NumberTheory();
//		int arr[]=nTheory.PrimeNumber(100);
//		for(int s: arr)
//		{
//			System.out.print(s+" ");
//		}
//		System.out.println();
//		for(int s: arr)
//		{
//			if(nTheory.isPrimeNumber(s))
//				System.out.print(1+" ");
//			else 
//			{
//				System.out.print(0+" ");				
//			}
//		}
//		System.out.println();
////		2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
		int a1=370; int b1=100;
		System.out.println(nTheory.GreatestCommonDivisor_E(a1,b1));
		System.out.println(nTheory.GreatestCommonDivisor_S(a1,b1));
		System.out.println(nTheory.LeastCommonMultiple(a1, a1));
		
		nTheory.PrimeFactor(128);
	
	}
	
	//插入排序测试用例
	public static void testInsterSort()
	{
	}
	Collection<?>a;
	
	static int lists[]={6,2,8,5,7,2,1,0,34,12,96,23,16,38,63,42};
	
	
}
