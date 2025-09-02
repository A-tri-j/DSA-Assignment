import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of expense entries: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of entries.");
            scanner.close();
            return;
        }

        double[] expenses = new double[n];  // runtime-sized array for decimals
        double total = 0.0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter expense #" + (i + 1) + ": ");
            expenses[i] = scanner.nextDouble();
            total += expenses[i];
        }

        System.out.println("\nTotal expenditure: " + total);

        scanner.close();
    }
}
