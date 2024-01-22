package Operations;

public class Sine extends UnaryOperation {
    public double calculate(double num1, double num2) {
        return Math.sin(Math.toRadians(num1));
    }
}