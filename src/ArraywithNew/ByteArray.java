package ArraywithNew;

class ByteArray
{
    public static void main(String[] args)
    {
        byte[] age = new byte[5];

        age[0] = 18;
        // age[1] = 20;
        // age[2] = 22;
        // age[3] = 24;
        age[4] = 26;

        // System.out.println(age[0]);
        // System.out.println(age[1]);
        // System.out.println(age[2]);
        // System.out.println(age[3]);
        // System.out.println(age[4]);
        for(int i=0;i<age.length;i++){
            System.out.println(age[i]);
        }
    }
}