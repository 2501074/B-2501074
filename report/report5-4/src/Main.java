import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("총 구매 금액을 입력하세요 (원): ");
        int data = scanner.nextInt();

        System.out.print("멤버십 회원인가요? (true 또는 false): ");
        boolean infomation = scanner.nextBoolean();

        boolean freeShipping = (data >= 50000) || (infomation && data >= 30000);

        if (freeShipping) {
            System.out.println("무료배송이 적용됩니다.");
        } else {
            System.out.println("무료배송 조건을 만족하지 않습니다.");
        }
    }
}
