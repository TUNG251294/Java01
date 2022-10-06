import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");
        int Year = scanner.nextInt();
        String result = Year + " is leap year";
        if (Year%4 == 0){
            if (Year%100 == 0 && Year%400 != 0){
                result = Year + " is not leap year";
            }
        } else {
            result = Year + " is not leap year";
        }
        System.out.println(result);
    }
}