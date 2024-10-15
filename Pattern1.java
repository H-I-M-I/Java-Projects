import java.util.Scanner;

public class pattern1
{
public static void main(String[] args)
 {

	Scanner input = new Scanner(System.in);

	int n, row, col;

	System.out.print("Enter the number of line : ");
	n = input.nextInt();

	for(row=1; row<=n; row++)
	{
		for(col=1; col<=row; col++)
		{
			System.out.print(" "+row);
		}
		System.out.println();
	}

 }

}