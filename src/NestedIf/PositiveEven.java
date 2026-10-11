package NestedIf;

import java.util.Scanner;

class PositiveEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("Positive and Even");
            } else {
                System.out.println("Positive but Odd");
            }
        } else {
            System.out.println("Not a Positive Number");
        }
        sc.close();
    }
}