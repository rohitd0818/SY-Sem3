package Operations;

public class Tangent extends UnaryOperation {
    public double calculate(double num1, double num2) {
        if (Math.abs(num1 % 180) == 90.0) {
            throw new IllegalArgumentException("Undefined for multiples of 90 degrees.");
        }
        return Math.tan(Math.toRadians(num1));
    }
}