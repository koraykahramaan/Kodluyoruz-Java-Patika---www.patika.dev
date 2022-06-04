import java.util.Scanner;

public class GirilenSayilardanMaxMinBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç sayı gireceksiniz : ");
        int n = scanner.nextInt();
        int maks = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sayi;
        for(int i =1; i <= n; i++) {
            System.out.println(i + ". sayıyı giriniz : ");
            sayi = scanner.nextInt();
            if(sayi > maks) {
                maks = sayi;
            }
            if(sayi < min) {
                min = sayi;
            }
        }

        System.out.println("En büyük sayi : " + maks);
        System.out.println("En kücük sayi : " + min);
    }
}
