package ch04;

public class R6L {
    public static void main(String[] args) {
        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Penjumlahan yang menghasilkan angka genap");

        for (int i = 0; i < arrayAngka.length; i++) {
            if (i+1 < arrayAngka.length) {
                int jumlah = arrayAngka[i] + arrayAngka[i + 1];
                if (jumlah % 2 == 0 ) {

                    System.out.println(arrayAngka[i]+" + "+arrayAngka[i+1]+" = "+jumlah);
                }
            }
            }

    }
 }