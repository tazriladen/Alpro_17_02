package ch06;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32,3};
        for (int m = 0; m < arrayAngka.length; m++){
            for (int n = 0; n < arrayAngka.length-1;n++){
                boolean urutan = arrayAngka[n] < arrayAngka[n+1];
                if (!urutan){
                    int baru = arrayAngka[n];
                    arrayAngka[n] = arrayAngka [n+1];
                    arrayAngka[n+1] = baru;
                }
            }
        }
        for (int m = 0; m < arrayAngka.length; m++){
            System.out.println(arrayAngka[m]);
        }
    }
}