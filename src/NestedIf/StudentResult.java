package NestedIf;

import java.util.Scanner;

class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 35) {
            System.out.println("Pass");

            if (marks > 85) {
                System.out.println("Distinction");
            }
        } else {
            System.out.println("Fail");
        }
        sc.close();
    }
}