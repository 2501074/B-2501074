import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        int fam = 0;
        String addr = "";
        System.out.printf("당신의 이름은? :");
        name = input.nextLine();
        System.out.printf("%s님의 가족은 몇명입니까? :", name);
        fam = input.nextInt(); input.nextLine();
        System.out.printf("%s님의 가족은 어디에서 살고 있습니까? :" , name);
        addr = input.nextLine();

        System.out.printf("%s님의 가족은 %d명 입니다.\n",name, fam);
        System.out.printf("%s님의 가족은 %s에서 살고 있습니다.\n",name, addr);
    }
}