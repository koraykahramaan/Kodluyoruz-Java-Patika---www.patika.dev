import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");

        int number = scanner.nextInt();
        if(number < 0 ) {
            System.out.println("Hatalı bir sayi girdiniz.");
            System.exit(0);
        }
        double count = 0;
        int toplam = 0;

        for(int i =1; i<=number; i++) {

            if(i % 3 == 0 && i % 4 == 0) {
                count++;
                toplam += i;
            }
        }
        System.out.println(toplam);
        System.out.println(count);
        System.out.println("3'e ve 4'e tam bölünebilen sayıların ortalaması : " + (toplam/count));
    }
}
