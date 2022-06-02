import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        int a;
        double pi = 3.14;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dairenin yarıçapı nedir ?");
        double r = scan.nextDouble();
        System.out.println("Dairenin merkez açısının ölçüsü nedir?");
        a = scan.nextInt();

        System.out.println("Dairenin çevresi : " + (2*pi*r));
        System.out.println("Dairenin alanı : " + (pi*r*r));
        System.out.println("Daire diliminin alanı : " + ((pi*(r*r)*a)/360));



    }
}
