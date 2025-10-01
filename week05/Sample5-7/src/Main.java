import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char type = ' ';
        int width = 0;
        int height = 0;
        int area = 0;

        System.out.print("사각형의 가로 길이 입력 : ");
        width = input.nextInt();
        System.out.print("사각형의 세로 길이 입력 : ");
        height = input.nextInt();

        type = width == height ? '정' : '직';
        area = width * height;

        System.out.printf("**** %c 사각형 넓이 ******\n",type);
        System.out.printf("\t 가로길이 : %,d cm\n", width);
        System.out.printf("\t 세로 길이 : %,d Cm\n",height);
        System.out.printf("\t 넓    이 : %,d \u33a0\n",area);
    }
}