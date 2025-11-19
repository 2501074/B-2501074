import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String[][] employees = {{"홍길동", "1111"},{"강민성", "1211"},{"김명성", "2111"},{"박건준", "1441"},{"오유빈", "1444"},{"니카타", "1456"},{"한정호", "1678"},{"파마트", "1567"},{"이예린", "1738"},{"제이넵", "1789"}};
        int[] hb = {1,4,5,3,2,1,3,4,3,2};
        int[][] salary = new int[employees.length][5];

        int i = 0;
        while (i < employees.length) {
            System.out.printf("%s님의 업무수당 :", employees[i][0]);
            salary[i][1] = keyboard.nextInt();

            if (salary[i][1] >= 0 && salary[i][1] <= 1000000)
                i++;
            else{
                System.err.println("ERROR : 업무수당은 0 ~ 1000000");
                System.in.read();
            }
        }

        for (i = 0; i < employees.length; i++){
            switch (hb[i]){
                case 1 :
                salary[i][0] = 1650000;
                    break;
                case 2 :
                    salary[i][0] = 1680000;
                    break;
                case 3 :
                    salary[i][0] = 1700000;
                    break;
                case 4 :
                    salary[i][0] = 1720000;
                    break;
                case 6 :
                    salary[i][0] = 1750000;
                    break;
                default :
                    salary[i][0] = 0;
            }
        }

        for (i = 0; i < employees.length; i++){
            salary[i][2] = salary[i][0] + salary[i][1];
        }

        for (i = 0; i < employees.length; i++){
            if (salary[i][2] >= 2600000){
                salary[i][3] = (int)(salary[i][2] * (10.0f /100));
            }else if (salary[i][2] >= 2000000){
                salary[i][3] = (int)(salary[i][2] * (8.0f /100));
            }else{
                salary[i][3] = (int)(salary[i][2] * (5.0f /100));
            }
        }
        for (i = 0; i < employees.length; i++){
            salary[i][4] = salary[i][2] - salary[i][3];
        }

        for (i = 0; i < employees.length; i++){
            for (int j = 0; j < employees.length -1 -i;j++){
                if (salary[j][4] > salary[j + 1][4]){
                    String[] temp = employees[j];
                    employees[j] =employees [j + 1];
                    employees[j + 1]  = temp;

                    int temp1 = hb[j];
                    hb[j] = hb[j + 1];
                    hb[j + 1]  = temp1;

                    int[] temp2 = salary[j];
                    salary[j] = salary [j + 1];
                    salary[j + 1]  = temp2;
                }
            }
        }

        System.out.println("***************************************************************");
        System.out.println(" 이름   사번  호봉   기본급   업무수당    금여액     세금       지급액");
        System.out.println("***************************************************************");

        for (i = 0; i < employees.length; i++){
            System.out.printf("%4s %5s %1d %,9d %,9d %,9d %,8d %,9d\n",employees[i][0],employees[i][1],hb[i],salary[i][0],salary[i][1],salary[i][2],salary[i][3],salary[i][4]);
        }
        System.out.println("***************************************************************");

    }
}