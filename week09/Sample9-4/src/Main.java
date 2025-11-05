import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int count = 1;
        int num;
        int sum = 0;
        final int count2 = 10;

        while (count <= count2) {
            System.out.printf("%d회 양의 정수 : ",count);
            num = keyboard.nextInt();
            if(num < 0){
                System.err.println("ERROR : 양의 정수 :");
                System.in.read();
            }else{
                sum += num;
                count++;
            }
        }
        System.out.printf("합 = %d\n ",sum);
        System.out.printf("평균 = %.2f\n",sum /(float)count2);
        
    }
}