package ch06;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int m = 0; m < arrayAngka.length; m++) {
            int urutan = arrayAngka [m];
            int n = m-1;

            while (n >= 0 && arrayAngka[n] > urutan) {
                arrayAngka [n+1] = arrayAngka[n];
                arrayAngka[n] = urutan;
                n = n-1;
            }
        }
        for (int m = 0; m < arrayAngka.length; m++) {
            System.out.println(arrayAngka[m]);
        }
    }
}