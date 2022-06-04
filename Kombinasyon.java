import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kombinasyon (C(n,r)) için n değerini giriniz : ");
        int n = scanner.nextInt();
        System.out.println("Kombinasyon (C(n,r)) için r değerini giriniz : ");
        int r = scanner.nextInt();
        long nFaktoriyel = 1;
        long rFaktoriyel = 1;
        int fark = n-r;
        long farkFaktoriyel = 1;

        for(int i = 1; i<= n;i++) {
            nFaktoriyel *= i;
        }
        for(int j = 1; j<= r;j++) {
            rFaktoriyel *= j;
        }
        for(int k = 1; k<=fark;k++) {
            farkFaktoriyel *= k;
        }

        long result = nFaktoriyel / (rFaktoriyel * (farkFaktoriyel));
        System.out.println("Sonuç : " + result);

    }
}
