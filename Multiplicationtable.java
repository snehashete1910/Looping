package loop;

import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args)
	{

		int n,m,mi;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of number");
		System.out.println("Enter value of m : ");
        m=s.nextInt();
        System.out.println("Enter value of n : ");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			mi=n*i;
			
				System.out.println("multiplication of table : "+mi);
		}

	}

}
