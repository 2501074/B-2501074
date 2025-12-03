import java.io.IOException;
import java.util.Scanner;

public class input {
    public static int[][] inputData(String[] name) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int[][] data = new int[name.length][4]; //
        String[] subject = {"국어","영어","수학","총점"};

        int i = 0;
        while(i < data.length) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = 0 && data[i][j] <= 100;
            }
        }
        return data;
    }
    public static void readData(String name, int[] data) throws IOException {

        while (true) {
            System.out.printf("%s님의 성적 입력 : ", name[i]);
            i1 = keyboard.nextInt();
            if (i1 >= 0 && i1 <= 100)
                break;
            else {
                System.out.println("ERROR : ");
                System.in.read();
            }
        }
            return i1;
    }
}
