package NestedIf;

import java.util.Scanner;

class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 18) {

            System.out.print("Are you a citizen? (Y/N): ");
            char citizen = sc.next().charAt(0);

            if (citizen == 'Y' || citizen == 'y') {
                System.out.println("Eligible to Vote");
            } else {
                System.out.println("Not Eligible");
            }

        } else {
            System.out.println("Age below 18");
        }
        sc.close();
    }
}