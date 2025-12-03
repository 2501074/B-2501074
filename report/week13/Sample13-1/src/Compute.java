public class Compute {
    public static void process(int[][] score) throws Exception {
        int total=0;

        for (int i = 0; i < score.lenght; i++){
            for (int j = 0; j < score[i].length - 1;j++){
            score[i][score[i].length -1] += score[i][j];
            }

        }
    }
}
