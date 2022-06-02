import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kdvOran = 0.18;
        double kdvOran2 = 0.08;
        System.out.println("Tutarı giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int tutar = scanner.nextInt();

        if(tutar < 0 ) {
            System.out.println("Negatif değer giremezsiniz !");
        }
        else if (tutar < 1000) {
            tutar += tutar * kdvOran;
            System.out.println("KDV'li tutar: " + tutar);
        }
        else {
            tutar += tutar * kdvOran2;
            System.out.println("KDV'li tutar: " + tutar);
        }
    }
}
