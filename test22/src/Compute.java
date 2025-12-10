
class Compute {
    // 총점 계산
    public int[][] computeTotal(int[][][] scores) {
        int[][] total = new int[scores.length][];
        for (int i = 0; i < scores.length; i++) {
            total[i] = new int[scores[i].length];
            for (int j = 0; j < scores[i].length; j++) {
                total[i][j] = scores[i][j][0] + scores[i][j][1] + scores[i][j][2] + scores[i][j][3];
            }
        }
        return total;
    }

    // 평균 계산
    public float[] computeClassAvg(int[] totals) {
        float sum = 0;
        for (int t : totals) sum += t;
        return new float[]{sum / totals.length};
    }

    // 반석차 계산 (동점자 처리)
    public int[] computeClassRank(int[] totals) {
        int[] rank = new int[totals.length];
        for (int i = 0; i < totals.length; i++) {
            rank[i] = 1;
            for (int j = 0; j < totals.length; j++) {
                if (totals[i] < totals[j]) rank[i]++;
            }
        }
        return rank;
    }

    // 학년석차 계산 (동점자 처리)
    public int[] computeSchoolRank(int[][] total) {
        int count = 0;
        for (int[] cls : total) count += cls.length;
        int[] allTotals = new int[count];
        int idx = 0;
        for (int[] cls : total) {
            for (int t : cls) allTotals[idx++] = t;
        }
        int[] rank = new int[count];
        for (int i = 0; i < count; i++) {
            rank[i] = 1;
            for (int j = 0; j < count; j++) {
                if (allTotals[i] < allTotals[j]) rank[i]++;
            }
        }
        return rank;
    }

    // 학번 순 정렬 (버블 정렬)
    public void sortByHakbun(String[][] students, int[][] scores, int[] totals, float[] avg, int[] rank) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j][0].compareTo(students[j + 1][0]) > 0) {
                    // swap students
                    String[] tempS = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = tempS;
                    // swap scores
                    int[] tempScore = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tempScore;
                    // swap totals
                    int tempT = totals[j];
                    totals[j] = totals[j + 1];
                    totals[j + 1] = tempT;
                    // swap avg
                    float tempA = avg[j];
                    avg[j] = avg[j + 1];
                    avg[j + 1] = tempA;
                    // swap rank
                    int tempR = rank[j];
                    rank[j] = rank[j + 1];
                    rank[j + 1] = tempR;
                }
            }
        }
    }
}
