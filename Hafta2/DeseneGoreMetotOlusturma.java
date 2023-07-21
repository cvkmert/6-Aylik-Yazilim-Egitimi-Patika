package Hafta2;

import java.util.Scanner;

public class DeseneGoreMetotOlusturma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();

        System.out.println("Çıktısı:");
        recursiveMethod(n);

        scanner.close();
    }

    public static void recursiveMethod(int n) {
        // Base case: Eğer n 0 veya daha küçükse işlemi sonlandır ve metottan çık
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }

        // Adım 1: Sayıdan 5 çıkar ve sonucu ekrana yazdır
        System.out.print(n + " ");

        // Adım 2: n - 5 ile recursiveMethod'ı tekrar çağır
        recursiveMethod(n - 5);

        // Adım 3: Metottan çıktıktan sonra sayıya 5 ekleyip sonucu ekrana yazdır
        System.out.print(n + " ");
    }
}

