
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        int a = keyboard.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int b = keyboard.nextInt();
        System.out.print("세 번째 정수를 입력하세요: ");
        int c = keyboard.nextInt();

        int max = 0, mid = 0, min = 0;
        int caseNum = 0;

        if (a >= b && a >= c) {
            caseNum = (b >= c) ? 1 : 2;
        } else if (b >= a && b >= c) {
            caseNum = (a >= c) ? 3 : 4;
        } else {
            caseNum = (a >= b) ? 5 : 6;
        }

        switch (caseNum) {
            case 1:
                max = a; mid = b; min = c;
                break;
            case 2:
                max = a; mid = c; min = b;
                break;
            case 3:
                max = b; mid = a; min = c;
                break;
            case 4:
                max = b; mid = c; min = a;
                break;
            case 5:
                max = c; mid = a; min = b;
                break;
            case 6:
                max = c; mid = b; min = a;
                break;
        }

        System.out.println("가장 큰 수 (max): " + max);
        System.out.println("중간 수 (mid): " + mid);
        System.out.println("가장 작은 수 (min): " + min);
    }
}
