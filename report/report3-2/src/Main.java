public class Main {
    public static void main(String[] args) {
        String ScName = "경복대학교";
        String name = "홍 길동";
        int age = 20;
        String gender = "남(여)";
        float height = 170.6f;
        float weight = 65.4f;

        System.out.print("*********************\n");
        System.out.printf("학교 : %s\n", ScName);
        System.out.printf("이름 : %s\n", name);
        System.out.printf("나이 : %d\n",age);
        System.out.printf("성별 : %s\n",gender);
        System.out.printf("신장 : %.1f\n",height);
        System.out.printf("체중 :  %.1f\n",weight);
        System.out.print("*********************\n");

    }
}