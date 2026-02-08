//Q3. Check if array is sorted

//---> Optimised
/*import java.util.*;
class ArraySortedOrNot
{
	public static boolean sortedornot(int a[])
	{
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<a[i-1])
				return false;
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=kb.nextInt();
		}
		if(sortedornot(a))
			System.out.print("Sorted");
		else
			System.out.print("Not Sorted");
	}
}*/