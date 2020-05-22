package ch04;

import java.util.Arrays;

public class R6F {
    public static void main(String[] args) {
        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Bilangan Ganjil yang diapit oleh genap");

        for (int i = 0; i < arrayAngka.length-1; i++){
            if (arrayAngka[i] %2 == 1){
                System.out.println(arrayAngka[i]);
            }
        }
    }
}