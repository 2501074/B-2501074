import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String[] name = {"홍길동", "이재명", "윤석열", "경복대", "오세훈", "강민성", "김진성", "니키타", "김정은", "김시온"};
        String[] gkrqjs = {"2501002", "2501004", "2501005", "2501014", "2501024", "2501030", "2501032", "2501044", "2501064", "2501074"};
        int[] kor = new int[name.length];
        int[] eng = new int[name.length];
        int[] math = new int[name.length];
        int[] total = new int[name.length];
        int[] rank = new int[name.length];
        float[] avg = new float[name.length];

        // 성적 입력
        int i = 0;
        while (i < name.length) {
            System.out.printf("%s 학생의 국어 성적 : ", name[i]);
            kor[i] = keyboard.nextInt();
            System.out.printf("%s 학생의 영어 성적 : ", name[i]);
            eng[i] = keyboard.nextInt();
            System.out.printf("%s 학생의 수학 성적 : ", name[i]);
            math[i] = keyboard.nextInt();

            if ((kor[i] >= 0 && kor[i] <= 100) && (eng[i] >= 0 && eng[i] <= 100) && (math[i] >= 0 && math[i] <= 100)) {
                i++;
            } else {
                System.err.println("ERROR : 점수는 0 ~ 100 사이여야 합니다.");
                System.in.read();
            }
        }

        // 총점 계산
        for (i = 0; i < name.length; i++) {
            total[i] = kor[i] + eng[i] + math[i];
        }

        // 버블 정렬 (총점 기준 내림차순)
        for (i = 0; i < name.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < name.length - 1 - i; j++) {
                if (total[j] < total[j + 1]) {
                    swapped = true;

                    // 이름 교환
                    String tempStr = name[j];
                    name[j] = name[j + 1];
                    if (!swapped) break;
                }

                // 평균 계산
                for (i = 0; i < name.length; i++) {
                    avg[i] = total[i] / 3.0f;
                }

                // 등수 계산
                for (i = 0; i < name.length; i++) {
                    rank[i] = 1;
                    System.out.println("학번     이름    국어    영어    수학    총점    평균    등수");
                    System.out.println("******************************************************");
                    for (i = 0; i < name.length; i++) {
                        System.out.printf("%7s  %3s  %3d    %3d    %3d    %3d   %5.1f   %2d\n",
                                gkrqjs[i], name[i], kor[i], eng[i], math[i], total[i], avg[i], rank[i]);
                    }
                    System.out.println("******************************************************");
                }
            }
        }
    }
}