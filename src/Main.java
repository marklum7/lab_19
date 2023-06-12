import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculator calculator = Calculator.getInstance();
        System.out.println("2*x + 3/y: " + calculator.calculate(in.nextDouble(),in.nextDouble()));
    }
}
