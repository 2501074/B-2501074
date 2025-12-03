//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        for (int chicken = 0; chicken <= 37; chicken++) {
            int dog = 37 - chicken;
            int legs = chicken * 2 + dog * 4;
            if (legs == 102) {
                System.out.println("닭: " + chicken + "마리, 개: " + dog + "마리");
                break;
            }
        }
/*

        while (chicken <= 37) {
            int dog = 37 - chicken;
            int legs = chicken * 2 + dog * 4;
            if (legs == 102) {
                System.out.println("닭: " + chicken + "마리, 개: " + dog + "마리");
                break;
            }
            chicken++;
        }


        do {
            int dog = 37 - chicken;
            int legs = chicken * 2 + dog * 4;
            if (legs == 102) {
                System.out.println("닭: " + chicken + "마리, 개: " + dog + "마리");
                break;
            }
            chicken++;
        } while (chicken <= 37);
*/
    }
}