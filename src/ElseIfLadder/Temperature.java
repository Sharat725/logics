package ElseIfLadder;

import java.util.Scanner;

class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();

        if (temp >= 40) {
            System.out.println("Very Hot");
        } else if (temp >= 30) {
            System.out.println("Hot");
        } else if (temp >= 20) {
            System.out.println("Warm");
        } else if (temp >= 10) {
            System.out.println("Cold");
        } else {
            System.out.println("Very Cold");
        }
        sc.close();
    }
}