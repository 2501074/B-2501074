import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r,m;    //정보
        int sal,save, e; // Data
        float saveRate; //  저축 비율 (Data)


        System.out.print("급여액(원) : ");
        sal = input.nextInt();
        System.out.print("저축 비율 (예 20% -> 0.2) : ");
        saveRate = input.nextFloat();
        System.out.print("월 지출비용 :");
        e = input.nextInt();

        save = (int) (saveRate * sal);
        r = sal - (save + e);
        m = r / 30;

        System.out.println("[예산계산결과]");
        System.out.printf("월급: %,d원\n",sal);
        System.out.printf("저축액: %,d원\n",save);
        System.out.printf("지출액: %,d원\n",e);
        System.out.printf("남은금액: %,d원\n",r);
        System.out.printf("일일사용가능예산: %,d원\n",m);
    }
}
