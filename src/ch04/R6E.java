package ch04;
import java.util.*;

public class R6E{
    public static void main(String[] args) {
        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Element yang memiliki angka 2 ");
        System.out.println();
        for (int i  = 0; i < arrayAngka.length; i++){
            if (arrayAngka[i] % 10 == 2 || arrayAngka[i] / 10 == 2) {
                System.out.println(arrayAngka[i] );
            }
        }
    }
}