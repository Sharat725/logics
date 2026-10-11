package ArraywithNew;

class ShortArray
{
    public static void main(String[] args)
    {
        short[] marks = new short[5];

        marks[0] = 450;
        // marks[1] = 480;
        // marks[2] = 420;
        // marks[3] = 460;
        marks[4] = 490;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}