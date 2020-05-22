package ch09;

import java.util.Scanner;

public class AlgoritmaAKSPrimalityTest {

    static long c[] = new long[100];


    static void koefisien(int n)
    {
        c[0] = 1;
        for (int a = 0; a < n; c[0] = -c[0], a++) {
            c[1 + a] = 1;

            for (int b = a; b > 0; b--)
                c[b] = c[b - 1] - c[b];
        }
    }


    static boolean prima(int n)
    {
        koefisien(n);

        c[0]++;
        c[n]--;
        int a = n;

        while ((a--) > 0 && c[a] % n == 0);

        return a < 0;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka = ");
        int n = input.nextInt();
        if (prima(n))
            System.out.println(n+ " TERMASUK BILANGAN PRIMA");
        else
            System.out.println(n+ " BUKAN BILANGAN PRIMA");
    }
}