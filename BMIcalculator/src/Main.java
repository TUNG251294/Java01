import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, BMI;
        System.out.println("Enter weight");
        weight = scanner.nextFloat();
        System.out.println("Enter height");
        height = scanner.nextFloat();
        BMI = weight/Math.pow(height,2);
        String result;
        if (BMI < 18.5){
            result = "UnderWeight";
        } else if (BMI < 25.0){
            result = "Normal";
        } else if (BMI < 30.0) {
            result = "Overweight";
        } else {
            result ="Obese";
        }
        System.out.println(result);
    }
}