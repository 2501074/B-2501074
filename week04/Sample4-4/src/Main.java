import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int w = 0;
        float c;
        float d = 0.0f;

        System.out.print("오늘의 달러 환율은?");
        c = input.nextFloat();
        System.out.print("원화 얼마를 달러로 환전?");
        w = input.nextInt();

        d = (float) w / c;

        System.out.printf("원화 %,d원은 %,f 달러($) 입니다.\n",w,d);

    }
}