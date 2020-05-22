package ch04;

public class R6N {
	public static void main(String[] args) {
    int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    int jumlah = 0;

    System.out.println("Penjumlahan angka di dalam array\ndengan angka sebelumnya");

    for (int i = 0; i < arrayAngka.length; i++) {

        System.out.print(jumlah + " + " + arrayAngka[i] + " = ");

        System.out.println(arrayAngka[i] + jumlah);

        jumlah = jumlah + arrayAngka[i];

        }
    }
}