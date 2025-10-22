import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double C = 0.0f;

        System.out.print("섭씨 온도 (℃) : ");
        C = input.nextDouble();
        double F = (C * 9 / 5) +32;

        System.out.printf("화씨 온도는? : %.2f", F);

    }
}