package Operations;
import java.util.*;
import Operations.*;
public class Main {
    private double num1;
    private double num2;
    private Operation operation;

    public Main() {
        num1 = 0.0;
        num2 = 0.0;
    }

    public void setInput(double num1, double num2, Operation operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public double calculate() {
        return operation.calculate(num1, num2);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------CALCULATOR----------");
        char ch = 'Y';

        while (ch == 'Y' || ch == 'y') {
            System.out.println("OPERATION: ");
            System.out.println("1.\t+ ");
            System.out.println("2.\t- ");
            System.out.println("3.\t* ");
            System.out.println("4.\t/ ");
            System.out.println("5.\t% ");
            System.out.println("6.\t^ ");
            System.out.println("7.\tln ");
            System.out.println("8.\tsin ");
            System.out.println("9.\tcos ");
            System.out.println("10.\ttan ");
            System.out.println("11.\tEXIT ");

            System.out.print("YOUR CHOICE?: ");
            int op = scanner.nextInt();
            if (op < 1 || op > 11) {
                System.out.println("INVALID INPUT! ");
                continue;
            }

            Main calculator = new Main();
            double result = 0.0;

            if (op >= 1 && op <= 6) {
                System.out.print("ENTER TWO NUMBERS: ");
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();
                calculator.setInput(num1, num2, getBinaryOperation(op));
                result = calculator.calculate();
            } else if (op > 6 && op <= 10) {
                System.out.print("ENTER A NUMBER: ");
                double num1 = scanner.nextDouble();
                calculator.setInput(num1, 0, getUnaryOperation(op));
                result = calculator.calculate();
            } else if (op == 11) {
                System.exit(0);
            } else {
                System.out.println("Invalid operation!");
                continue;
            }

            System.out.println("RESULT= " + result);
            System.out.print("DO YOU WISH TO CONTINUE? (Y/N): ");
            ch = scanner.next().charAt(0);
            System.out.println();
        }
    }

    private static Operation getBinaryOperation(int op) {
        switch (op) {
            case 1:
                return new Addition();
            case 2:
                return new Subtraction();
            case 3:
                return new Multiplication();
            case 4:
                return new Division();
            case 5:
                return new Modulus();
            case 6:
                return new Exponentiation();
            default:
                throw new IllegalArgumentException("Invalid binary operation choice.");
        }
    }

    private static Operation getUnaryOperation(int op) {
        switch (op) {
            case 7:
                return new Logarithm();
            case 8:
                return new Sine();
            case 9:
                return new Cosine();
            case 10:
                return new Tangent();
            default:
                throw new IllegalArgumentException("Invalid choice.");
        }
    }
}