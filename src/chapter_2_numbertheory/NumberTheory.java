package chapter_2_numbertheory;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * auto		:魏宁
 * date		：2015.3.14
 * discribe	:用于求一些数字
 */
public class NumberTheory 
{
	private final int NO_MARK=0;
	private final int NOT_PRIME_NUMBER=-1;
	
	
	public NumberTheory()
	{}
	
	/**
	 * discribe: 筛选法求素数
	 * @param :  n  所需素数的范围
	 * @return: arr 将结果存入数组返回
	 */
	public int[] PrimeNumber(int n) 
	{
		int[] mark =new int[n+1];//做标记的数组
		int count=n-1;//素数的个数
		
		//用于得出素数
		//第一层循环将数字逐一检查 
		for (int i = 2; i < mark.length; i++)
		{
			//这个数的所有倍数都不是素数
			for (int j = i+i; j < mark.length; j=j+i) 
			{
				//未做标记的数拿出来检查
				if(mark[j]==NO_MARK)
				{
					mark[j]=NOT_PRIME_NUMBER;  //不是素数做标记
					count--;                   //用于统计素数数量
				}
			}	
		}
		
		//用于储存返回结果
		int result[] =new int[count];
		//去掉1，遍历素数
		for (int i = 2; i < mark.length; i++)
		{
			if(mark[i]!=NOT_PRIME_NUMBER)
			{
				//顺序存储进结果数组
				for(int j=0;j<count;j++)
				{
					if(result[j]==0)
					{
						result[j]=i;
						break;
					}
				}
			}	
		}
		
		return result;
		
	}
}
