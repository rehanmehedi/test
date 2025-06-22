import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            while (running) {
                System.out.println("\nScientific Calculator");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. Sine (degrees)");
                System.out.println("6. Cosine (degrees)");
                System.out.println("7. Tangent (degrees)");
                System.out.println("8. Logarithm (natural)");
                System.out.println("9. Power");
                System.out.println("10. Square root");
                System.out.println("0. Exit");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();
                double result;

                switch (choice) {
                    case 1:
                        System.out.print("Enter first number: ");
                        double add1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        double add2 = scanner.nextDouble();
                        result = add1 + add2;
                        System.out.println("Result: " + result);
                        break;
                    case 2:
                        System.out.print("Enter first number: ");
                        double sub1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        double sub2 = scanner.nextDouble();
                        result = sub1 - sub2;
                        System.out.println("Result: " + result);
                        break;
                    case 3:
                        System.out.print("Enter first number: ");
                        double mul1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        double mul2 = scanner.nextDouble();
                        result = mul1 * mul2;
                        System.out.println("Result: " + result);
                        break;
                    case 4:
                        System.out.print("Enter dividend: ");
                        double dividend = scanner.nextDouble();
                        System.out.print("Enter divisor: ");
                        double divisor = scanner.nextDouble();
                        if (divisor == 0) {
                            System.out.println("Error: Division by zero");
                        } else {
                            result = dividend / divisor;
                            System.out.println("Result: " + result);
                        }
                        break;
                    case 5:
                        System.out.print("Enter angle in degrees: ");
                        double angleSin = scanner.nextDouble();
                        result = Math.sin(Math.toRadians(angleSin));
                        System.out.println("Result: " + result);
                        break;
                    case 6:
                        System.out.print("Enter angle in degrees: ");
                        double angleCos = scanner.nextDouble();
                        result = Math.cos(Math.toRadians(angleCos));
                        System.out.println("Result: " + result);
                        break;
                    case 7:
                        System.out.print("Enter angle in degrees: ");
                        double angleTan = scanner.nextDouble();
                        result = Math.tan(Math.toRadians(angleTan));
                        System.out.println("Result: " + result);
                        break;
                    case 8:
                        System.out.print("Enter positive number: ");
                        double value = scanner.nextDouble();
                        if (value <= 0) {
                            System.out.println("Error: Log undefined for non-positive numbers");
                        } else {
                            result = Math.log(value);
                            System.out.println("Result: " + result);
                        }
                        break;
                    case 9:
                        System.out.print("Enter base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Enter exponent: ");
                        double exponent = scanner.nextDouble();
                        result = Math.pow(base, exponent);
                        System.out.println("Result: " + result);
                        break;
                    case 10:
                        System.out.print("Enter number: ");
                        double sqrtValue = scanner.nextDouble();
                        if (sqrtValue < 0) {
                            System.out.println("Error: Square root of negative number");
                        } else {
                            result = Math.sqrt(sqrtValue);
                            System.out.println("Result: " + result);
                        }
                        break;
                    case 0:
                        running = false;
                        System.out.println("Exiting calculator.");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }
}
