package NestedIf;

import java.util.Scanner;

class MobileUnlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Is mobile unlocked? (Y/N): ");
        char unlock = sc.next().charAt(0);

        if (unlock == 'Y' || unlock == 'y') {

            System.out.print("Enter password: ");
            String password = sc.next();

            if (password.equals("admin")) {
                System.out.println("Access Granted");
            } else {
                System.out.println("Wrong Password");
            }

        } else {
            System.out.println("Unlock Mobile First");
        }
        sc.close();
    }
}