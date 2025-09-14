import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of courses: ");
        int n = sc.nextInt();

        int[] credits = new int[n];
        int[] marks = new int[n];
        double[] gradePoints = new double[n];

        int totalCredits = 0;
        double weightedSum = 0.0;

        // Input course credits and marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nCourse " + (i + 1) + ":");
            System.out.print("Enter course credit: ");
            credits[i] = sc.nextInt();
            System.out.print("Enter marks obtained: ");
            marks[i] = sc.nextInt();

            gradePoints[i] = getGradePoint(marks[i]);
            totalCredits += credits[i];
            weightedSum += gradePoints[i] * credits[i];
        }

        double cgpa = weightedSum / totalCredits;

        System.out.println("\nTotal Credits = " + totalCredits);
        System.out.println("CGPA = " + cgpa);

        sc.close();
    }

    // Function to convert marks -> grade point (example scale)
    public static double getGradePoint(int marks) {
        if (marks >= 90) return 10;
        else if (marks >= 80) return 9;
        else if (marks >= 70) return 8;
        else if (marks >= 60) return 7;
        else if (marks >= 50) return 6;
        else if (marks >= 40) return 5;
        else return 0;
    }
}
