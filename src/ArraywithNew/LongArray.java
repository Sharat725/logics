package ArraywithNew;

class LongArray
{
    public static void main(String[] args)
    {
        long[] population = new long[5];

        population[0] = 1000000L;
        // population[1] = 2000000L;
        // population[2] = 3000000L;
        // population[3] = 4000000L;
        population[4] = 5000000L;

        // System.out.println(population[0]);
        // System.out.println(population[1]);
        // System.out.println(population[2]);
        // System.out.println(population[3]);
        // System.out.println(population[4]);
        for(int i=0;i<population.length;i++){
            System.out.println(population[i]);
        }
    }
}