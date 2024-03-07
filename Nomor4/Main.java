package Nomor4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata atau kalimat: ");
        String kata = scanner.nextLine();
        boolean hasil = cekPalindrome(kata);
        
        if (hasil) {
            System.out.println("String \"" + kata + "\" adalah palindrome.");
        } else {
            System.out.println("String \"" + kata + "\" bukan palindrome.");
        }
        scanner.close();
    }

    public static boolean cekPalindrome(String kata) {
        kata = kata.replaceAll("\\s+", "").toLowerCase();
        
        for (int i = 0; i < kata.length() / 2; i++) {
            if (kata.charAt(i) != kata.charAt(kata.length() - 1 - i)) {
                return false; // false jika salah
            }
        }
        return true; // true jika benar
    }
}
