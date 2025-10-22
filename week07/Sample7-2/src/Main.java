import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("정수 입력 : ");
        num = input.nextInt();

        if (num < 6) {
            if (num < 12)
                System.out.println("끝");
        } else
            System.out.print("미안");


    }
}