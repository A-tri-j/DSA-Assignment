import java.util.Scanner;

// Student class
class Student {
    String name;
    int roll;
    int marks[] = new int[5];
    int total;
    double average;

    // Function to calculate total
    void calculateTotal() {
        total = 0;
        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }
    }

    // Function to calculate average
    void calculateAverage() {
        average = total / 5.0;
    }
}

// Main class
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student(); // correct object

        System.out.print("Enter name: ");
        s.name = sc.nextLine();

        System.out.print("Enter roll: ");
        s.roll = sc.nextInt();

        System.out.println("Enter marks of 5 subjects: ");
        for (int i = 0; i < 5; i++) {
            s.marks[i] = sc.nextInt();
        }

        s.calculateTotal();
        s.calculateAverage();

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + s.name);
        System.out.println("Roll: " + s.roll);
        System.out.println("Total Marks: " + s.total);
        System.out.println("Average: " + s.average);

        sc.close();
    }
}
