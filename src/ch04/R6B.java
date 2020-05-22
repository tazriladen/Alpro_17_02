package ch04;

import java.util.Scanner;
public class R6B {
    public static void main(String[] args) {
        int [] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32,3};
      Scanner x = new Scanner(System.in);
        System.out.println("Masukkan Angka");
        int a = x.nextInt();
        boolean angka = false;



        for (int i= 0;i<arrayAngka.length; i++){

            if (a == arrayAngka[i]){
                angka = true;

                System.out.println("Angka " + a + " ADA di Dalam Array" +
                        "\n Terletak pada index "+ i);
                break; }
        }
        if (angka == false)
            {
            System.out.println("Angka " + a + " TIDAK ADA di Dalam Array");
        }

        }

    }