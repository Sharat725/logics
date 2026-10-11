package Swap3Num;

class WithXor
{
	public static void main(String[] args) 
	{
		int a = 2, b = 3,c=4;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		a=a^b^c;
		b=a^b^c;
		c=a^b^c;
		a=a^b^c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
