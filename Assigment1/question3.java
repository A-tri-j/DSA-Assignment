import java.util.Scanner;
public class question3{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of courses this semester: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] courseNames = new String[n];
        int[] credits = new int[n];
        double[] marks = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of course " + (i + 1) + ": ");
            courseNames[i] = sc.nextLine();

            System.out.print("Enter credits for " + courseNames[i] + ": ");
            credits[i] = sc.nextInt();

            System.out.print("Enter marks obtained (out of 100) for " + courseNames[i] + ": ");
            marks[i] = sc.nextDouble();
            sc.nextLine(); // consume newline
        }

        double totalWeightedGP = 0.0;
        int totalCredits = 0;

        for (int i = 0; i < n; i++) {
            double gradePoint = marks[i] / 10.0;  // simple 0–10 scale
            totalWeightedGP += gradePoint * credits[i];
            totalCredits += credits[i];
        }

        if (totalCredits == 0) {
            System.out.println("Total credits cannot be zero.");
        } else {
            double cgpa = totalWeightedGP / totalCredits;
            System.out.printf("Your semester CGPA = %.2f\n", cgpa);
        }

        sc.close();
    }
}

