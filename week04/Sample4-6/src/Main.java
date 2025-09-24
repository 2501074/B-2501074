import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b;
        int h;
        float a;

        System.out.print("밑변 길이 : ");
        b = input.nextInt();
        System.out.print("높이 : ");
        h = input.nextInt();

        a = (b * h) / 2.0f;

        System.out.println(">>> 삼각형 면적 <<<");
        System.out.printf("\t밑변 : %,d Cm\n",b);
        System.out.printf("\t높이 : %,d Cm\n",h);
        System.out.printf("\t면적 : %.2f\u33A0",a);
    }
}