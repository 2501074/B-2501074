import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        short age = 0;
        float height = 0.0f;
        float weight = 0.0f;

        System.out.printf("나이 : ");
        age = keyboard.nextShort();
        System.out.printf("몸무게 : ");
        weight = keyboard.nextFloat();
        System.out.printf("키 : ");
        height = keyboard.nextFloat();


        System.out.printf("당신의 나이는 %d입니다.\n",  age);
        System.out.printf("당신의 몸무게는 %.1fkg 입니다.\n", weight);
        System.out.printf("당신의 키는 %.1fcm 입니다.\n", height );

    }
}