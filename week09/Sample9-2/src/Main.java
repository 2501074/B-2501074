import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        int last;
        int start;


        while(true) {
        System.out.print("어디부터 구할까요 : ");
        start = keyboard.nextInt();
        System.out.print("어디까지 구할까요 : ");
        last = keyboard.nextInt();
        if(start >= last) {
            System.err.println("ERROR");
            System.in.read();
        }else{
            break;
        }
        }

        for (int i = start; i <= last; i++){
            sum += i;
        }
        System.out.printf("%d + %d + ... + %d =%,d\n",start, start +1,last, sum);
    }
}