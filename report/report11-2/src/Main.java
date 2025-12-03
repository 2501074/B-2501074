
import java.util.Scanner;

public class Main {


    static boolean isLeapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    static int leapYearAsInt(boolean isLeap) {
        return isLeap ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학번을 입력하세요: ");
        long studentId = sc.nextLong();

        System.out.print("판별할 연도를 입력하세요: ");
        int year = sc.nextInt();

        boolean leap = isLeapYear(year);


        if (studentId % 2 == 0) {
            System.out.println("leapYear = " + leap);
        } else {
            System.out.println("leapYear = " + leapYearAsInt(leap));
        }

        System.out.println(year + "년은 " + (leap ? "윤년" : "평년") + "입니다.");

        sc.close();
    }
}
