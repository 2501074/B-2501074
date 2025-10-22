import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hours;
        int salry;
        int extra;

        System.out.print("주당 근무 시간 입력 : ");
        hours = input.nextInt();

        if (hours <= 40){
            salry = 11500 * hours;
            extra = 0;
        } else{
            salry = 11500 * 40;
            extra = (int) (11500 * 1.5) * (hours - 40);
        }


        System.out.printf("%d시간의 아르바이트 급여는 초당은 %,d원과 급여 %,d를 합한 %,d원입니다.\n",hours,extra,salry,salry+extra);
    }
}