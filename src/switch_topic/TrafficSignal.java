package switch_topic;

import java.util.Scanner;

class TrafficSignal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter signal (R/Y/G): ");
        char signal = sc.next().charAt(0);

        switch (signal) {
            case 'R':
            case 'r':
                System.out.println("Stop");
                break;
            case 'Y':
            case 'y':
                System.out.println("Ready");
                break;
            case 'G':
            case 'g':
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid Signal");
        }
        sc.close();
    }
}