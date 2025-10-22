import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        float result;

        System.out.print("분자 입력 : ");
        num1 = input.nextInt();
        System.out.print("분모 입력 : ");
        num2 = input.nextInt();

       result = (num2 == 0) ? 0.0f :(float)num1/num2;
       String temp = (result == 0.0f) ? "분모가 0으로 나누셈을 할 수 없음" : String.format("%d / %d = %.2f\n",num1, num2,result);
       System.out.println(temp);
        /* if (num2 == 0) {
            System.err.println("분모가 0으로 나누셈을 할 수 없음");
        } else {
            result = (float)num1/num2;
            System.out.println("%d / %d = %.2f\n",num1, num2,result);
        } */

    }
}