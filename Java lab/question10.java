import java.util.Scanner;

public class question10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example courses with credits (as per syllabus)
        String[] courses = {"DSA", "System and Signal", "Maths", "DBMS", "OS"};
        int[] credits = {4, 3, 4, 3, 3};   // example credits for each subject
        int n = courses.length;

        int[] marks = new int[n];
        double[] gradePoints = new double[n];

        int totalCredits = 0;
        double weightedSum = 0.0;

        System.out.println("Enter marks for each subject (out of 100):");
        for (int i = 0; i < n; i++) {
            System.out.print(courses[i] + " (Credit " + credits[i] + "): ");
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

    // Marks → Grade Point Conversion (10-point scale)
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
