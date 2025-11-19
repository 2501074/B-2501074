import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String[][] students = new String[][] {
                {"12345","홍길동"},{"34563","이혜인"},
                {"45321","김명성"},{"56456","경복대"},
                {"67853","이대학"}
        };
        String[] subject = new String[]{"국어","영어","수학"};
        int[][] score = new int[students.length][4];    //4 = 국어 영어 수학 총점이 들어갈 공간
        float[] avg = new float[score.length];
        boolean swapped = true;
        for (int i = 0; i < students.length; i++) {
            int j = 0;
            while (j < subject.length) {
                System.out.printf("%s님의 %s 성적 : ", students[i][1], subject[j]);
                score[i][j] = keyboard.nextInt();

                if (score[i][j] >= 0 && score[i][j] <= 100) {
                    j++;
                } else {
                    System.err.print("ERROR");
                    System.in.read();
                }
            }
        }
        for (int i = 0; i < students.length; i++) {
            for(int j = 0; j < subject.length; j++)
                score[i][score[i].length - 1] += score[i][j];
        }

        for (int i = 0; i < students.length - 1; i++) {
            swapped = false;
            for (int j = 0;j<students.length - 1 - i;j++){
                if(score[j][score[i].length - 1] > score[j][score[j].length -1]){
                    String[] text = new String[2];
                    text = students[i];
                    students[i] = students[j];
                    students[j] = text;

                    int[] temp = new int[subject.length +1];
                    temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;

                    swapped = true;
                }
            }
            if(!swapped) break;

        }

        for (int i = 0; i < students.length; i++) {
            avg[i] = score[i][score[i].length - 1] / 3.0f;
        }

        System.out.println("*********************************************");
        System.out.println("학번    이름   국어   영어  수학   총점   평균");
        System.out.println("*********************************************");
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%6s %3s  %3d   %3d   %3d   %3d   %6.2f\n",students[i][0],students[i][1],score[i][0],score[i][1],score[i][2],score[i][3],avg[i]);
        }
        System.out.println("*********************************************");

    }
}