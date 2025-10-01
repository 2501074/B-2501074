import java.net.StandardSocketOptions;

public class Main {
    public static void main(String[] args) {
        boolean test = (0 == -0);
        boolean test1 = 4 < 1;
        boolean test2 = 'a' > 'A';  //97 >65;
        boolean test3 = ('a' + 2) != 'b';
        boolean test4 = true != false;
        boolean test5 = ((!true) == false);




        System.out.printf("test = %b\n",test);  //true
        System.out.printf("test1 = %b\n",test1);    //false
        System.out.printf("test2 = %b\n",test2);    //true
        System.out.printf("test3 = %b\n",test3);    //true
        System.out.printf("test4 = %b\n",test4);    //true
        System.out.printf("test5 = %b\n",test5);    //true



    }
}