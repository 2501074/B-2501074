import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = 0;


        System.out.printf("원의 반지름:");
        radius = input.nextDouble();
        double ciArea = Math.PI * radius * radius;
        double sqArea = 4 * radius * radius;

        System.out.printf("원의 면적은 %.2f입니다.\n", ciArea);
        System.out.printf("정사각형의 면적은 %.2f입니다.\n", sqArea);
        System.out.printf("구하는 면적 : %2f Cm2",radius);
    }
}