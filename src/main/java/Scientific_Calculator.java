import java.util.Scanner;

public class Scientific_Calculator {

    // Method for Square Root
    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    // Method for Factorial
    public static long factorial(int x) {
        if (x < 0) throw new IllegalArgumentException("Factorial is undefined for negative numbers.");
        long fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method for Natural Logarithm
    public static double naturalLog(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Logarithm is undefined for zero or negative numbers.");
        }
        return Math.log(x);
    }

    // Method for Power Function
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nScientific Calculator");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power Function (xʸ)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    double sqrtInput = scanner.nextDouble();
                    System.out.println("√" + sqrtInput + " = " + squareRoot(sqrtInput));
                    break;

                case 2:
                    System.out.print("Enter an integer: ");
                    int factInput = scanner.nextInt();
                    System.out.println(factInput + "! = " + factorial(factInput));
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    double logInput = scanner.nextDouble();
                    try {
                        System.out.println("ln(" + logInput + ") = " + naturalLog(logInput));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println(base + "^" + exponent + " = " + power(base, exponent));
                    break;

                case 5:
                    System.out.println("Exiting Calculator. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
