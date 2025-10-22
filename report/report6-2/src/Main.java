import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double l;
        double lp;
        double result1;
        double dcp;
        double fp;
        double d = 0.07;
        double v = 0.1;

        System.out.print("주유할 리터 수 : ");
        l = input.nextDouble();
        System.out.print("리터당 가격 :");
        lp = input.nextDouble();

        result1 = l * lp;
        if (result1 >= 50000) {
        dcp = result1 * (1 - d);
        fp = dcp * (1 + v);
        System.out.printf("부가세 포함 금액 : %,.0f원\n",fp);
        } else {
            System.out.printf("금액 : %,.0f원",result1);
        }
    }
}