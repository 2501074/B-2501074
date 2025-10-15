public class Main {
    public static void main(String[] args) {
        final int K = 99720;
        final int N = 122762;
        final int U = 9631418;
        final int J = 377873;

        float temp1 = (float) N / K;
        float temp2 = (float) U / K;
        float temp3 = (float) J / K;

        System.out.printf("대한민국의 면적 :%d Km2 /n",K);
        System.out.printf("북한의 면적 :%d Km2 /n",N);
        System.out.printf("미국의 면적 :%d Km2 /n",U);
        System.out.printf("일본의 면적 :%d Km2 /n",J);

        System.out.printf("북한은 우리나라에 비해 %.2f 배\n",temp1);
        System.out.printf("미국은 우리나라에 비해 %.2f 배\n",temp2);
        System.out.printf("일본은 우리나라에 비해 %.2f 배\n",temp3);
    }
}