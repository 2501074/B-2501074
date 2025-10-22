import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;

        System.out.print("첫번째 숫자를 입력하세요 :");
        a = input.nextInt();
        System.out.print("두번째 숫자를 입력하세요 :");
        b = input.nextInt();
        int c = a+b;
        System.out.printf("%d + %d = %d",a,b,c);

    }
}