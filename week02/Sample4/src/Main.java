import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int first = 0;
        int second = 0;
        int result = 0;
        System.out.print("첫번째 값 입력 :");
        first = keyboard.nextInt();
        System.out.print("두번째 값 입력 :");
        second = keyboard.nextInt();

        result = first * second;

        System.out.printf("%d * %d = %d\n", first, second, result);
    }
}