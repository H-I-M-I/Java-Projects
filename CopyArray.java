
package copyarray;

import java.util.Scanner;

public class CopyArray 
{

    
    public static void main(String[] args) 
    {
        
        int[] array1 = new int[100];
        int [] array2 = new int[array1.length];
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array : ");
        int n = input.nextInt();
        
        System.out.print("Enter the elements of the array : ");
        
        for(int i=0; i<n; i++)
        {
            array1[i] = input.nextInt();
        }
        
        for(int i=0; i<n; i++)
        {
            array2[i] = array1[i];
        }
        
        
        System.out.print("Elements of the 1st array : ");
        
        for(int i=0; i<n; i++)
        {
            System.out.print(array1[i]+" ");
        }
        
        System.out.println();
        
        System.out.print("Elements of the 2nd array : ");
        
        for(int i=0; i<n; i++)
        {
            System.out.print(array2[i]+" ");
        }
        
    }
    
    
}
