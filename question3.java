public class question3 
{
	public static void main(String args[])
	{
		long c,max=1,nmax=1,n;
		for(int i=2;i<=1000000;i++)
		{
			n=i;c=1;;
			while(n!=1)
			{
				if(n%2==0)
				{
					n=n/2;
					c=c+1;
				}
				else
				{
					n=(3*n)+1;
					c=c+1;
				}
			}
			if(c>max)
			{
				max=c;
				nmax=i;
			}
		}
		System.out.println(nmax);
	}
}
