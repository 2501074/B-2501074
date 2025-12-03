
import java.util.Scanner;

public class Main {

    static int max(int a, int b) {
        return (a >= b) ? a : b;
    }


    static int max4(int a, int b, int c, int d) {

        int m = max(a, b);
        m = max(m, c);
        m = max(m, d);
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2개 숫자 비교
        System.out.print("두 정수를 입력하세요 (예: 10 20): ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int bigger2 = max(x, y);
        System.out.println("두 수 중 큰 값: " + bigger2);

        // 4개 숫자 비교
        System.out.print("네 정수를 입력하세요 (예: 7 3 15 9): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int bigger4 = max4(a, b, c, d);
        System.out.println("네 수 중 가장 큰 값: " + bigger4);

        sc.close();
    }
}
