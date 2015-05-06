package chapter_2_numbertheory;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * auto		魏宁
 * date		2015.3.14
 * discribe	用于求一些数字
 */
public class NumberTheory 
{
	private final int NO_MARK=0;
	private final int NOT_PRIME_NUMBER=-1;
	
	
	public NumberTheory()
	{}
	
	/**
	 * discribe: 筛选法求素数
	 * @param 所需素数的范围
	 * @return arr 将结果存入数组返回
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
		
	}//-----------------------------------------------------------------------------------
	
	/**
	 * discribe: 判断是否是素数
	 * @param n 要判断的数
	 * @return boolean 返回结果
	 */
	public boolean isPrimeNumber(int n) 
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	/**
	 * discribe: 辗转相除法求最大公约数,适合于小于64位的数字
	 * @param a  输入的两个数之一 b  输入的两个数之二
	 * @return int 将结果返回
	 */
	public int GreatestCommonDivisor_E(int a,int b) 
	{
		//排除0输入
		if(a==0||b==0)
		{
			System.out.println("can not input zero!");
			return -1;
		}
		
		int m;
		int n;
		//大值赋予m,小值给n
		if(a>b)
		{
			m=a;
			n=b;
		}
		else 
		{
			m=b;
			n=a;
		}
		//求余数
		int r=m%n;
		if(r==0)
		{
			return n;			
		}	
		else
		{
			return GreatestCommonDivisor_E(n, r);
		}
	}
	
	/**
	 * discribe: Setin算法求最大公约数，适合于较大的数
	 * @param a  输入的两个数之一 b  输入的两个数之二
	 * @return int 将结果返回
	 */
	public int GreatestCommonDivisor_S(int a , int b )
	{
		if(a==0)
			return b;
		if(b==0)
			return a;
		
		int a1=a,b1=b;
		
		if(a1%2==0 && b1%2==0)
		{
			return 2*GreatestCommonDivisor_S(a1/2, b1/2);
		}
		if(a1%2==0)
		{
			return GreatestCommonDivisor_S(a1/2, b1);
		}
		if(b1%2==0)
		{
			return GreatestCommonDivisor_S(a1, b1/2);
		}
		return GreatestCommonDivisor_S(Math.abs(a1-b1), Math.min(a1, b1));
	}
	
	/**
	 * discribe: 计算最小公倍数
	 * @param a  输入的两个数之一 b  输入的两个数之二
	 * @return int 将结果返回
	 */
	public int LeastCommonMultiple(int a, int b)
	{
		return (a*b)/GreatestCommonDivisor_S(a, b);
	}
	
	/**
	 * discribe: 分解质因数
	 * @param a  输入的被分解数
	 * @return arr 将结果数组返回
	 */
	public int[] PrimeFactor(int a)
	{
		if(isPrimeNumber(a))
		{
			System.out.println(a);
		}
		else 
		{
			for(int i=2;i<a;i++)
			{
				if(a%i==0)
				{
					System.out.println(i);
					if(isPrimeNumber(a/i))
					{
						System.out.println(a/i);
						break;
					}
					else
					{
						PrimeFactor(a/i);
					}
					break;
				}
			}
		}
		int r[]={0};
		return r;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
