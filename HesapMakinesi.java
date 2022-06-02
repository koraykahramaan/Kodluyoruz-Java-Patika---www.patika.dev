import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        double number1,number2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. sayıyı giriniz : ");
        number1 = scanner.nextDouble();
        System.out.println("2. sayıyı giriniz : ");
        number2 = scanner.nextDouble();
        System.out.println("Yapılacak işlemi seçiniz :\n 1-Toplama \n 2-Cikarma \n 3-Carpma \n 4-Bolme");
        int secim = scanner.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Toplama sonucu : " + (number1+number2));
                break;

            case 2:
                System.out.println("Çıkarma sonucu : " + (number1-number2));
                break;

            case 3:
                System.out.println("Çarpma sonucu : " + (number1*number2));
                break;

            case 4:
                System.out.println("Bölme sonucu : " + (number1/number2));
                break;

            default:
                System.out.println("Hatalı numara girdiniz.");
                break;
        }

    }
}
