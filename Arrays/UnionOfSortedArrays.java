//Q9. Union of two sorted arrays

//---> Brute Force
/*import java.util.*;
class UnionOfTwoSortedArray
{
	public static void union(int arr1[],int arr2[],ArrayList<Integer>ar)
	{
		HashSet<Integer>hset=new HashSet<>();
		for(int num:arr1)
			hset.add(num);
		for(int num:arr2)
			hset.add(num);
		for(int num:hset)
			ar.add(num);
	}
	public static void main(String args[])
	{
		int arr1[]={1,1,2,3,4,5};
		int arr2[]={2,3,4,4,5,6};
		ArrayList<Integer>ar=new ArrayList<>();
		union(arr1,arr2,ar);
		for(int num:ar)
		{
			System.out.print(num+" ");
		}
	}
}*/

//---> Optimised Solution
/*class UnionOfTwoSortedArrays
{
	public static int union(int arr1[],int arr2[],int u[])
	{
		int m=arr1.length,n=arr2.length;
		int i=0,j=0,k=0;
		while(i<m && j<n)
		{
			if(arr1[i]<arr2[j])
			{
				if(k==0||u[k-1]!=arr1[i])
					u[k++]=arr1[i++];
			}
			else if(arr2[j]<arr1[i])
			{
				if(k==0||u[k-1]!=arr2[j])
					u[k++]=arr2[j++];
			}
			else
			{
				if(k==0||u[k-1]!=arr1[i])
					u[k++]=arr1[i];
				i++;
				j++;
			}
		}
		while(i<m)
		{
			if(k==0||u[k-1]!=arr1[i])
				u[k++]=arr1[i++];
		}
		while(j<n)
		{
			if(k==0||u[k-1]!=arr2[j])
				u[k++]=arr2[j++];
		}
		return k;
	}
	public static void main(String args[])
	{
		int arr1[]={1,1,2,3,4,5};
		int arr2[]={2,3,4,4,5,6};
		int u[]=new int[arr1.length+arr2.length];
		int k=union(arr1,arr2,u);
		for(int i=0;i<k;i++)
		{
			System.out.print(u[i]+" ");
		}
	}
}*/