package vowels;

class Vowel1 
{
	public static boolean isvowel(char ch)
	{
		return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A' ||ch=='E'||ch=='I'||ch=='O'||ch=='U');	
	}
		public static void main(String[] args)
	{
			String s="method";
			char[] ch=s.toCharArray();
			int i=0,j=ch.length-1;
			while(i<j)
		{
				if(! isvowel(ch[i]))
					i++;
		
		else if(isvowel(ch[j]))
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