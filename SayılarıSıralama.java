import java.util.Scanner;

public class SayılarıSıralama {
    public static void main(String[] args) {
        int number1,number2,number3;
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Sayı : ");
        number1=scan.nextInt();
        System.out.println("2. Sayı : ");
        number2=scan.nextInt();
        System.out.println("3. Sayı : ");
        number3=scan.nextInt();
        if(number1 == number2 && number2 == number3 && number1 == number3) {
            System.out.println("Sayılar birbirine eşit olduğu için sıralama yapılamaz.");
        }

        if(number2 > number1 && number3>number2) {
            System.out.println("number3 > number2 > number1");
        }
        else if(number3>number1 && number1 > number2) {
            System.out.println("number3 > number1 > number2");
        }
        else if(number1 > number2 && number2 > number3) {
            System.out.println("number1 > number2 > number3");
        }
        else if(number1 > number2 && number3 > number2) {
            System.out.println("number1 > number3 > number2");
        }
        else if(number2>number1 && number1 > number3) {
            System.out.println("number2 > number1 > number3");
        }
        else {
            System.out.println("number2 > number3 > number1");
        }

    }
}
