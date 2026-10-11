package reversstr;

class ReverseEachWord
{
    static String rev(String s)
    {
        char[] ch = s.toCharArray();

        int i = 0;
        int j = ch.length - 1;

        while(i < j)
        {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i++;
            j--;
        }

        return new String(ch);
    }

    public static void main(String[] args)
    {
        String s = "Java Is Easy";

        String[] st = s.split(" ");

        for(int i = 0; i < st.length; i++)
        {
            System.out.print(rev(st[i]) + " ");
        }
    }
}
