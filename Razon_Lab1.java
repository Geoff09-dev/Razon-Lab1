import java.util.Scanner;

public class Razon_Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Enter the number
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        
        // Upper part of the diamond
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("*");
        }
        
        // Lower part of the diamond
        for (int i = n - 1; i >= 1; i--) {
            System.out.print("*");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("*");
        }
        
        // End with a single star
        System.out.println("*");

        scanner.close();
    }
}
