import java.util.Scanner;

public class TersUcgenYapimi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Basamak sayisini giriniz : ");
        int n = scanner.nextInt();
        int x = n;
        for(int i = 1;i<=n;i++) {

            for(int j=n;j>(n-i);j--){
                System.out.print(" ");
            }
//19-16
            for(int k = 1;k<=(2*x)-1;k++) {
                System.out.print("*");
            }

            System.out.println("");
            x-=1;

        }
    }
}
