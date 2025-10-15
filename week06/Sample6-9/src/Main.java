import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int ciga = 7; //분
        int year;
        int gapi;
        int result;
        int hour;
        int day;

        System.out.print("당신은 하루에 몇 개? :");
        gapi = input.nextInt();
        System.out.print("몇년동안? : ");
        year = input.nextInt();

        result = gapi * year * 365 * ciga;
        hour = result /60;
        day = hour /24;

        System.out.printf("담배 1개피는 수명을 %d분 단축한다.\n", ciga);
        System.out.printf("담배를 %d년 동안 하루에 평균 %d개피를 피었다.", year, gapi);
        System.out.printf("그렇다면 수명이 %,d분(%d시간, %d일) 단축됩니다.\n",result,hour,day);
    }
}