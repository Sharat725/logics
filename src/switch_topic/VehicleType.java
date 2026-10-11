package switch_topic;

import java.util.Scanner;

class VehicleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of wheels: ");
        int wheels = sc.nextInt();

        switch (wheels) {
            case 2:
                System.out.println("Two Wheeler");
                break;
            case 3:
                System.out.println("Three Wheeler");
                break;
            case 4:
                System.out.println("Four Wheeler");
                break;
            default:
                System.out.println("Other Vehicle");
        }
        sc.close();
    }
}