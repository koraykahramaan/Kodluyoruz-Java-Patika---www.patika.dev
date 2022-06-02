import java.util.ArrayList;
import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int not = 0;
        list.add("Matematik");
        list.add("Fizik");
        list.add("Türkçe");
        list.add("Kimya");
        list.add("Müzik");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " dersindeki notunuz nedir?");
            not = scan.nextInt();
            if(not<0 || not>100) {
                System.out.println("Geçerli bir not girmediniz.Ortalamaya dahil edilmeyecek.");
            }
            else {
                toplam += not;
            }
        }

        double average = (double)toplam / 5.0;
        String gectiMi = average >= 55 ? "Sınıfı geçti." : "Sınıfta kaldı.";

        System.out.println(gectiMi + "Ortalamanız : " + average);

    }
}
