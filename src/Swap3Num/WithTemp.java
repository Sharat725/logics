package Swap3Num;

class WithTemp
{
	public static void main(String[] args) 
	{
		int a = 2, b = 3,c=4;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		int temp = a;
		a=b;
		b=c;
		c=temp;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
}
