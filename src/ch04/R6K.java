package ch04;

import java.util.Arrays;

public class R6K {
    public static void main(String[] args) {
        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Angka yang Bernilai lebih Besar dari Angka Sebelumnya");
        for (int i = 1; i < arrayAngka.length; i++){
            if ( arrayAngka[i] > arrayAngka[i-1]){
                System.out.print(arrayAngka[i] + " ");
            }
        }
        System.out.println();
        System.out.println();

        //Ada 2 jawaban dari soal Responsi 6 K

        System.out.println("Diurutkan dari Kecil ke Besar");
        Arrays.sort(arrayAngka);
        System.out.println(Arrays.toString(arrayAngka));
    }
}