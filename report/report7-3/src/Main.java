
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("국어 점수를 입력하세요: ");
        int korean = keyboard.nextInt();

        System.out.print("영어 점수를 입력하세요: ");
        int english = keyboard.nextInt();

        System.out.print("수학 점수를 입력하세요: ");
        int math = keyboard.nextInt();

        double average = (korean + english + math) / 3.0;

        System.out.printf("평균 점수: %.2f\n", average);

        if (average >= 80) {
            System.out.println("성적 양호");
        } else if (average >= 60) {
            System.out.println("노력");
        } else {
            System.out.println("성적 불량");
        }
    }
}
