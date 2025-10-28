//2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("현재 온도를 입력하세요 (정수): ");
        int temp = keyboard.nextInt();

        if (temp >= 35) {
            System.out.println("폭염 경보");
        } else if (temp >= 30) {
            System.out.println("폭염 주의보");
        } else if (temp >= -10) {
            System.out.println("정상 온도");
        } else {
            System.out.println("한파 경보");
        }
    }
}
