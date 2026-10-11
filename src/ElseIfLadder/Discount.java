package ElseIfLadder;

import java.util.Scanner;

class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        if (amount >= 5000) {
            System.out.println("20% Discount");
        } else if (amount >= 3000) {
            System.out.println("15% Discount");
        } else if (amount >= 1000) {
            System.out.println("10% Discount");
        } else {
            System.out.println("No Discount");
        }
        sc.close();
    }
    
}