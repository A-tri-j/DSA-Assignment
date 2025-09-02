import java.util.Scanner;
public class Assigment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of marks: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of marks.");
            scanner.close();
            return;
        }

        int[] marks = new int[n]; 
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter mark #" + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            sum += marks[i];
        }

        double average = (double) sum / n;  
        System.out.println("\nAverage marks: " + average);

        scanner.close();
    }
}
