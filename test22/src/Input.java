
import java.util.Scanner;

class Input {
        //한 반의 점수를 입력받아 반환
    public int[][] inputScores(String[][] classStudents, int classNum) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[classStudents.length][4];
        System.out.println("*** " + classNum + "반 성적 입력 ***");
        for (int i = 0; i < classStudents.length; i++) {
            String name = classStudents[i][1];
            String gender = classStudents[i][2];
            String[] subjects = {"국어", "영어", "수학", gender.equals("남") ? "기술" : "가정"};
            for (int j = 0; j < 4; j++) {
                while (true) {
                    System.out.print(classNum + "반 학생 " + name + "의 " + subjects[j] + " 점수 입력 : ");
                    int score = sc.nextInt();
                    if (score >= 0 && score <= 100) {
                        scores[i][j] = score;
                        break;
                    } else {
                        System.out.println("ERROR : 점수는 0에서 100 사이여야 합니다. 다시 입력하세요.");
                    }
                }
            }
        }
        return scores;
    }
}
