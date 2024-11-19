import java.util.*;

public class PalArm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nPALINDROME AND ARMSTRONG NUMBER GENERATOR\n");
        System.out.println("1. Palindrome [From 0 to Given Number]");
        System.out.println("2. Armstrong Number [From 0 to Given Number]");
        System.out.print("\nEnter Your Choice: ");
        int choice = sc.nextInt();

        // Input validation for choice
        while (choice != 1 && choice != 2) {
            System.out.println("\nWrong choice, select 1 or 2 only!");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
        }

        // Input for the upper limit
        System.out.print("\nEnter a number: ");
        int original = sc.nextInt();

        // Ensure the number is non-negative
        while (original < 0) {
            System.out.println("\nNumber cannot be negative!");
            System.out.print("Enter a positive number: ");
            original = sc.nextInt();
        }

        // Palindrome logic
        if (choice == 1) {
            System.out.print("Palindrome Numbers: ");
            for (int i = 1; i <= original; i++) {
                int num = i;
                int reverse = 0;

                // Reverse the digits of the number
                while (num != 0) {
                    reverse = reverse * 10 + (num % 10);
                    num /= 10;
                }

                // Check if the number is a palindrome
                if (reverse == i) {
                    System.out.print(reverse + " ");
                }
            }
        }

        // Armstrong logic
        else if (choice == 2) {
            System.out.print("Armstrong Numbers: ");
            for (int i = 1; i <= original; i++) {
                int num = i;
                int arm = 0;
                int count = 0;

                // Count the number of digits
                while (num != 0) {
                    count++;
                    num /= 10;
                }

                num = i;

                // Calculate the Armstrong sum
                while (num != 0) {
                    int digit = num % 10;
                    arm += Math.pow(digit, count);
                    num /= 10;
                }

                // Check if the number is an Armstrong number
                if (arm == i) {
                    System.out.print(i + " ");
                }
            }
        }

        System.out.println("\n");
        sc.close(); // Close the scanner
    }
}
