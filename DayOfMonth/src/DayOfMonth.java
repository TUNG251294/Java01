import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        System.out.println("Enter month");
        Scanner scanner = new Scanner(System.in);
        byte month = scanner.nextByte();
        String result = "invalid arguments";
        if (month == 2) {
            result = "Tháng " +month+ " có 28 hoặc 29 ngày";
        }
        if (month == 4||month == 6||month ==9||month == 11){
            result = "Tháng " +month+ " có 30 ngày";
        }
        if (month == 1||month == 3||month == 5||month == 7||month == 8||month == 10||month == 12){
            result = "Tháng " +month+ " có 30 ngày";
        }
        System.out.println(result);
    }
}

