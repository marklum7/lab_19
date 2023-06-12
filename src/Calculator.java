public class Calculator {
    private static Calculator instance;
    private Calculator() {
    }
    public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }
    public double calculate(double x, double y) {
        return 2 * x + 3 / y;
    }
}