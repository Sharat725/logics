package ElseIfLadder;

import java.util.Scanner;

class SalaryBand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        int salary = sc.nextInt();

        if (salary >= 80000) {
            System.out.println("Senior Level");
        } else if (salary >= 50000) {
            System.out.println("Mid Level");
        } else if (salary >= 25000) {
            System.out.println("Junior Level");
        } else {
            System.out.println("Entry Level");
        }
        sc.close();
    }
}