import java.util.Scanner;

public class YildizlarileElmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int sayi = scanner.nextInt();
        for(int i=1; i <= sayi;i++) {

            for(int k=1;k<=(sayi-i) ;k++) {
                System.out.print(" ");
            }

            for(int j = 1;j <= (2*i)-1; j++) {
                System.out.print("*");
            }


            System.out.println("");
        }

        for(int a = sayi-1; a >= 1;a--) {

            for(int b = 1;b <=(sayi-a);b++) {
                System.out.print(" ");
            }
            for(int c = 2*a -1;c >=1;c--) {
                System.out.print("*");
            }

            System.out.println("");

        }


    }
}
