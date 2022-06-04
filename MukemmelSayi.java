import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        int sayi = scanner.nextInt();
        int toplam = 0;
        for(int i = 1;i<sayi;i++) {
            if(sayi % i == 0) {
                toplam += i;
            }
        }
        String mukemmelSayiMi = sayi == toplam ? "Mükemmel sayidir." : "Mükkemel sayi değildir.";
        System.out.println(mukemmelSayiMi);
    }
}
