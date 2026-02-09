//Q13. Find the number appearing once in twice array

//--->Brute Force
/*import java.util.*;
class NumberAppearingTwiceInArray
{
	public static int appearingonce(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i],ctr=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==num)
				{
					ctr++;
				}
			}
			if(ctr==1)
				return arr[i];
		}
		return -1;
	}
	public static void main(String args[])
	{
		int arr[]={1,1,2,2,3,4,4};
		System.out.print(appearingonce(arr));
	}
}*/

//--->Better Solution
/*import java.util.*;
class NumberAppearingTwiceInArray
{
	public static int appearingonce(int arr[])
	{
		Map<Integer,Integer>hmap=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			hmap.put(arr[i],hmap.getOrDefault(arr[i],0)+1);
		}
		for(Map.Entry<Integer,Integer>entry:hmap.entrySet())
		{
			if(entry.getValue()==1)
				return entry.getKey();
		}
		return -1;
	}
	public static void main(String args[])
	{
		int arr[]={1,1,2,3,3,4,4};
		System.out.print(appearingonce(arr));
	}
}*/

//--->Optimised Solution
/*import java.util.*;
class NumberAppearingTwiceInArray
{
	public static int appearingonce(int arr[])
	{
		int x=0;
		for(int i=0;i<arr.length;i++)
		{
			x=x^arr[i];
		}
		return x;
	}
	public static void main(String args[])
	{
		int arr[]={1,2,2,3,3,4,4};
		System.out.print(appearingonce(arr));
	}
}*/