import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        int sayi = scanner.nextInt();
        double result = 0;
        for(double i = 1;i<=sayi;i++) {
            result += 1/i;
        }

        System.out.println("Sonuç : " + result);
    }
}
