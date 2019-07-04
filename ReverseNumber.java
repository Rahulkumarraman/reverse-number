import java.util.Scanner;
class ReverseNumber
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter no to reverse");
		int n=s.nextInt();
		int x,r=0;
		while(n>0)
		{
           x=n%10;
           r=10*r+x;
           n=n/10;
		}
		System.out.println("reverse of no" + r);
	}
}