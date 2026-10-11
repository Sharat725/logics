package logic;

class NestedIf
{
    public static void main(String[] args)
    {
        int theory = 39;
        int practical = 35;

        if(theory >= 35)
        {
            if(practical >= 30)
            {
                int total = theory + practical;
                System.out.println(total);
                System.out.println("Pass");
            }
            else
            {
                System.out.println(" Practical Failed");
            }
        }
        else
        {
            System.out.println(" Theory Failed");
        }
    }
}