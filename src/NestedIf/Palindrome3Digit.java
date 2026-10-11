package NestedIf;

import java.util.Scanner;

class Palindrome3Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        if (num >= 100 && num <= 999) {

            int first = num / 100;
            int last = num % 10;

            if (first == last) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }

        } else {
            System.out.println("Not a 3-digit number");
        }
        sc.close();
    }
}