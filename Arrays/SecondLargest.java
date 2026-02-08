//Q2. Second Largest Element

//---> Brute Force
/*import java.util.*;
class SecondLargest
{
	public static int secondlargest(int a[])
	{
		Arrays.sort(a);
		int larg=a[a.length-1];
		int slarg=-1;
		for(int i=a.length-2;i>=0;i--)
		{
			if(a[i]!=larg)
			{
				slarg=a[i];
				break;
			}
		}
		return slarg;
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
		System.out.println(secondlargest(a));
	}
}*/

//---> Better Solution
/*import java.util.*;
class SecondLargest
{
	public static int secondlargest(int a[])
	{
		int larg=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>larg)
				larg=a[i];
		}
		int slarg=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>slarg && a[i]!=larg)
				slarg=a[i];
		}
		return slarg;
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
		System.out.println(secondlargest(a));
	}
}*/

//---> Optimised Solution
/*import java.util.*;
class SecondLargest
{
	public static int secondlargest(int a[])
	{
		int larg=a[0],slarg=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>larg)
			{
				slarg=larg;
				larg=a[i];
			}
			else if(a[i]>slarg && a[i]!=larg)
				slarg=a[i];
		}
		return slarg;
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
		System.out.println(secondlargest(a));
	}
}*/