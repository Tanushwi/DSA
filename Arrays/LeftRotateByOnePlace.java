//Q5. Left rotate the array by 1 place

//---> Optimised Solution
/*import java.util.*;
class LeftRotateByOnePlace
{
	public static void leftrotate(int a[])
	{
		int temp=a[0];
		for(int i=1;i<a.length;i++)
		{
			a[i-1]=a[i];
		}
		a[a.length-1]=temp;
	}
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
		System.out.print("Enter n:");
		int n=kb.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=kb.nextInt();
		leftrotate(a);
		System.out.print("Final array:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}*/