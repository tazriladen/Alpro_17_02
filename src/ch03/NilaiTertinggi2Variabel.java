package ch03;

import java.util.Scanner;

public class NilaiTertinggi2Variabel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai X = ");
        int x =  input.nextInt();
        System.out.println("Nilai Y = ");
        int y = input.nextInt();

        if (x > y){
            System.out.println("X lebih besar dari Y");
        }
        else {
            System.out.println("Y lebih besar dari X");
        }
    }
}