//Q7. Move zeroes to end of array

//---> Brute Force
/*import java.util.*;
class MoveZeroesToEndOfArray
{
	public static void movezeroes(int a[]){
		int temp[]=new int[a.length];
		int ctr=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
				temp[ctr++]=a[i];
		}
		for(int i=0;i<ctr;i++)
		{
			a[i]=temp[i];
		}
		for(int i=ctr;i<a.length;i++)
			a[i]=0;
	}
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
		System.out.print("Enter n:");
		int n=kb.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=kb.nextInt();
		movezeroes(a);
		System.out.print("Final array:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}*/

//---> Optimised Solution
/*import java.util.*;
class MoveZeroesToEndOfArray
{
	public static void movezeroes(int a[]){
		int j=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				j=i;
				break;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
	}
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
		System.out.print("Enter n:");
		int n=kb.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=kb.nextInt();
		movezeroes(a);
		System.out.print("Final array:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}*/
