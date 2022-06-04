import java.util.Scanner;

public class GirilenSayiyaKadarKuvvetleriYazdirma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi = scanner.nextInt();
        int a = 4;
        int b = 5;
        int count4 = 1;
        int count5 = 1;

        if(sayi > 0 ) {
            System.out.println("4ün 0. kuvveti : 1 " );
            System.out.println("5in 0. kuvveti : 1 " );
        }
        for(int i = 1; i<= sayi; i++) {


                if (i == a) {
                    System.out.println("4ün " + count4 +".kuvveti : " + a);
                    a *= 4;
                    count4++;
                }
            if (i == b) {
                System.out.println("5in " + count5 +".kuvveti : " + b);
                b *= 5;
                count5++;
            }

        }

    }
}
