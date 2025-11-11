
public class Main {
    public static void main(String[] args) {
        int wellDepth = 300; // 우물 깊이 (cm)
        int climb = 55;      // 낮에 올라가는 거리 (cm)
        int slip = 13;       // 밤에 미끄러지는 거리 (cm)
        int position = 0;    // 현재 위치
        int day = 0;

        while (true) {
            day++;
            position += climb;

            if (position >= wellDepth) {
                System.out.println("달팽이는 " + day + "일 만에 우물을 탈출했습니다.");
                break;
            }

            position -= slip;
        }

        if (day <= 7) {
            System.out.println("달팽이는 일주일 안에 우물을 탈출할 수 있습니다.");
        } else {
            System.out.println("달팽이는 일주일 안에 우물을 탈출할 수 없습니다.");
        }
    }
}
