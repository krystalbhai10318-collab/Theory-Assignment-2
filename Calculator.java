import java.util.Scanner;

public class CalculatorApp {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return (double) a / b;
    }

    public void mainMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nWelcome to the Calculator Application!");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    int a1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b1 = sc.nextInt();
                    System.out.println("Result: " + add(a1, b1));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    int a2 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b2 = sc.nextInt();
                    System.out.println("Result: " + subtract(a2, b2));
                    break;
                case 3:
                    System.out.print("Enter first number (double): ");
                    double a3 = sc.nextDouble();
                    System.out.print("Enter second number (double): ");
                    double b3 = sc.nextDouble();
                    System.out.println("Result: " + multiply(a3, b3));
                    break;
                case 4:
                    System.out.print("Enter numerator: ");
                    int a4 = sc.nextInt();
                    System.out.print("Enter denominator: ");
                    int b4 = sc.nextInt();
                    try {
                        System.out.println("Result: " + divide(a4, b4));
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }

    public static void main(String[] args) {
        CalculatorApp app = new CalculatorApp();
        app.mainMenu();
    }
}
