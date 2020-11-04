import java.util.Scanner;
public class question4 
{
	public static int checkLeap(int year)
	{
		if(((year%4==0) && (year%100!=0))||(year%400==0))
			return(1);
		else
			return(0);
	}
	public static void dayIdentifier(int d,String s,int feb)
	{
		if(s.equals("January"))
			System.out.println("Day Number:"+d);
		else if(s.equals("Febuary"))
			System.out.println("Day Number:"+(d+31));
		else if(s.equals("March"))
			System.out.println("Day Number:"+(d+31+feb));
		else if(s.equals("April"))
			System.out.println("Day Number:"+(d+31+feb+31));
		else if(s.equals("May"))
			System.out.println("Day Number:"+(d+31+feb+31+30));
		else if(s.equals("June"))
			System.out.println("Day Number:"+(d+31+feb+31+30+31));
		else if(s.equals("July"))
			System.out.println("Day Number:"+(d+31+feb+31+30+31+30));
		else if(s.equals("August"))
			System.out.println("Day Number:"+(d+31+feb+31+30+31+30+31));
		else if(s.equals("September"))
			System.out.println("Day Number:"+(d+31+feb+31+30+31+30+31+31));
		else if(s.equals("October"))
			System.out.println("Day Number:"+(d+31+feb+31+30+31+30+31+31+30));
		else if(s.equals("November"))
			System.out.println("Day Number:"+(d+31+feb+31+30+31+30+31+31+30+31));
		else
			System.out.println("Day Number:"+(d+31+feb+31+30+31+30+31+31+30+31+30));
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a date:");
		String date=sc.nextLine();
		String str[]=date.split(" ");
		int year=Integer.parseInt(str[str.length-1]);
		int leap=checkLeap(year);
		int d=Integer.parseInt(str[0]);
		if(leap==1)
			dayIdentifier(d,str[2],29);
		else
		    dayIdentifier(d,str[2],28);
	}
}
