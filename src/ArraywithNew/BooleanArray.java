package ArraywithNew;

class BooleanArray
{
    public static void main(String[] args)
    {
        boolean[] result = new boolean[5];

        result[0] = true;
        // result[1] = false;
        // result[2] = true;
        // result[3] = true;
        result[4] = false;

        // System.out.println(result[0]);
        // System.out.println(result[1]);
        // System.out.println(result[2]);
        // System.out.println(result[3]);
        // System.out.println(result[4]);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}