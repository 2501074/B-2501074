import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;

        System.out.print("영문자 입력 : ");
        ch = input.next().charAt(0);


        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("변환 결과: " + (char)(ch + 32));
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("변환 결과: " + (char)(ch - 32));
        } else {
            System.out.println("영문자가 아닙니다.");
        }

    }
}