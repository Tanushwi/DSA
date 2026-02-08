//Q11. Find missing element

//---> Brute Force
/*class MissingElement
{
	public static int missing(int a[],int n)
	{
		for(int i=1;i<=n;i++)
		{
			int flag=0;
			for(int j=0;j<n-1;j++)
			{
				if(a[j]==i)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				return i;
		}
		return -1;
	}
	public static void main(String args[])
	{
		int arr[]={1,2,4,5},n=5;
		int ans=missing(arr,n);
		System.out.print(ans);
	}
}*/

//---> Better Solution
/*class MissingElement
{
	public static int missing(int a[],int n)
	{
		int hash[]=new int[n+1];
		for(int i=0;i<n-1;i++)
		{
			hash[a[i]]=1;
		}
		for(int i=1;i<=n;i++)
		{
			if(hash[i]==0)
				return i;
		}
		return -1;
	}
	public static void main(String args[])
	{
		int arr[]={1,2,4,5},n=5;
		int ans=missing(arr,n);
		System.out.print(ans);
	}
}*/

//---> Optimised Solution
/*class MissingElement
{
	public static int missing(int a[],int n)
	{
		int x=0,y=0;
		for(int i=0;i<n-1;i++)
		{
			y=y^a[i];
			x=x^(i+1);
		}
		x=x^n;
		return x^y;
	}
	public static void main(String args[])
	{
		int arr[]={1,2,4,5},n=5;
		int ans=missing(arr,n);
		System.out.print(ans);
	}
}*/

