public class question5 
{
	public static boolean checkReverse(int n)
	{
		int t=n,res=0,r=0;
		while(n>0)
		{
			r=n%10;
			res=(res*10)+r;
			n=n/10;
		}
		if(res==t)
			return(true);
		else
			return(false);
	}
	public static void main(String args[])
	{
		int p,max=0;
		for(int i=999;i>=100;i--)
		{
			for(int j=999;j>=100;j--)
			{
				p=i*j;
				if(p>max && checkReverse(p))
				{
					max=p;
				}	
			}
		}
		System.out.println(max);
	}
}
