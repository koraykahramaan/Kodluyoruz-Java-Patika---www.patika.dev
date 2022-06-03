import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yıl giriniz : ");
        int yil = scan.nextInt();
        if(yil % 4 == 0) {
            if(yil % 100 == 0 && yil % 400 != 0) {
                System.out.println(yil + " bir artık yıl değildir.");
                System.exit(0);
            }
            System.out.println(yil + " bir artık yıldır.");

        }
        else {
            System.out.println(yil + " bir artık yıl değildir.");
        }

    }
}
