package NestedIf;

import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Do you have an account? (Y/N): ");
        char account = sc.next().charAt(0);

        if (account == 'Y' || account == 'y') {

            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            if (pin == 1234) {
                System.out.println("Withdrawal Allowed");
            } else {
                System.out.println("Invalid PIN");
            }

        } else {
            System.out.println("No Account Found");
        }
        sc.close();
    }
}