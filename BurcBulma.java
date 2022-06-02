import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Doğduğunuz ay : ");
        int ay = scan.nextInt();
        if(ay>12 || ay<0) {
            System.out.println("Geçersiz bir ay girdiniz.");
            System.exit(0);
        }
        System.out.println("Doğduğunuz gün : ");
        int gün = scan.nextInt();
        if(gün>31 || gün<0) {
            System.out.println("Geçersiz bir gün girdiniz.");
            System.exit(0);
        }

        if(ay == 1) {
            if(gün >= 22) {
                System.out.println("Kova Burcu");
            }
            else {
                System.out.println("Oğlak Burcu");
            }
        }
        if(ay == 2) {
            if(gün <= 19) {
                System.out.println("Kova Burcu");
            }
            else {
                System.out.println("Balık Burcu");
            }
        }
        if(ay == 3) {
            if(gün <= 20) {
                System.out.println("Balık Burcu");
            }
            else {
                System.out.println("Koç Burcu");
            }
        }
        if(ay == 4) {
            if(gün <= 20) {
                System.out.println("Koç Burcu");
            }
            else {
                System.out.println("Boğa Burcu");
            }
        }
        if(ay == 5) {
            if(gün <= 21) {
                System.out.println("Boğa Burcu");
            }
            else {
                System.out.println("İkizler Burcu");
            }
        }
        if(ay == 6) {
            if(gün <= 22) {
                System.out.println("İkizler Burcu");
            }
            else {
                System.out.println("Yengeç Burcu");
            }
        }
        if(ay == 7) {
            if(gün <= 22) {
                System.out.println("Yengeç Burcu");
            }
            else {
                System.out.println("Aslan Burcu");
            }
        }
        if(ay == 8) {
            if(gün <= 22) {
                System.out.println("Aslan Burcu");
            }
            else {
                System.out.println("Başak Burcu");
            }
        }
        if(ay == 9) {
            if(gün <= 22) {
                System.out.println("Başak Burcu");
            }
            else {
                System.out.println("Terazi Burcu");
            }
        }
        if(ay == 10) {
            if(gün <= 22) {
                System.out.println("Terazi Burcu");
            }
            else {
                System.out.println("Akrep Burcu");
            }
        }
        if(ay == 11) {
            if(gün <= 21) {
                System.out.println("Akrep Burcu");
            }
            else {
                System.out.println("Yay Burcu");
            }
        }
        if(ay == 12) {
            if(gün <= 21) {
                System.out.println("Yay Burcu");
            }
            else {
                System.out.println("Oğlak Burcu");
            }
        }


    }
}
