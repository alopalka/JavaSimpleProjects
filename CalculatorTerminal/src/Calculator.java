public class Calculator {

    private double cachedNumber = 0;

    public double add(double a, double b) {
        cachedNumber = a + b;
        return cachedNumber;
    }

    public double subtract(double a, double b) {
        cachedNumber = a - b;
        return cachedNumber;
    }

    public double multiply(double a, double b) {
        cachedNumber = a * b;
        return cachedNumber;
    }

    public double division(double a, double b) {
        cachedNumber = a / b;
        return cachedNumber;
    }

    public double modulo(double a, double b) {
        cachedNumber = a % b;
        return cachedNumber;
    }

    public double exponentiation(double x, double n) {
        double result = x;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        cachedNumber = result;
        return result;
    }

    public double squareRoot(double x) {
        return Math.sqrt(x);
    }

    public double getCachedNumber() {
        return cachedNumber;
    }

    public void setCachedNumber(double cachedNumber) {
        this.cachedNumber = cachedNumber;
    }



}
