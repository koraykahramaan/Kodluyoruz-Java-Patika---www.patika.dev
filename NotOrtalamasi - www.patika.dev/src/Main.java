import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Matematik");
        list.add("Fizik");
        list.add("Kimya");
        list.add("Türkçe");
        list.add("Tarih");
        list.add("Müzik");
        int toplam = 0;
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " dersinizin notu nedir ?");
            toplam += scan.nextInt();
        }
        double ortalama = toplam / 6.0;
        String gectiMi = ortalama > 60 ? "Sınıfı geçti" : "Sınıfta kaldı";
        System.out.println(gectiMi);
    }
}
