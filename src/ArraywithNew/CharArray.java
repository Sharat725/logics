package ArraywithNew;

class CharArray
{
    public static void main(String[] args)
    {
        char[] grade = new char[5];

        grade[0] = 'A';
        //grade[1] = 'B';
        grade[2] = 'C';
        //grade[3] = 'A';
        grade[4] = 'B';

        // System.out.println(grade[0]);
        // System.out.println(grade[1]);
        // System.out.println(grade[2]);
        // System.out.println(grade[3]);
        // System.out.println(grade[4]);
        for(int i=0;i<grade.length;i++){
            System.out.println(grade[i]);
        }
    }
}