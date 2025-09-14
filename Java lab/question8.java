import java.util.ArrayList;
import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> expenses = new ArrayList<>();

        System.out.print("Enter number of expenses: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " expenses:");
        for (int i = 0; i < n; i++) {
            double exp = sc.nextDouble();
            expenses.add(exp);
        }

        double total = 0;
        for (double exp : expenses) {
            total += exp;
        }

        System.out.println("Total Monthly Expenditure = " + total);

        sc.close();
    }
}
