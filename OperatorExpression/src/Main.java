import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Width is ");
            float width = scanner.nextFloat();
            System.out.println("Height is ");
            float height = scanner.nextFloat();
            float area = width*height;
            System.out.println("Area of rectangle is " + area);
        }
}