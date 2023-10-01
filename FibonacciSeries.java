public class FibonacciSeries
{
	public static void main(String[] args)
	{
		int n1=0,n2=1,n3,count=10,i;
		System.out.println("Fibonacci series:");
		System.out.print(n1+" "+n2);
		for(i=2;i<count;++i)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
                        n1=n2;
                        n2=n3;
		}
	}
} 

output

C:\Users\B Divya sreee>D:

D:\>cd sree

D:\sree>javac FibonacciSeries.java

D:\sree>java FibonacciSeries
Fibonacci series:
0 1 1 2 3 5 8 13 21 34