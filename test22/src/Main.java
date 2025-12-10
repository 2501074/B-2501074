
public class Main {
    public static void main(String[] args) {
        String[][][] students = {
                {{"2101234", "홍길동", "남"}, {"2101235", "경복대", "여"},
                        {"2101236", "한국인", "남"}, {"2101345", "정상인", "여"}},
                {{"2301345", "구자철", "남"}, {"2301435", "이가을", "여"},
                        {"2301443", "김광현", "남"}, {"2301678", "박종철", "남"},
                        {"2301679", "올시즌", "여"}},
                {{"2401234", "한민국", "여"}, {"2401456", "안우진", "남"},
                        {"2401789", "이대한", "남"}}
        };

        int[][][] scores = new int[students.length][][];
        int[][] totals;
        float[][] avg = new float[students.length][];
        int[][] classRank = new int[students.length][];
        float[] classAvg = new float[students.length];

        Input input = new Input();
        Compute compute = new Compute();
        Output output = new Output();

        // 입력
        for (int i = 0; i < students.length; i++) {
            scores[i] = input.inputScores(students[i], i + 1);
        }

        // 계산
        totals = compute.computeTotal(scores);
        int totalStudents = 0;
        for (String[][] cls : students) totalStudents += cls.length;
        int[] schoolRank = compute.computeSchoolRank(totals);

        // 반별 평균, 석차
        int schoolSum = 0;
        int schoolIndex = 0;
        for (int i = 0; i < students.length; i++) {
            avg[i] = new float[students[i].length];
            for (int j = 0; j < students[i].length; j++) {
                avg[i][j] = totals[i][j] / 4.0f;
                schoolSum += totals[i][j];
            }
            classAvg[i] = compute.computeClassAvg(totals[i])[0];
            classRank[i] = compute.computeClassRank(totals[i]);
            compute.sortByHakbun(students[i], scores[i], totals[i], avg[i], classRank[i]);
        }
        float schoolAvg = (float) schoolSum / totalStudents;

        // 출력
        output.printResults(students, scores, totals, avg, classRank, schoolRank, classAvg, schoolAvg);
    }
}
