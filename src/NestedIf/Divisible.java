package NestedIf;

import java.util.Scanner;

class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {

            if (num % 4 == 0) {
                System.out.println("Divisible by 2 and 4");
            } else {
                System.out.println("Divisible by 2 only");
            }

        } else {
            System.out.println("Not Divisible by 2");
        }
        sc.close();
    }
}