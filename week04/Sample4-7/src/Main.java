import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float h,w;  // Data
        float f,p;  // 정보
        final float FUNIT = 30.48f;
        final float PUNIT = 0.453592f;

        System.out.print("키(Cm) : ");
        h = input.nextFloat();
        System.out.print("몸무게(Kg) : ");
        w = input.nextFloat();

        f = h / FUNIT;
        p = w / PUNIT;
        System.out.printf("당신의 키는(%.2f Cm)는 %.3f 피트(feet) 입니다.\n",h,f);
        System.out.printf("당신의 몸무게(%.2f KG)는 %.3f 파운드(pound)입니다.\n",w,p);
    }
}