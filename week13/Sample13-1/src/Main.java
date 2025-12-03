public class Main {
    public static void main(String[] args) {
        String[] name = {"홍길동","이순신","강민성","김지민","이예인"};

        int[][] score = Input.inputData(name.length);
        Compute.procsee(score);
        Output.display(name,score);
    }
}