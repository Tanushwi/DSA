//Q10. Intersection of two sorted arrays

//---> Brute Force
/*import java.util.*;
class IntersectionOfSortedArrays
{
	public static int intersection(int arr1[],int arr2[],int inter[])
	{
		int m=arr1.length,n=arr2.length;
		int k=0;
		int vis[]=new int[arr2.length];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr1[i]==arr2[j] && vis[j]==0)
				{
					inter[k++]=arr1[i];
					vis[j]=1;
					break;
				}
			}
		}
		return k;
	}
	public static void main(String args[])
	{
		int arr1[]={1,1,2,3,4,5};
		int arr2[]={2,3,4,4,6};
		int inter[]=new int[arr1.length];
		int k=intersection(arr1,arr2,inter);
		for(int i=0;i<k;i++)
		{
			System.out.print(inter[i]+" ");
		}
	}
}*/

//---> Optimised Solution
/*import java.util.*;
class IntersectionOfSortedArrays
{
	public static int intersection(int arr1[],int arr2[],int inter[])
	{
		int m=arr1.length,n=arr2.length;
		int i=0,j=0,k=0;
		while(i<m && j<n)
		{
			if(arr1[i]<arr2[j])
				i++;
			else if(arr1[i]>arr2[j])
				j++;
			else
			{
				inter[k++]=arr1[i];
				i++;
				j++;
			}
		}
		return k;
	}
	public static void main(String args[])
	{
		int arr1[]={1,1,2,3,4,5};
		int arr2[]={2,3,4,4,5,6};
		int inter[]=new int[arr1.length];
		int k=intersection(arr1,arr2,inter);
		for(int i=0;i<k;i++)
		{
			System.out.print(inter[i]+" ");
		}
	}
}*/