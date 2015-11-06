package chapter_1_sort;

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
	//对于一段数据，拿出第一个数，把比它小的，放它左边，大的去它右边，最后返回他的位置
	public int partition(int[] list,int low, int height)
	{
		int pivot=list[low];//拿出第一个
		while(low<height)
		{
			while(low<height && list[height]>=pivot)//比它大的从右边开始找
				height--;
			
			if(low<height)
				list[low++]=list[height];//换过去，[low]=[heiht],low+1
			
			while (low<height && list[low]<=pivot)//比它小的从左边找
				low++;
			
			if(low<height)
				list[height--]=list[low];//换过去，[heiht]=[low],heiht+1
			
		}
		list[low]=pivot;//把第一个数还原
		return low;

	}
	
	/**
	 * 最大堆排序
	 */
	public void HeapSort()
	{
		for(int i=0; i<length; i++)
		{
			bulidHeap(length-i);
			swap(0, length-i-1);//每次把最大的方到队尾(length-1,length-2,.....),若要探究原理，在这行前后输出array
		}
	}
	public void bulidHeap(int end)
	{
		
		for(int j=end/2-1; j>=0; j--)//从叶节点的父节点开始往前
		{
			int i=j;// 第一次是对当前节点判断其与子节点的大小，没换的话j--继续，若换了，还要将被换的子节点做为根，与其子节点再进行一样的操作，直到底部(叶节点)
			while(2*i+1<=end)//判断到没到头(叶节点)
			{
				//以下是一个操作
				
				int left = 2*(i+1)-1;//左子位置
				int right = 2*(i+1);//右子位置
				int max;//大的那个的位置
				
				if(left<end && array[left]>array[i])// 找左子树与父节点中大的那个的位置
					max=left;
				else 
					max = i;
				if(right<end && array[right]>array[max])// 找加上右子树后大的那个的位置
					max = right;
				
				if(max==i || max>end)//不用换，或到头了，结束
				{
					break;
				}
				else 
				{
					swap(i, max);//换父子位置
					i=max;//换了的话还要将还完的子节点继续往下判断
				}
			}
		}
	}
//	public class MaxHeap {
//		int[] heap;
//		int heapsize;
//		public MaxHeap(int[] array)
//		{
//		    this.heap=array;    
//		    this.heapsize=heap.length;
//		}
//		public void BuildMaxHeap()
//		{
//		    for(int i=heapsize/2-1;i>=0;i--)
//		    {
//		        Maxify(i);//依次向上将当前子树最大堆化
//		    }
//		}
//		public void HeapSort()
//		{
//		    for(int i=0;i<heap.length;i++)
//		    {
//		        //执行n次，将每个当前最大的值放到堆末尾
//		        int tmp=heap[0];
//		        heap[0]=heap[heapsize-1];
//		        heap[heapsize-1]=tmp;
//		        heapsize--;
//		        Maxify(0);
//		    }
//		}
//		public void Maxify(int i)
//		{
//		    int l=Left(i);
//		    int r=Right(i);
//		    int largest;
//		    
//		    if(l<heapsize&&heap[l]>heap[i])
//		        largest=l;
//		    else
//		        largest=i;
//		    if(r<heapsize&&heap[r]>heap[largest])
//		        largest=r;
//		    if(largest==i||largest>=heapsize)//如果largest等于i说明i是最大元素 largest超出heap范围说明不存在比i节点大的子女
//		        return ;
//		    int tmp=heap[i];//交换i与largest对应的元素位置，在largest位置递归调用maxify
//		    heap[i]=heap[largest];
//		    heap[largest]=tmp;
//		    Maxify(largest);
//		}
//		public void IncreaseValue(int i,int val)
//		{
//		    heap[i]=val;
//		    if(i>=heapsize||i<=0||heap[i]>=val)
//		        return;
//		    int p=Parent(i);
//		    if(heap[p]>=val)
//		        return;
//		    heap[i]=heap[p];
//		    IncreaseValue(p, val);
//		}
//
//		private int Parent(int i)
//		{
//		    return (i-1)/2;
//		}
//		private int Left(int i)
//		{
//		    return 2*(i+1)-1;
//		}
//		private int Right(int i)
//		{
//		    return 2*(i+1);
//		}
//		}
	

	
}
