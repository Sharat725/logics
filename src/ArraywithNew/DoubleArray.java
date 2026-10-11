package ArraywithNew;

class DoubleArray
{
    public static void main(String[] args)
    {
        double[] salary = new double[5];

        salary[0] = 25000.50;
        // salary[1] = 30000.75;
        // salary[2] = 35000.25;
        // salary[3] = 40000.50;
        salary[4] = 45000.75;

        // System.out.println(salary[0]);
        // System.out.println(salary[1]);
        // System.out.println(salary[2]);
        // System.out.println(salary[3]);
        // System.out.println(salary[4]);
        for(int i=0;i<salary.length;i++){
            System.out.println(salary[i]);
        }
    }
}