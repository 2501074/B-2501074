import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int oa = 0;
        int ha = 0;
        int qa = 0;
        int da = 0;
        int na = 0;
        int pa = 0;

        int r = 0;

        int o = 100;
        int h = 50;
        int q = 25;
        int d = 10;
        int n = 5;
        int p = 1;

        System.out.print("달라 갯수 : ");
        oa  = input.nextInt();
        System.out.print("하프 갯수 : ");
        ha  = input.nextInt();
        System.out.print("쿼터 갯수 : ");
        qa  = input.nextInt();
        System.out.print("다임 갯수 : ");
        da  = input.nextInt();
        System.out.print("니켈 갯수 : ");
        na  = input.nextInt();
        System.out.print("페니 갯수 : ");
        pa  = input.nextInt();

        o *= oa;
        h *= ha;
        q *= qa;
        d *= da;
        n *= na;
        p *= pa;

        r = o+h+q+d+n+p;

        System.out.printf("총 금액 : %d cent",r);
    }
}