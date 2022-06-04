import java.util.Scanner;

public class ÜsAlma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı : ");
        int a = scanner.nextInt();
        System.out.println("Üs olacak sayı : ");
        int b = scanner.nextInt();
        System.out.println("Sonuç : " + (int)Math.pow(a,b));
    }
}
