import java.util.Scanner;

class Calculator {
    // Function to add two numbers
    int add(int a, int b) {
        return a + b;
    }
}

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = c.add(num1, num2);

        System.out.println("Sum = " + sum);
        sc.close();
    }
}
