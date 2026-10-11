package reversstr;

class RemoveFirstWord
{
    static String rev(String st)
    {
        char[] ch = st.toCharArray();

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

        String[] x = s.split(" ");
        System.out.print(rev(x[0])+" ");

        for(int i = 1; i < x.length; i++)
        {
            System.out.print(x[i] + " ");
        }
    }
}
