
class Output {
    public void printResults(String[][][] students, int[][][] scores, int[][] totals, float[][] avg,
                             int[][] classRank, int[] schoolRank, float[] classAvg, float schoolAvg) {
        int schoolIndex = 0;
        for (int i = 0; i < students.length; i++) {
            System.out.println("\n*** " + (i + 1) + "반 성적표 ***");
            System.out.println("*****************************************************************");
            System.out.println("학번    이름   국어 영어 수학 선택 총점 평균 반석차 학년석차 기타");
            System.out.println("*****************************************************************");
            for (int j = 0; j < students[i].length; j++) {
                String remark = totals[i][j] < classAvg[i] ? "반평균 미만" : "";
                System.out.printf("%s %s %3d %3d %3d %3d %4d %6.2f %4d %6d %s\n",
                        students[i][j][0], students[i][j][1],
                        scores[i][j][0], scores[i][j][1], scores[i][j][2], scores[i][j][3],
                        totals[i][j], avg[i][j], classRank[i][j], schoolRank[schoolIndex++], remark);
            }
            System.out.println("*****************************************************************");
            System.out.printf("%d반 전체 평균: %.2f\n", (i + 1), classAvg[i]);
        }
        System.out.printf("\n학년 전체 평균: %.2f\n", schoolAvg);
    }
}
