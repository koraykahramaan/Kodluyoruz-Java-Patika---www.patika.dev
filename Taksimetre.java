import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double acilisUcret = 10;
        double minHesap = 20;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz : ");
        int mesafe = scanner.nextInt();
        double hesap = acilisUcret + (mesafe * 2.2);

        if(hesap < minHesap) {
            System.out.println("Ödemeniz gereken tutar : " + minHesap);
        }
        else {
            System.out.println("Ödemeniz gereken tutar : " + hesap);
        }

    }
}
