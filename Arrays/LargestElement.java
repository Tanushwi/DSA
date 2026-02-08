//Q1. Largest Element

//---> Brute Force
/*import java.util.*;
class Main
{
	public static int largest(int a[])
	{
		Arrays.sort(a);
		return a[a.length-1];
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
		System.out.println(largest(a));
	}
}*/

//---> Optimised Solution
/*import java.util.*;
class Main
{
	public static int largest(int a[])
	{
		int larg=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>larg)
				larg=a[i];
		}
		return larg;
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
		System.out.println(largest(a));
	}
}*/