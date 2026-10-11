package ArraywithNew;

class IntArray
{
    public static void main(String[] args)
    {
        int[] cost = new int[5];

        cost[0] = 50000;
        // cost[1] = 60000;
        // cost[2] = 70000;
        // cost[3] = 80000;
        cost[4] = 90000;

        // System.out.println(cost[0]);
        // System.out.println(cost[1]);
        // System.out.println(cost[2]);
        // System.out.println(cost[3]);
        // System.out.println(cost[4]);
        for(int i=0;i<cost.length;i++){
            System.out.println(cost[i]);
        }
    }
}