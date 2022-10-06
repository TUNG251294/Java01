import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a is ");
        float a = scanner.nextFloat();
        System.out.println("b is ");
        float b = scanner.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        } else {
            System.out.println("Equation pass with x = " + -b/a);
        }
    }
}

