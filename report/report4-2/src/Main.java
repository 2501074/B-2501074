import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;

        System.out.print("판매금액 :");
        a = input.nextInt();

        b = (int) (a * (10.0f / 100));
        c = (int) (a * (90.0f / 100));
        System.out.printf("판매금액 :%,d\n",a);
        System.out.printf("금액 : %,d\n",c);
        System.out.printf("세금 : %,d\n",b);
    }
}