import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    static ArrayList<Double> results = new ArrayList<>();
    static double lastResult = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            printMenu();
            int choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter two numbers: ");
                    double a = input.nextDouble();
                    double b = input.nextDouble();
                    double result = add(a, b);
                    System.out.println("Result: " + result);
                    saveResult(result);
                }
                case 2 -> {
                    System.out.println("Enter two numbers: ");
                    double a = input.nextDouble();
                    double b = input.nextDouble();
                    double result = subtract(a, b);
                    System.out.println("Result: " + result);
                    saveResult(result);
                }
                case 3 -> {
                    System.out.println("Enter two numbers: ");
                    double a = input.nextDouble();
                    double b = input.nextDouble();
                    double result = multiply(a, b);
                    System.out.println("Result: " + result);
                    saveResult(result);
                }
                case 4 -> {
                    System.out.println("Enter two numbers: ");
                    double a = input.nextDouble();
                    double b = input.nextDouble();
                    double result = divide(a, b);
                    System.out.println("Result: " + result);
                    saveResult(result);
                }
                case 5 -> {
                    System.out.println("Enter two numbers: ");
                    double a = input.nextDouble();
                    double b = input.nextDouble();
                    double result = modulus(a, b);
                    System.out.println("Result: " + result);
                    saveResult(result);
                }
                case 6 -> {
                    System.out.println("Enter two numbers: ");
                    double a = input.nextDouble();
                    double b = input.nextDouble();
                    double result = min(a, b);
                    System.out.println("Result: " + result);
                    saveResult(result);
                }
                case 7 -> {
                    System.out.println("Enter two numbers: ");
                    double a = input.nextDouble();
                    double b = input.nextDouble();
                    double result = max(a, b);
                    System.out.println("Result: " + result);
                    saveResult(result);
                }
                case 8 -> {
                    System.out.println("Enter two numbers: ");
                    double a = input.nextDouble();
                    double b = input.nextDouble();
                    double result = average(a, b);
                    System.out.println("Result: " + result);
                    saveResult(result);
                }
                case 9 -> System.out.println("Last result: " + lastResult);
                case 10 -> printAllResults();
                case 0 -> {
                    continueCalculating = false;
                    System.out.println("Exiting calculator. Goodbye!");
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Enter 1 to addition the numbers");
        System.out.println("Enter 2 to subtraction the numbers");
        System.out.println("Enter 3 to multiplication the numbers");
        System.out.println("Enter 4 to division the numbers");
        System.out.println("Enter 5 to modulus the numbers");
        System.out.println("Enter 6 to find minimum number");
        System.out.println("Enter 7 to find maximum number");
        System.out.println("Enter 8 to find the average of numbers");
        System.out.println("Enter 9 to print the last result in calculator");
        System.out.println("Enter 10 to print the list of all results in calculator");
        System.out.println("Enter 0 to exit");
        System.out.print("Choose an option: ");
    }

    public static void saveResult(double result) {
        lastResult = result;
        results.add(result);
    }

    public static void printAllResults() {
        System.out.println("All results:");
        for (double result : results) {
            System.out.println(result);
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return 0;
        }
        return a / b;
    }

    public static double modulus(double a, double b) {
        return a % b;
    }

    public static double min(double a, double b) {
        return Math.min(a, b);
    }

    public static double max(double a, double b) {
        return Math.max(a, b);
    }

    public static double average(double a, double b) {
        return (a + b) / 2;
    }
}
