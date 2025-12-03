import java.io.IOException;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        String[][] customers = new String[][] {{"1111","최장빈","1",""},{"2222","문예영","2",""},{"3333","문예영","3",""},{"4444","문예영","4",""},{"5555","문예영","5",""},{"6666","문예영","4",""},{"7777","문예영","1",""},{"8888","문예영","3",""},{"9999","문예영","5",""},{"1010","문예영","2",""}};
        // {{번호,이름,숫자,?}}

        int[][] money = new int[customers.length][3];   //{사용금액,세금,징수금액}}

        float[] used = Input.readData(customers);

        for (int i = 0; i < money.length; i++) {
            Compute.pay(money[i],customers[i],used[i]); //사용 금액 계산
        }

        Compute.tax(customers,money); //2차원

        for (int i = 0; i < money.length; i++) {
           Compute.total(money[i]);
        }

       Output.display(customers, money, used);
    }
}