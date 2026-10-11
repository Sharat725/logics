package reversstr;

class ReverseWordOrder
{
    public static void main(String[] args)
    {
        String s = "Java Is Easy";

        String[] ch = s.split(" ");

        for(int i = ch.length - 1; i >= 0; i--)
        {
            System.out.print(ch[i] + " ");
        }
    }
}

