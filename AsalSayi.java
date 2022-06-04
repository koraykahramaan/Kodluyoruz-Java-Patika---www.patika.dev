import java.util.ArrayList;
import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi(üst limit) giriniz : ");
        int sayi = scanner.nextInt();
        String asalSayilar = "2";

        for(int i = 3;i<=sayi;i++) {
            int count1 = 0;
            int count2 = 0;
            for(int j=2;j<i;j++) {
                if(i % j != 0) {
                    count1++;
                }
                count2++;
            }
            if(count1 == count2) {
                asalSayilar +=  "," + i ;
            }
        }
        System.out.println(asalSayilar);

    }
}
