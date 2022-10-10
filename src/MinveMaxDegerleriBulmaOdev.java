import java.util.Scanner;
/**
 * Ödev - Girilen Sayılardan Min ve Max Değerleri Bulma
 * Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
 * <p>
 * Senaryo
 * Kaç tane sayı gireceksiniz: 4
 * 1. Sayıyı giriniz: 16
 * 2. Sayıyı giriniz: -22
 * 3. Sayıyı giriniz: -15
 * 4. Sayıyı giriniz: 100
 * En büyük sayı: 100
 * En küçük sayı: -22
 */
public class MinveMaxDegerleriBulmaOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter, n, min = 1, max = 1;

        System.out.print("Girilecek sayıların sayısını giriniz : ");
        counter = input.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ".sayıyı giriniz : ");
            n = input.nextInt();

            if (i == 1) {
                max = n;
                min = n;
            }

            if (n > max) {
                max = n;
            }

            if (n < min) {
                min = n;
            }
        }

        System.out.println("En büyük sayi : " + max);
        System.out.println("En küçük sayi: " + min);
    }
}