package ElseIfLadder;

import java.util.Scanner;

class PercentageResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter percentage: ");
        int per = sc.nextInt();

        if (per >= 85) {
            System.out.println("Distinction");
        } else if (per >= 60) {
            System.out.println("First Class");
        } else if (per >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        sc.close();
    }
}