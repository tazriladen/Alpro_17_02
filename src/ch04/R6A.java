package ch04;

import java.util.Arrays;

public class R6A {
    public static void main(String[] args) {
        int [] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32,3};
        System.out.print(Arrays.toString(arrayAngka));

        System.out.println(" ");

        //Cara kedua

        for (int i =0; i < arrayAngka.length;i++){
            System.out.print(arrayAngka[i]+", ");
        }

    }
}