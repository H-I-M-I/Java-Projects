
package palindrome;

import java.util.Scanner;

public class Palindrome 
{

   
    public static void main(String[] args) 
    {
        
        String reverse = "", n;
        
        Scanner input = new Scanner (System.in);
        System.out.print("Enter any number :");
        n = input.nextLine();
        
        int i;
        int L = n.length();
        
        for(i=L-1; i>=0; i--)
        {
            reverse = reverse + n.charAt(i);
            
        }
        
        if(n.equals(reverse))
        {
            System.out.println("This number is palindrome");
        }
        else
        {
            System.out.println("This number is not palindrome");
        }
        
    }
    
}
