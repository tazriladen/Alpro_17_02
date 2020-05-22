package ch05;

public class AlgoritmaKadane {
    public static void main(String[] args) {

        int [] arrayAngka = {2,-9,-4,5,-5,8,-4};


        int kadane = 0;
        int max = 0;
        for (int jumlah : arrayAngka) {
            int i = Integer.parseInt(String.valueOf(jumlah));

            max = Math.max(0, max + i);
            kadane = Math.max(kadane, max);
        }
        System.out.println("Maksimum subarray = " +kadane);


    }
}