package ch04;

import java.util.Arrays;

public class R6M {
    public static void main(String[] args) {
        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int nilai = 0;

        for (int i = 0; i < arrayAngka.length; i++) {
            if (i < arrayAngka[i]) {
                int selisih = arrayAngka[i] - arrayAngka[i + 1];

                nilai = nilai + selisih;
                }
            }
        System.out.println(nilai);
        }
}