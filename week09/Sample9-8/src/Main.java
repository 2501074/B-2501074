public class Main {
    public static void main(String[] args) {
        final int turtle = (35 * 1000) / (60 * 60); //초당 거리
        final int rabbit= (60 * 1000) / (60 * 60);
        int turtle2 = 450;
        int rabbit2 = 0;

        int i = 1;
        for(  ; true; i++) {
            turtle2 += turtle;
            rabbit2 += rabbit;

            if(rabbit2 > turtle2){
                break;
            }
            System.out.printf("%d초 후 토끼 : %,d m, 거북이 : %d m\n",i,rabbit2,turtle2);
        }
    }
}