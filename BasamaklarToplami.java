import java.util.Scanner;

public class BasamaklarToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        String sayi = scanner.nextLine();
        int uzunluk = sayi.length();
        int toplam = 0;
        int sayi1 = Integer.parseInt(sayi);

        for(int i = 0; i < uzunluk;i++) {
            toplam += sayi1 % 10;
            sayi1 /= 10;
        }

        System.out.println("Sonuç : " + toplam);


    }
}
