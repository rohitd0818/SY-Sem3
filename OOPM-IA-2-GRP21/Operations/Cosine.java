package Operations;

public class Cosine extends UnaryOperation {
    public double calculate(double num1, double num2) {
        return Math.cos(Math.toRadians(num1));
    }
}