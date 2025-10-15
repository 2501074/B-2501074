public class Main {
    public static void main(String[] args) {
        final int radius = 6378137; //m
        final int KOREA = 99720; //km
        final double PI = 3.141592f;
        long surface;
        double result;
        double temp;

        temp = 4 * PI * radius * radius;
        surface = (long) (temp/1000);

        result = ((double)KOREA/surface) * 100;

        System.out.printf("지구의 반지름은 %,d m입니다.\n",radius);
        System.out.printf("지구의 표면적인 %,d \u33A2입니다\n",surface);
        System.out.printf("대한민국의 넓이 : %,d \u33A2입니다.\n",KOREA);
        System.out.printf("대한민국은 지구의 %.8f %%입니다.\n",result);

    }
}