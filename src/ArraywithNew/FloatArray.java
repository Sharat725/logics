package ArraywithNew;

class FloatArray
{
    public static void main(String[] args)
    {
        float[] price = new float[5];

        price[0] = 1.5f;
        // price[1] = 2.5f;
        // price[2] = 3.5f;
        // price[3] = 4.5f;
        price[4] = 5.5f;

        // System.out.println(price[0]);
        // System.out.println(price[1]);
        // System.out.println(price[2]);
        // System.out.println(price[3]);
        // System.out.println(price[4]);
        for(int i=0;i<price.length;i++){
            System.out.println(price[i]);
        }
    }
}