import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;

        System.out.print("나이 : ");
        age = keyboard.nextInt();
        if (age >= 18){
            System.out.println("입장료 : 4000원");
        } else if(age >= 13){
            System.out.println("입장료 : 3000원");
        } else if(age >= 7){
            System.out.println("입장료 : 1000원");
        }else{
            System.out.println("무료");
        }
    }
}