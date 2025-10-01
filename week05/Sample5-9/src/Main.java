import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float height;
        char gender;
        float weight, weight1;
        String result;

        System.out.print("키(Meter) : ");
        height = input.nextFloat();
        System.out.print("성별(남='M',여='F') :");
        gender = input.next().charAt(0);

        weight = gender == 'M' || gender == 'm' ? height * height * 22 : height * height * 21;
        weight1 = gender == 'F' || gender == 'f' ? height * height * 20 : 0.0f;


        System.out.printf("키가 %,1f m인 %c자의 표준 체중은 %.2f Kg입니다.\n",height,gender, weight);
        result = gender == 'F' || gender == 'f' ?
            String.format( "키가 %,1f m인 %c자의 미용 체중은 %.2f Kg입니다.\n",
                    height, gender == 'f' || gender =='F' ? '여' : '남', weight1) :
                String.format(" ");

        System.out.printf("키가 %,1f m인 %c자의 표준 체중은 %.2f Kg입니다.\n",height, gender == 'f' || gender =='F' ? '여' : '남', weight1);
        System.out.println(result);



    }
}