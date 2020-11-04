import java.util.Scanner;
public class question2 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int r,c1=0,c2=0,c3=0;
		char ch1,ch2;
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter User's choice:");
			ch1=sc.next().charAt(0);
			r=(int)(Math.random()*3);
			if(r==0)
				ch2='R';
			else if(r==1)
				ch2='P';
			else
				ch2='S';
			System.out.println("Computer’s choice (randomly generated):");
			System.out.println(ch2);
			if(ch1=='R')
			{
				if(ch2=='P')
				{
					System.out.println("User lose the round.");
					c2=c2+1;
				}
				else if(ch2=='S')
				{
					System.out.println("User won the round.");
					c1=c1+1;
				}
				else
				{
					System.out.println("Tie of round.");
					c3=c3+1;
				}
			}
			else if(ch1=='P')
			{
				if(ch2=='R')
				{
					System.out.println("User won the round.");
					c1=c1+1;
				}
				else if(ch2=='S')
				{
					System.out.println("User lose the round.");
					c2=c2+1;
				}
				else
				{
					System.out.println("Tie of round.");
					c3=c3+1;
				}
			}
			else
			{
				if(ch2=='P')
				{
					System.out.println("User won the round.");
					c1=c1+1;
				}
				else if(ch2=='R')
				{
					System.out.println("User lose the round.");
					c2=c2+1;
				}
				else
				{
					System.out.println("Tie of round.");
					c3=c3+1;
				}
			}
		}
		if(c1>c2)
			System.out.println("3 Rounds over, User scored "+c1+", user won the game.");
		else if(c1<c2)
			System.out.println("3 Rounds over, User scored "+c1+", user lose the game.");
		else
			System.out.println("3 Rounds over, User scored "+c1+", Tie of game.");
	}
}