//3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int BASE_PRICE = 10000;
        double discountRate = 0.0;

        System.out.print("관람 시간 입력 (조조 / 일반): ");
        String time = keyboard.nextLine().trim();
        System.out.print("연령을 입력하세요: ");
        int age = keyboard.nextInt();

        if (time.equalsIgnoreCase("조조")) {
            discountRate += 0.20;
            if (age >= 8 && age <= 18) {
                discountRate += 0.30;
            } else if (age >= 65) {
                discountRate += 0.40;
            }
        } else {
            if (age >= 8 && age <= 18) {
                discountRate += 0.30;
            } else if (age >= 65) {
                discountRate += 0.40;
            }
        }


        int finalPrice = (int)(BASE_PRICE * (1 - discountRate));


        System.out.println("최종 영화 관람 요금: " + finalPrice + "원");
    }
}
