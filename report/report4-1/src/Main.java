import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int e = 56000;
        int r = 0;
        System.out.print("몇 평? :");
        a = input.nextInt();

        r = a * e;
        r /= 10000;
        r *= 10000;

        System.out.printf("가격은? : %,d", r);
    }
}