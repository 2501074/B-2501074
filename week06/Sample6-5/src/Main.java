import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MPS = 340;
        float fighter;
        int result;
        float temp;

        System.out.print("전투기 스피드 :");
        fighter = input.nextFloat();

        temp = fighter * 365 * 24 * 60 * 60 * MPS;
        result = (int) (temp/1000);

        System.out.printf("마하 %.1f인 전투기의 1년간 간 거리는 %,d Km입니다.\n",fighter, result);

    }
}