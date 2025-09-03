package assignment1;   // 🔹 must match folder name exactly (lowercase)

import java.util.Scanner;

class Student {
    String name;
    int roll;
    int[] marks = new int[5];
    int total;
    double average;

    // Method to calculate total
    int calculateTotal() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        total = sum;
        return total;
    }

    // Method to calculate average
    double calculateAverage() {
        average = (double) total / marks.length;
        return average;
    }
}

public class Question4 {   // 🔹 Must match file name "Question4.java"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter student name: ");
        s.name = sc.nextLine();

        System.out.print("Enter roll number: ");
        s.roll = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.println("Enter marks of 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            s.marks[i] = sc.nextInt();
        }

        // Call methods
        s.calculateTotal();
        s.calculateAverage();

        // Output
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + s.name);
        System.out.println("Roll: " + s.roll);
        System.out.println("Total Marks: " + s.total);
        System.out.printf("Average Marks: %.2f\n", s.average);

        sc.close();
    }
}
