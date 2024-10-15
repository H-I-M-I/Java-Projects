
package numpack;

public class Fields
{
    int nums[]=new int[1000];
    int count=0;

	public void addNum(int t)
	{
		int L=0;

		for(int i=0; i<L; i++)
		{
			if(nums[i]==t)
			{
				L++;
				break;
			}
		}

		if(L==0)
		{
			nums[count]=t;
			count++;
		}

	}

    public  void printNumbers()
    {
	  if(count==0) System.out.println("\nThere is no element in the array.");

	  for(int i=0;i<count;i++)
	  {
		  System.out.println(nums[i]+" ");
	  }
	  System.out.println();
    }

    public void showCount()
    {
         System.out.println("\nThe number of element in ''nums'' array is: "+count);
         System.out.println();

    }


}
