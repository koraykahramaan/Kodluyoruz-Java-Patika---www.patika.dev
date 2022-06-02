import java.util.Scanner;

public class HipotenusveAlanHesaplama {
    public static void main(String[] args) {
        int kenar1,kenar2;
        double hipotenus;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Kenarı giriniz  : ");
        kenar1 = scanner.nextInt();
        System.out.println("2. Kenarı giriniz  : ");
        kenar2 = scanner.nextInt();

        hipotenus = Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));

        double alan = (kenar1 * kenar2) / 2;

        System.out.println("Hipotenüs : " +hipotenus);
        System.out.println("Alan : " + alan);
    }
}
