//Q12. Maximum consecutive ones

//---> Optimised Solution
/*class MaximumConsecutiveOnes
{
	public static int maxconsones(int arr[])
	{
		int max=-1,ctr=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				ctr++;
				max=Math.max(max,ctr);
			}
			else
				ctr=0;
		}
		return max;
	}
	public static void main(String args[])
	{
		int arr[]={1,1,0,1,1,1,1,0,1,1};
		System.out.print(maxconsones(arr));
	}
}*/