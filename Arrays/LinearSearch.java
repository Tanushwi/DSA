//Q8. Linear Search

//---> Optimised Solution
/*import java.util.*;
class LinearSearch{
	public static int linearsearch(int a[],int tar)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==tar)
				return i;
		}
		return -1;
	}
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=kb.nextInt();
		int tar=kb.nextInt();
		int pos=linearsearch(a,tar);
		if(pos==-1)
			System.out.print("Not Found");
		else
			System.out.print("Found at index "+pos);
	}
}*/