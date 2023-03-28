import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import java.lang.Math;
import java.math.BigInteger;

// Added comment to push

public class ScientificCalculator {

    private static final Logger logger = LogManager.getLogger(ScientificCalculator.class);
    public static double sq_root(double num)
    {
        if(num < 0){
            logger.error("[ERROR - SQRT] - square root function is given -ve number");
            return -1;
        }

        double temp = Math.sqrt(num);
        logger.info("[SQRT] - " + num);
        logger.info("[RESULT - SQRT] - " + temp);
        return temp;
    }

    public static long factorial(int num)
    {
        if(num < 0){
            logger.error("[ERROR - SQRT] - square root function is given -ve number");
            return -1;
        }

        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        logger.info("[FACTORIAL] - " + num);
        logger.info("[RESULT - FACTORIAL] - " + fact);
        return fact;
    }

    public static double log(double num)
    {
        if(num < 0){
            logger.error("[ERROR - LOG] - natural log function does not work with -ve number");
            return -1;
        }
        double temp = Math.log(num);
        logger.info("[LOG] - " + num);
        logger.info("[RESULT - LOG] - " + temp);
        return temp;
    }

    public static double power(double base, double exponent)
    {
        double temp = Math.pow(base, exponent);
        logger.info("[POWER] - " + base + ", " + exponent);
        logger.info("[RESULT - POWER] - " + temp);
        return temp;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWelcome to the scientific calculator!");
            System.out.println("1. Square root function");
            System.out.println("2. Factorial function");
            System.out.println("3. Natural logarithm (base e)");
            System.out.println("4. Power function");
            System.out.println("0. Exit");

            System.out.print("\nEnter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    double num1 = input.nextDouble();
                    double sqrt = sq_root(num1);
                    System.out.printf("The square root of %.2f is %.2f\n", num1, sqrt);
                    break;

                case 2:
                    System.out.print("Enter a non-negative integer: ");
                    int num2 = input.nextInt();
                    long fact = factorial(num2);
                    System.out.printf("The factorial of %d is %d\n", num2, fact);
                    break;

                case 3:
                    System.out.print("Enter a positive number: ");
                    double num3 = input.nextDouble();
                    double ln = log(num3);
                    System.out.printf("The natural logarithm of %.2f is %.2f\n", num3, ln);
                    break;

                case 4:
                    System.out.print("Enter the base: ");
                    double base = input.nextDouble();
                    System.out.print("Enter the exponent: ");
                    double exponent = input.nextDouble();
                    double result = power(base, exponent);
                    System.out.printf("%.2f to the power of %.2f is %.2f\n", base, exponent, result);
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        input.close();
    }
}
