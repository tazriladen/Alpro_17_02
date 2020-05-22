package ch06;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for (int m = 0; m < arrayAngka.length-1; m++){
            int terkecil = m;
            for (int n = m+1; n < arrayAngka.length; n++){
                if (arrayAngka[n] < arrayAngka[terkecil]){
                    terkecil = n;
                    int urutan = arrayAngka[terkecil];
                    arrayAngka[terkecil] = arrayAngka [m];
                    arrayAngka[m] = urutan;
                }
            }
        }
        for (int m = 0; m < arrayAngka.length; m++){
            System.out.println(arrayAngka[m]);
        }
    }
}