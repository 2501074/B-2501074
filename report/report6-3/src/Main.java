import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        char card;
        int time;
        int m = 0;
        System.out.print("나이 : ");
        age = input.nextInt();
        System.out.print("교통카드 사용 여부(Y/N) : ");
        card = input.next().charAt(0);
        System.out.print("탑승 시간(0~23시) : ");
        time = input.nextInt();

        if(age >= 19) {
            m = 1350;
        } else if (age >= 13){
            m = 850;
        } else {
            m = 450;
        }
        if((age >= 13) && card == 'Y'){
            m -= 100;
        }
        double fm = m;
        if (time >= 22 || time < 5){
            fm *= 1.2;
            System.out.println("심야 시간 추가 요금 적용.");
        }
        System.out.printf("최종 요금 : %,.0f원",fm);
    }
}