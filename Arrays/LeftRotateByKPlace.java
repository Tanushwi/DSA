//Q6. Left rotate the array by k places

//---> Brute Force
/*import java.util.*;
class LeftRotateByKPlace
{
	public static void leftrotate(int a[],int k)
	{
		int n=a.length;
		k=k%n;
		int temp[]=new int[k];
		for(int i=0;i<k;i++)
		{
			temp[i]=a[i];
		}
		for(int i=k;i<n;i++)
		{
			a[i-k]=a[i];
		}
		for(int i=0;i<temp.length;i++)
		{
			a[n-k+i]=temp[i];
		}
	}
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
		System.out.print("Enter n:");
		int n=kb.nextInt();
		System.out.print("Enter k:");
		int k=kb.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=kb.nextInt();
		leftrotate(a,k);
		System.out.print("Final array:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}*/

//---> Optimised Solution
/*import java.util.*;
class LeftRotateByKPlace
{
	public static void leftrotate(int a[],int k)
	{
		int n=a.length;
		k=k%n;
		reverse(a,0,k-1);
		reverse(a,k,n-1);
		reverse(a,0,n-1);
	}
	public static void reverse(int a[],int i,int j)
	{
		while(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	}
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
		System.out.print("Enter n:");
		int n=kb.nextInt();
		System.out.print("Enter k:");
		int k=kb.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=kb.nextInt();
		leftrotate(a,k);
		System.out.print("Final array:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}*/