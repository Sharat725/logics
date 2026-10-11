package Swap2Num;

class WithTemp
{
	public static void main(String[] args) 
	{
		int a = 2, b = 3;
		System.out.println(a);
		System.out.println(b);
		int temp = a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}
}
