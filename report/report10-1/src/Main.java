
import java.text.NumberFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 구분 코드별 단가 및 세율
        int[] rates = {500, 700, 850, 1000, 1200};
        double[] taxRates = {0.05, 0.035, 0.025, 0.015, 0.0};
        String[] types = {"가정용", "영업용", "공장용", "관공서", "군기관"};

        int basicFee = 1200;
        int dataCount = 10;

        // 결과 저장용 리스트
        List<String[]> results = new ArrayList<>();
        NumberFormat nf = NumberFormat.getInstance(); // 천 단위 콤마

        for (int i = 0; i < dataCount; i++) {
            System.out.println("\n[" + (i + 1) + "번째 데이터 입력]");
            System.out.print("번호(숫자 4자리): ");
            String custNo = sc.nextLine();

            System.out.print("이름: ");
            String name = sc.nextLine();

            System.out.print("수도구분코드(1~5): ");
            int code = Integer.parseInt(sc.nextLine());

            System.out.print("사용량(㎥, 소수점 1자리): ");
            double usage = Math.round(Double.parseDouble(sc.nextLine()) * 10) / 10.0; // 사사오입

            // 사용금액 계산
            double usageFee = usage * rates[code - 1];

            // 세금 계산 (절사)
            double tax = ((basicFee + usageFee) * taxRates[code - 1]);
            int taxCut = ((int) tax / 10) * 10; // 1의 자리 절사

            // 최종금액
            int total = basicFee + (int) usageFee + taxCut;

            results.add(new String[]{
                    custNo, name, types[code - 1],
                    String.format("%.1f", usage),
                    nf.format((int) usageFee),
                    nf.format(taxCut),
                    nf.format(total)
            });
        }

        // 출력
        System.out.println("        수       도       요       금");
        System.out.println("------------------------------------------------------------");
        System.out.println("번호    이름    구분    사용양    사용금액    TAX    납부액    비고");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < results.size(); i++) {
            String[] r = results.get(i);
            System.out.printf("%-6s %-6s %-6s %8s %10s %6s %10s %s\n",
                    r[0], r[1], r[2], r[3], r[4], r[5], r[6],
                    (i == results.size() - 1 ? "일괄정수" : ""));
        }

        System.out.println("------------------------------------------------------------");
        sc.close();
    }
}
