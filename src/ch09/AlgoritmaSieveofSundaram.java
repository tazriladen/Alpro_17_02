package ch09;

import java.util.Arrays;
import java.util.Scanner;

public class AlgoritmaSieveofSundaram {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Masukkan batas angka yang dicari = ");
        int angka = Input.nextInt();
        int n = (angka - 2) / 2;

        boolean prima[] = new boolean[n + 1];
        Arrays.fill(prima, false);
        for (int a = 1; a <= n; a++)
            for (int b = a; (a + b + 2 * a * b) <= n; b++)
                prima[a + b + 2 * a * b] = true;

        
        if (angka > 2)
            System.out.print(2 + " ");
        for (int a = 1; a <= n; a++)
            if (prima[a] == false)
                System.out.print(2 * a + 1 + " ");

    }

}