package vowels;

class Alphabets2
{
	public static boolean isAlphabets(char ch)
	{
		return ch>='A' && ch<='Z';
	}
		public static void main(String[] args)
	{
			String s="mEThoD";
			char[] ch=s.toCharArray();
			int i=0,j=ch.length-1;
			while(i<j)
		{
				if(isAlphabets(ch[i]))
					i++;
		
		else if(isAlphabets(ch[j]))
			j--;

		else{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;j--;
			}
		}
		System.out.println(new String(ch));
	}
}