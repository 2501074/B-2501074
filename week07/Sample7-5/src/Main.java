
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        int result;

        System.out.print("세 개의 정수 입력: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            result = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            result = num2;
        } else {
            result = num3;
        }

        System.out.printf("입력한 정수 %d, %d, %d 중 가장 큰 수는 %d입니다.\n", num1, num2, num3, result);

        int temp = num1 >= num2 ? num1 : num2;
        System.out.printf("입력한 정수 %d와 %d 중 큰 수는 %d입니다.\n", num1, num2, temp);
    }
}