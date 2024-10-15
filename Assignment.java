
package assignment;

import java.util.Scanner;

public class Assignment
{

    public static void main(String[] args)
    {
        Numbers no = new Numbers ();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int x = input.nextInt();

         no.setMember(x);
         no.prime ();
         no.factorial ();

    }
}



class Numbers
{
    int m;

      void setMember(int x)
      {
          m = x;
      }


      void prime()
      {
         int i, count=0;

         if(m==0||m==1)
         {
             System.out.println(m+" is not a prime number");
         }
         else
         {
            for(i=2;i<m;i++)
            {
                if(m%i==0)
                {
                      System.out.println(m+" is not a prime number");
                      count++;
                      break;
                }
            }

        if(count==0)
        {
            System.out.println(m+" is a prime number");
        }
        else
        {
		    System.out.println(m+" is not a prime number");
	    }
      }
      }



     void factorial()
     {
        int i;
        long fact=1;

        for(i=1;i<=m;i++)
        {
            fact=fact*i;
        }

        System.out.println("Factorial of "+m+" is : "+fact);
     }
}


