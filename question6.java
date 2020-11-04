public class question6 
{
	public static boolean isPrime(int n)
	{
		for(int i=2;i<=(int)Math.sqrt(n);i++)
		{
			if(n%i==0)
				return(false);
		}
		return(true);
	}
	public static void main(String args[])
	{
		int c=1,i;
		for(i=3;c<10001;i++)
		{
			if(i%2!=0 && isPrime(i)==true)
				c=c+1;
		}
		System.out.println(i-1);
	}
}
