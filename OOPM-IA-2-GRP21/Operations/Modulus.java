package Operations;

public class Modulus extends BinaryOperation {
    public double calculate(double num1, double num2) {
        if (num2 == 0.0) {
            throw new ArithmeticException("Remainder by zero is not allowed.");
        }
        return num1 % num2;
    }
}