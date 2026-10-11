package NestedIf;

import java.util.Scanner;

class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        int salary = sc.nextInt();

        if (salary > 50000) {

            System.out.print("Enter experience: ");
            int exp = sc.nextInt();

            if (exp >= 5) {
                System.out.println("Eligible");
            } else {
                System.out.println("Experience Less Than 5 Years");
            }

        } else {
            System.out.println("Salary Less Than 50000");
        }
        sc.close();
    }
}