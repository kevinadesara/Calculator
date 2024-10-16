package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Start of Execution.");
        Scanner sc = new Scanner(System.in);
        int flg = 0;
        int ch;
        double num;
        System.out.println("----------Scientific Calculator----------\n");

        while (flg == 0) {
            try {
                System.out.println("Choices of Operations:");
                System.out.println("1. Square Root");
                System.out.println("2. Factorial");
                System.out.println("3. Natural Logarithm");
                System.out.println("4. Power");
                System.out.println("5. Exit");
                System.out.print("Enter your choice number(1-5): ");
                ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        System.out.println("You chose Square Root!");
                        System.out.print("Enter the operand: ");
                        num = sc.nextDouble();
                        System.out.println("Result is: " + SquareRoot(num) + "\n");
                        break;

                    case 2:
                        System.out.println("You chose Factorial!");
                        System.out.print("Enter the operand: ");
                        int numFact = sc.nextInt();
                        System.out.println("Result is: " + Factorial(numFact) + "\n");
                        break;

                    case 3:
                        System.out.println("You chose Natural Logarithm!");
                        System.out.print("Enter the operand: ");
                        num = sc.nextDouble();
                        System.out.println("Result is: " + NaturalLog(num) + "\n");
                        break;

                    case 4:
                        System.out.println("You chose Power!");
                        System.out.print("Enter the base: ");
                        double base = sc.nextDouble();
                        System.out.print("Enter the exponent: ");
                        double exponent = sc.nextDouble();
                        System.out.println("Result is: " + Power(base, exponent) + "\n");
                        break;

                    case 5:
                        System.out.println("Exiting... Goodbye!\n");
                        flg = 1;
                        break;

                    default:
                        System.out.println("Invalid choice! Please enter a number between 1 and 5.");
                        logger.warn("Invalid choice: " + ch);
                }

            } catch (InputMismatchException e) {
                logger.error("Invalid input! Please enter a valid number.");
                System.out.println("Invalid input! Please enter a valid number.");
                sc.next(); // Clear invalid input
            }
        }

        logger.info("End of Execution.");
    }

    // Functions:
    public static double SquareRoot(double x) {
        logger.info("START OP: Square Root");
        double res = Math.sqrt(x);
        logger.info("[SQUARE ROOT OPERATION] [SUCCESS] sqrt(" + x + ") = " + res);
        logger.info("END OP: Square Root");
        return res;
    }

    public static int Factorial(int x) {
        logger.info("START OP: Factorial");
        int res = 1;
        for (int i = 1; i <= x; i++) {
            res *= i;
        }
        logger.info("[FACTORIAL OPERATION] [SUCCESS] " + x + "! = " + res);
        logger.info("END OP: Factorial");
        return res;
    }

    public static double NaturalLog(double x) {
        logger.info("START OP: Natural Logarithm");
        if (x <= 0) {
            logger.error("Natural log is defined for positive real numbers only!");
            throw new IllegalArgumentException("Natural log is defined for positive real numbers only!");
        }
        double res = Math.log(x);
        logger.info("[NATURAL LOG OPERATION] [SUCCESS] ln(" + x + ") = " + res);
        logger.info("END OP: Natural Logarithm");
        return res;
    }

    public static double Power(double base, double exponent) {
        logger.info("START OP: Power");
        double res = Math.pow(base, exponent);
        logger.info("[POWER OPERATION] [SUCCESS] (" + base + ")^(" + exponent + ") = " + res);
        logger.info("END OP: Power");
        return res;
    }
}
