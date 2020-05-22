package ch04;

public class R6H {
    public static void main(String[] args) {
        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int i = 0;
        for (int x : arrayAngka){
            i = i + x;
        }
        System.out.println( "Jumlah Seluruh Angka di Dalam Array adalah \n"+i);

    }
}