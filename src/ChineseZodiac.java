
import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        /*
        Çin Zodyağı nasıl hesaplanır?

        Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

        Doğum Tarihi %12 = 0 ➜ Maymun

        Doğum Tarihi %12 = 1 ➜ Horoz

        Doğum Tarihi %12 = 2 ➜ Köpek

        Doğum Tarihi %12 = 3 ➜ Domuz

        Doğum Tarihi %12 = 4 ➜ Fare

        Doğum Tarihi %12 = 5 ➜ Öküz

        Doğum Tarihi %12 = 6 ➜ Kaplan

        Doğum Tarihi %12 = 7 ➜ Tavşan

        Doğum Tarihi %12 = 8 ➜ Ejderha

        Doğum Tarihi %12 = 9 ➜ Yılan

        Doğum Tarihi %12 = 10 ➜ At

        Doğum Tarihi %12 = 11 ➜ Koyun

         */

        Scanner input = new Scanner(System.in);
        int yearOfBirth;
        System.out.print("Doğduğunuz yılı giriniz: ");
        yearOfBirth = input.nextInt();

        if (yearOfBirth % 12 == 0) {
            System.out.print("Çin Zodyağı Burcunuz: Maymun");
        } else if (yearOfBirth % 12 == 1) {
            System.out.print("Çin Zodyağı Burcunuz: Horoz.");
        } else if (yearOfBirth % 12 == 2) {
            System.out.print("Çin Zodyağı Burcunuz: Köpek.");
        } else if (yearOfBirth % 12== 3) {
            System.out.print("Çin Zodyağı Burcunuz: Domuz.");
        } else if (yearOfBirth % 12 == 4) {
            System.out.print("Çin Zodyağı Burcunuz: Fare.");
        } else if (yearOfBirth % 12 == 5) {
            System.out.print("Çin Zodyağı Burcunuz: Öküz.");
        } else if (yearOfBirth % 12 == 6) {
            System.out.print("Çin Zodyağı Burcunuz: Kaplan.");
        } else if (yearOfBirth % 12 == 7) {
            System.out.print("Çin Zodyağı Burcunuz: Tavşan.");
        } else if (yearOfBirth % 12 == 8) {
            System.out.print("Çin Zodyağı Burcunuz: Ejderha.");
        } else if (yearOfBirth % 12 == 9) {
            System.out.print("Çin Zodyağı Burcunuz: Yılan.");
        } else if (yearOfBirth % 12 == 10) {
            System.out.print("Çin Zodyağı Burcunuz: At.");
        } else if (yearOfBirth % 12 == 11) {
            System.out.print("Çin Zodyağı Burcunuz: Koyun.");
        }
    }
}
