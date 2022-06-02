import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String,Double> hashMap = new HashMap<>();
        hashMap.put("Armut",2.14);
        hashMap.put("Elma",3.67);
        hashMap.put("Domates",1.11);
        hashMap.put("Muz",0.95);
        hashMap.put("Patlican",5.00);
        double kilo;
        double toplamTutar = 0;

        for(String key : hashMap.keySet() ) {
            System.out.println("Kaç kilo " + key + " aldınız?");
            kilo = scan.nextDouble();
            toplamTutar += hashMap.get(key) * kilo;
        }

        System.out.println("Toplam tutar : " + toplamTutar + " TL");
    }
}
