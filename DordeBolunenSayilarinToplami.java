import java.util.Scanner;

public class DordeBolunenSayilarinToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        boolean x = true;
        while(x) {
            System.out.println("Bir sayı giriniz : (Tek sayi girene kadar program sonlanmaz.)");
            int sayi = scanner.nextInt();
            if(sayi % 4 == 0) {
                toplam += sayi;
            }
            if(sayi % 2 == 1) {
                System.out.println("Tek sayi girdiniğiniz için program sonlanıyor.");
                System.out.println("Girdiğiniz sayılardan 4ün katı olanların toplamı : " + toplam);
                x  = false;
            }
        }
    }
}
