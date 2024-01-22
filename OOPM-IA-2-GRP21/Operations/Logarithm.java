package Operations;

public class Logarithm extends UnaryOperation {
    public double calculate(double num1, double num2) {
        if (num1 <= 0.0) {
            throw new ArithmeticException("Number is negative so ln cannot be calculated.");
        }
        return Math.log(num1);
    }
}