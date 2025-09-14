import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0;

        System.out.println("Enter marks of " + n + " subjects:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = (double) total / n;

        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);

        sc.close();
    }
}
