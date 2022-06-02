import java.util.Scanner;

public class VücutKitleEndeksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Boyunuzu metre cinsinden giriniz(Örn:1.70) :");
        double boy = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz(Örn:70) : ");
        int kilo = scanner.nextInt();

        double vki = kilo / (boy * boy);

        System.out.println("Vücut Kitle Endeksiniz : " + vki);


    }
}
