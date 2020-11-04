import java.util.Scanner;
public class question1 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String DNA=sc.nextLine();
		String RNA="";
		for(char ch:DNA.toCharArray())
		{
			if(ch=='G')
				RNA=RNA+'C';
			else if(ch=='C')
				RNA=RNA+'G';
			else if(ch=='T')
				RNA=RNA+'A';
			else if(ch=='A')
				RNA=RNA+'U';
			else
			{
				System.out.println("Invalid Input");
				System.exit(0);
			}
		}
		System.out.println(RNA);
	}
}
