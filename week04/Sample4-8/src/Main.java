import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sal, b;
        int total, tax;

        System.out.print("본봉 : ");
        sal = input.nextInt();
        System.out.print("보너스 : ");
        b = input.nextInt();

        total = sal + b;
        tax = (int) (total * (8.0f / 100));
        tax /= 100;
        tax *= 100;

        System.out.printf("본봉은 %,d 원\n",sal);
        System.out.printf("보너스는 %,d 원\n",b);
        System.out.printf("총 수입  = %,d원\n", total);
        System.out.printf("세금 = %,d 원\n",tax);
        System.out.printf("실 입금액 = %,d 원 \n",total - tax);
    }
}