import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int f = 4800;
        int a;
        double d = 0.0;   //할인율
        double dd;  //할인 적용 금액
        double t;  //가격

        System.out.print("구매한 식권 개수 : ");
        a = input.nextInt();

        if (a >= 30) {
            d =0.20;
        }   else if (a >= 20) {
            d =0.15;
        }   else if (a >= 10) {
            d =0.10;
        }

        t = a * f;

        dd = t * (1 - d);

        System.out.printf("총 금액 %,.0f 원\n",t);
        System.out.println("할인율 : " + (d * 100) + "%");
        System.out.printf("할인 적용 금액 : %,.0f",dd);
    }
}