//Q4. Remove duplicates from sorted array

//---> Brute Force
/*import java.util.*;
class RemoveDuplicatesFromSortedArray
{
	public static int removeDuplicates(int a[])
	{
		HashSet<Integer>hset=new HashSet<>();
		for(int i=0;i<a.length;i++)
			hset.add(a[i]);
		int index=0;
		for(int num:hset)
		{
			a[index++]=num;
		}
		return index;
	}
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
		System.out.print("Enter n:");
		int n=kb.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=kb.nextInt();
		}
		int tot=removeDuplicates(a);
		System.out.print("Final array:");
		for(int i=0;i<tot;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}*/

//---> Optimised Solution
/*import java.util.*;
class RemoveDuplicatesFromSortedArray
{
	public static int removeDuplicates(int a[])
	{
		int index=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]!=a[index])
			{
				a[index+1]=a[i];
				index++;
			}
		}
		return (index+1);
	}
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
		System.out.print("Enter n:");
		int n=kb.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=kb.nextInt();
		}
		int tot=removeDuplicates(a);
		System.out.print("Final array:");
		for(int i=0;i<tot;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}*/