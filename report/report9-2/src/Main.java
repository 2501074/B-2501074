
public class Main {
    public static void main(String[] args) {

        int coin500 = 500;
        int coin100 = 100;
        int countPerMonth = 10;
        int monthsInYear = 12;
        int years = 30;

        int monthlySaving = (coin500 * countPerMonth) + (coin100 * countPerMonth);
        int totalSaving = monthlySaving * monthsInYear * years;

        System.out.println("30년 동안의 총 저금액은 " + totalSaving + "원입니다.");

    }
}