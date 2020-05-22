package ch05;

import java.util.Scanner;

public class AlgoritmaEuclidean {
    public static void main(String[] args) {
        Scanner euclid = new Scanner(System.in);
        System.out.print("Nilai m = ");
        int m = euclid.nextInt();
        System.out.print("Nilai n = ");
        int n = euclid.nextInt();
        boolean fpb;

        while (m < n){
            System.out.print("Nilai m harus > n, masukkan nilai kembali \nNilai m = ");
            m = euclid.nextInt();
            System.out.print("Nilai n = ");
            n = euclid.nextInt();

        }

        int r = m % n;
        while (r != 0){
            m = n;
            n = r;
            r = m % r;
        }
        System.out.println("PBB / FPB = "+n);
    }
}