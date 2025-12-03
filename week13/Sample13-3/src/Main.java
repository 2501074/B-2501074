
public class Main {
    public static void main(String[] args) {
        int[][] data = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10}
        };

        multiple(data);


        System.out.println("=== 전체 배열 출력 ===");
        display(data);

        System.out.println("*****************************");


        for (int i = 0; i < data.length; i++) {
            multiple(data[i]);
        }

        System.out.println("=== 각 행 2배 후 출력 ===");
        display(data);

        System.out.println("*****************************");

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = multiple(data[i][j]);
            }
        }

        System.out.println("=== 각 요소 2배 후 출력 ===");
        display(data);
    }

    private static void multiple(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] *= 2;
            }
        }
    }


    private static void multiple(int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] *= 2;
        }
    }


    private static int multiple(int data) {
        return data * 2;
    }


    private static void display(int[][] data) {
        for (int i = 0; i < data.length; i++);
    }
}