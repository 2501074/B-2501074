
import java.util.Scanner;

public class Main {


    static final String[] NUM = {"", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
    static final String[] UNIT = {"", "십", "백", "천"};
    static final String[] BIG_UNIT = {"", "만", "억", "조"};


    static String convertHangul(long money) {
        if (money == 0) return "영";

        String str = String.valueOf(money);
        StringBuilder result = new StringBuilder();

        int len = str.length();
        int bigUnitIndex = 0;


        while (len > 0) {
            int start = Math.max(len - 4, 0);
            String part = str.substring(start, len);
            StringBuilder temp = new StringBuilder();


            for (int i = 0; i < part.length(); i++) {
                int digit = part.charAt(i) - '0';
                if (digit != 0) {
                    temp.append(NUM[digit]).append(UNIT[part.length() - i - 1]);
                }
            }


            if (temp.length() > 0) {
                temp.append(BIG_UNIT[bigUnitIndex]);
            }

            result.insert(0, temp);
            bigUnitIndex++;
            len -= 4;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하세요 (최대 6자리): ");
        long money = sc.nextLong();

        String hangul = convertHangul(money);
        System.out.println("한글 금액: " + hangul);

        sc.close();
    }
}
