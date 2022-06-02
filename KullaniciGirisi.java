import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String username,password;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz : ");
        username = scanner.nextLine();
        System.out.println("Şifreyi giriniz : ");
        password = scanner.nextLine();

        if(username.equalsIgnoreCase("patika") && password.equals("password123")) {
            System.out.println("Giriş başarılı.");
        }
        else {
            System.out.println("Şifreyi sıfırlamak istiyor musunuz?(E ya da N) :");
            String cevap = scanner.nextLine();
            cevap = cevap.toLowerCase();
            if(cevap.equals("e")) {
                System.out.println("Yeni şifreyi giriniz : ");
                String newPassword = scanner.nextLine();
                if(newPassword.equals(password) || newPassword.equals("password123")) {
                    System.out.println("Şifre oluşturulamadı.Lütfen başka şifre giriniz.");
                }
                else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }
            else {
                System.out.println("Bilgileriniz doğru değil.");
            }
        }
    }
}
